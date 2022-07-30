package devmindJava.P1.SistemDeGestiuneInscrieri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GuestList {
    private Guest theGuest;
    //numar de locuri disponibile - total - ocupate


    //String[][] myGuestsList = new String[74][4];
    ArrayList<String> guestArrayList = new ArrayList<String>(4);
    ArrayList<ArrayList<String>> myGuestsArrayList = new ArrayList<>(3);

    public GuestList(Guest theGuest){
        this.theGuest = theGuest;
    }




    // 1. adaugare persoana noua
    public void addPerson(){
        guestArrayList.add(0, theGuest.getLastName());
        guestArrayList.add(1, theGuest.getFirstName());
        guestArrayList.add(2, theGuest.getEmail());
        guestArrayList.add(3, theGuest.getTelephoneNumber());
        myGuestsArrayList.add(guestArrayList);

    }

        // verificare persoana in lista

    public void checkPerson(){
        myGuestsArrayList.contains()
        //verificare persoane


        //persoana deja inscrisa


        if(checkPerson() exist){
            return -1;
        }


        //confirmare lista de asteptare
        System.out.println("Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");


        if(checkPerson() primeste loc la eveniment){
            return 0;
        }

        //lista de asteptare
        System.out.println("Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine " + myGuestsList.indexOf()+ ". Te vom notifica daca un loc devine disponibil");

        if(checkPerson() este pe lista de asteptare){
            return myGuestsList.indexOf();
        }
    }

    //2. persoana este/nu este inscrisa la eveniment



    //3. eliminarea unei persoane (inscrise)
        //a. cautare implementata anterior
    return true; // persoana a fost stearsa cu succes


    return false; // eroare:persoana nu era inscrisa

    if(true){
        arrayListAsteptare[0] == arrayListConfirmate[myGuestsList.lastIndexOf()];
        System.out.println("Felicitari! Locul tau la eveniment a fost cedat de catre o persoana si este confirmat. Te asteptam!");
    }


    //lista participanti

    //numar locuri ocupate


    //persoane aflate in asteptare
    //4. Actualizarea detaliilor unei persoane inscrise

    //print numar locuri disponibile

    public void printLocuriDisponibile(){

        if()

        String locuriDisponibile = "Bun venit! Numarul de locuri disponibile la evenimentul mult asteptat al Academiei DevMind este $d";
    }




}
