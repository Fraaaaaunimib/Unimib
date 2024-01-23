; nopred: predicato-lista, restituisce come valore la lista data come argomento senza gli atomi che soddisfano il predicato

(defun nopred (pred lista)
    (cond ((null lista) nil)
          ((atom lista)
            (if (funcall pred lista) nil lista)
          )
          (t (cons (nopred pred (car lista))
                     (nopred pred (cdr lista))
               )
          )
    )
)

; scrivere uno equivalente a questo che utilizzi una lambda expression
(defun f (x y)
  ((lambda (a b)
           (+ (* x a) 
              (* y (* b b)) 
              (* a b)
           )
   )
           (+ x (* x y))
           (* 4 y)
  )
)


; definizione di cons-cell: struttura base che rappresenta una coppia di elementi, usata per costruire liste. due parti: car (primo elemento) e cdr (secondo elemento)
;(a ((b) c) ((d)) e)

;+---+---+    +---+---+    +---+---+
;| a | --+--->| --+-- | --+--->| --+-- | --+--->| e |NIL|
;+---+---+    +---+---+    +---+---+    +---+---+
;             |    |                   |    |
;             v    v                   v    v
;           +---+---+    +---+---+    +---+---+
;           | --+-- | --+--->| c |NIL| | --+-- |NIL|
;           +---+---+    +---+---+    +---+---+
;             |                         |
;             v                         v
;           +---+---+                +---+---+
;           | b |NIL|                | d |NIL|
;           +---+---+                +---+---+

; definire aggiungil che ha per argomento una lista e restituisce la lista con lo stetsso numero di elementi ottenuta agigungendo un'unità a soli atomi numerici dispari
(defun aggiungil (l)
  (mapcar (lambda (x)
          (cond ((and (numberp x) (oddp x)) (+ x 1))
                ((listp x) (aggiungil x))
                (t x)))
          l
  )
)

(defun per-due (l)
  (mapcar (lambda (x)
          (cond ((and (numberp x) (oddp x)) (* x 2))
                ((listp x) (aggiungil x))
                (t x)))
          l
  )
)

(defun what (l1 l2)
  (cond 
    ((null l1) 0)
    ((null l2) 0)
    ((memberp (car l1) l2) (add 1 (what (cdr l1) l2)))
    (T (what (cdr l1) l2))
)
)

; (2 3 4) (3 7)
; se il primo elemento è anche in l2, allora salva quante occorrenze di l1 ci sono in l2 (memberp)
; altrimenti continua a a scorrere l1