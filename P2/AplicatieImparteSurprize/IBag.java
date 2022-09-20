package devmindJava.P2.AplicatieImparteSurprize;

public interface IBag {
    //Adauga o supriza in bag
     void put(ISurprise newSurprise);

    //Adauga toate suprizele
     void put(IBag bagOfSuprises);

    //scoate o supriza din bag si o returneaza
     ISurprise takeout();

    //verifica daca bag-ul este gol sau nu
     boolean isEmpty();

    //returneaza numarul de surprize
     int size();
}
