% Definizione della classe
:- dynamic(classe/2).

% Predicato per creare una nuova istanza della classe
crea_istanza(NomeClasse, Istanza) :-
    assertz(classe(NomeClasse, Istanza)).

% Predicato per ottenere tutte le istanze di una classe
istanze_classe(NomeClasse, Istanze) :-
    findall(Istanza, classe(NomeClasse, Istanza), Istanze).

% Esempio di utilizzo
:- crea_istanza(mia_classe, istanza1).
:- crea_istanza(mia_classe, istanza2).
:- istanze_classe(mia_classe, Istanze).
