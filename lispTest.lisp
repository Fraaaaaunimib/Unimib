;; FILEPATH: /workspaces/Unimib/lispTest.lisp
;; operazioni su liste

(defun sum (l)
    (if (null l)
        0
            (+ (first l) (sum (rest l)))))
; calcola la somma degli elementi di una lista l
; se la lista è vuota restituisce 0
; altrimenti somma il primao elemento della lista con la chiamata ricorsiva su rest

(defun llength (l)
    if (null l)
        0
        (+ 1 (llength (rest l))))
; calcola la lunghezza di una lista l
; se la lista è vuota restituisce 0
; altrimenti restituisce 1 più la lunghezza del resto della lista

(defun last-l (l)
    cond ((null l) nil
        ((atom l)
        (error "The argument is not a proper list."))
        ((null (rest l)) (first l))
        (t (last-l (rest l)))))
; restituisce l'ultimo elemento di una lista l
; se la lista è vuota restituisce nil
; se l'elemento non è una lista ben formata, genera un errore
; se la lista ha un solo elemento, restituisce il primo elemento
; altrimenti richiama la funzione ricorsivamente sul resto della lista

(defun count-atoms (x)
    (cond ((null x) 0)
        ((atom x) 1)
        (T (+ (count-atoms (first x))
            (count-atoms (rest x))))))
; conta il numero di atomi in una lista x
; se la lista è vuota restituisce 0
; se l'elemento è un atomo restituisce 1
; altrimenti, somma il risultato della chiamata ricorsiva su first e rest della lista

(defun depth (x)
    cond ((null x) 1)
         ((atom x) 0)
         (t (max (+1 (depth (first x)))
         (depth (rest x)))))
; calcola la profondità di una lista x
; se l'elemento è vuoto restituisce 1
; se l'elemento è un atomo restituisce 0
; altrimenti restituisce il massimo tra la profondità del primo elemento più 1, e la profondità del resto della lista
    
(defun flatten (x)
    (cond ((null x) x
          ((atom x) (list x))
          (T (append (flatten (first x))
                     (flatten (rest x)))))))
; appiattisce una lista annidata in una lista piatta
; se la lista è vuota restituisce la lista vuota
; se l'elemento è un atomo, restituisce una lista contenente quell'atomo
; altrimenti usa append per unire i risultati delle chiamate ricorsive su first e rest della lista

(defun mirror (x) ; 'x' is a Sexp
    if (atom x)
        x
            (append (mirror (rest x))
                    (list (mirror (first x)))))
; restituisce la lista speculare di una lista x
; se l'elemento è un atomo restituisce l'atomo
; altrimenti appende il risultato delle chiamate ricorsive su rest e first

(defun circulate (lst direction)
    (cond ((atom lst) lst)
            ((null lst) nil)
            
            ((eq direction 'left)
                (append (cdr lst) (list (car lst))))
                ((eq direction 'right)
                    (cons (last-l lst) (but-last lst)))
                    (T lst)))
; ruota gli elementi di una lista in base alla direzione specificata 'left o 'right
; se l'elemento è un atomo o la lista è vuota, restituisce l'elemento stesso o nil
; per la rotazione a sinistra usa cdr e car. per la rotazione a destra, usa cons, last-l e but-last