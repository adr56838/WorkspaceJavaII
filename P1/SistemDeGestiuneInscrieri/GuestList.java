package devmindJava.P1.SistemDeGestiuneInscrieri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GuestList {

    Scanner sc = new Scanner(System.in);
    private Guest theGuest;
    private int cautare = 0;
    private int campDeActualizat = 0;
    private String actualizare = "";
    private String searchPartial = "";
    private int autentificare = 0;


    ArrayList<String> guestArrayList = new ArrayList<>(4);//trebuie sa fie ArrayList de Guest nu de String?
    ArrayList<ArrayList<String>> myGuestsArrayList = new ArrayList<>(3);

    ArrayList<ArrayList<String>> waitingGuestsArrayList = new ArrayList<>();

    public GuestList(Guest theGuest) {
        this.theGuest = theGuest;
    }


    private int nrListaAsteptare = 0;

    // 1. adaugare persoana noua
    public int addPerson() {
        //adaugare caracteristici
        System.out.println("Se adauga o persoana...");
        System.out.print("Adauga nume: ");
        String lastName = sc.nextLine();
        guestArrayList.add(0, lastName);
        System.out.print("Adauga prenume: ");
        String firstName = sc.nextLine();
        guestArrayList.add(1, firstName);
        System.out.print("Adauga email(format \"denumireemail@gmail.com\": ");
        String email = sc.nextLine();
        guestArrayList.add(2, email);
        System.out.print("Adauga numar de telefon (format\"+40745111999\"): ");
        String telephoneNumber = sc.nextLine();
        guestArrayList.add(3, telephoneNumber);

        //Creare guest
        Guest guest = new Guest(lastName, firstName, email, telephoneNumber);
        //Adaugare guest la arraylist
        guestArrayList.add(String.valueOf(guest));

        //Verificare daca exista si adaugare in lista potrivita
        for (int i = 0; i < myGuestsArrayList.size(); i++) {
            //-1 - daca persoana a fost deja inscrisa la eveniment


            if (i == myGuestsArrayList.size() - 1) {
                for (nrListaAsteptare = 0; nrListaAsteptare < waitingGuestsArrayList.size(); nrListaAsteptare++) {
                    waitingGuestsArrayList.add(guestArrayList);
                    System.out.println("Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine " + nrListaAsteptare + ". Te vom notifica daca un loc devine disponibil");

                }
                return nrListaAsteptare;
            }
            //0 - daca a primit un loc la eveniment
            myGuestsArrayList.add(guestArrayList);
            System.out.println("Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
        }
        return 0;

    }


    // verificare persoana in lista

    public int check() {
        System.out.println("Alege modul de autentificare, tastand: " +
                "\n\t\"1\" - lastName si firstName" +
                "\n\t\"2\" - email" +
                "\n\t\"3\" - telephoneNumber");
        int cautare = sc.nextInt();
        switch (cautare){
            case 1:
                System.out.println("Introdu lastName si firstName(ex: Popescu Ion):");
                actualizare = sc.nextLine();
                checkByNameFirstName(actualizare);// eu asa vad aplicatia, invitatul scrie numele, iar eu caut dupa ce scrie el, dar atunci nu stiu cum anume sa pun indexOf la metoda de cautare

            case 2:
                System.out.println("Introdu adresa de email(ex: adrian@gmail.com:");
                actualizare = sc.nextLine();
                checkByEmail(actualizare);

            case 3:
                System.out.println("Introdu numarul de telefon (ex: 0745111999):");
                actualizare = sc.nextLine();
                checkByTelephoneNr(actualizare);

            default:
                System.out.println("Ai introdus un numar gresit! ");

        }
        return cautare;
    }

        ArrayList<String> checkByNameFirstName(String guest){
        Guest.compareType = Guest.lastNfirstNameCompareType;
        int index = myGuestsArrayList.indexOf(guest);

      return myGuestsArrayList.get(index);
    }

        ArrayList<String> checkByEmail(Guest theGuest){
        Guest.compareType = Guest.emailCompareType;
        int index = myGuestsArrayList.indexOf(theGuest);

        return myGuestsArrayList.get(index);
    }

        Guest checkByTelephoneNr(Guest theGuest){
        Guest.compareType = Guest.telephoneNumberCompareType;
        int index = myGuestsArrayList.indexOf(theGuest);

        return myGuestsArrayList.get(index);
    }

//    //folosesc bine agregarea pentru metoda de comparare?
//    public boolean equals(Guest theGuest){
//        if(myGuestsArrayList.contains(this.theGuest) || waitingGuestsArrayList.equals(this.theGuest)){//Pot sa compar un Guest cu un arraylist in modul asta?
//            return true;
//        } else if(waitingGuestsArrayList.contains(theGuest)){
//            return true;
//        }
//        return false;
//    }
//    //alta incercare de metoda de comparare
//    public String checkPerson() {
//
//        if(myGuestsArrayList.contains(guestArrayList)||waitingGuestsArrayList.contains(guestArrayList))
//
//    {
//    } else if(myGuestsArrayList.contains(guestArrayList.equals(Guest.compareType)))
//
//    {
//
//    } else if(waitingGuestsArrayList.contains(this.theGuest.equals(Guest.compareType)))
//
//    {
//    }
//}


    //3. eliminarea unei persoane (inscrise)
        //a. cautare implementata anterior
    public boolean remove() {
        check();//se apeleaza metoda check() descrisa mai sus?
        if(check() == 1){


            myGuestsArrayList.remove(theGuest.equals(Guest.lastNfirstNameCompareType));// vreau sa elimin invitatul gasit - daca metoda checkByname/email/phone este valida
            myGuestsArrayList.add(waitingGuestsArrayList.get(0));
            System.out.println("Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
            return true;

        } else if (waitingGuestsArrayList.contains(Guest.compareType)) {
            waitingGuestsArrayList.remove(theGuest);
            return true;
        }
        return false;
    }

    //4. Actualizarea detaliilor unei persoane inscrise
    public void update(){
        check();
        System.out.println("Alege campul de actualizat, tastand: " +
                "\n\t\"1\" - Nume" +
                "\n\t\"2\" - Prenume" +
                "\n\t\"3\" - Email" +
                "\n\t\"4\" - Numar de telefon(format \"+40733386462\"");
        campDeActualizat = sc.nextInt();
        switch (campDeActualizat){
            case 1:
            System.out.println("Introduceti numele de familie:");
            actualizare = sc.nextLine();
            theGuest.setLastName(actualizare);

            case 2:
            System.out.println("Introduceti prenumele:");
            actualizare = sc.nextLine();
            theGuest.setFirstName(actualizare);

            case 3:
            System.out.println("Introduceti email:");
            actualizare = sc.nextLine();
            theGuest.setEmail(actualizare);

            case 4:
            System.out.println("Introduceti numarul de telefon:");
            actualizare = sc.nextLine();
            theGuest.setTelephoneNumber(actualizare);

            default:
            System.out.println("Eroare: Ati introdus un numar gresit");
        }

    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int i =0;i<myGuestsArrayList.size();i++){
            for(int j = 0;j<myGuestsArrayList.get(i).size();j++){
                result.append(myGuestsArrayList.get(i).get(j));
            }
            result.append(System.lineSeparator());
        }
        return result.toString();
    }

    //4. guests - Lista de persoane care participa la eveniment
    public void guests(){
        System.out.println(myGuestsArrayList);

    }

    //5.waitlist     - Persoanele din lista de asteptare
    public void waitlist(){
        System.out.println(waitingGuestsArrayList);

    }

    //6. available    - Numarul de locuri libere

    public int available(){
        return myGuestsArrayList.size()-myGuestsArrayList.get(0).size();
    }

    //7. guests_no    - Numarul de persoane care participa la eveniment

    public int guests_no(){
        return myGuestsArrayList.get(0).size();
    }

    //8. waitlist_no  - Numarul de persoane din lista de asteptare
    public int waitlist_no(){
        return waitingGuestsArrayList.get(0).size();
    }

    //9. subscribe_no - Numarul total de persoane inscrise
    public int subscribe_no(){
        return guests_no() + waitlist_no();
    }

    //10. search       - Cauta toti invitatii conform sirului de caractere introdus
    public void search(){
        System.out.println("Introdu minim 3 litere sau cifre pentru o cautare valida: ");
        searchPartial = sc.nextLine();
        searchPartial = searchPartial.toLowerCase();

        if (GuestList.search) {
            System.out.println(GuestList.search);
        } else {
            System.out.println(!GuestList.search);
            System.out.println("Nu exista nimeni cu aceste criterii \"" + searchPartial + "\" !");
        }

    }


    public Guest getTheGuest() {
        return theGuest;
    }






}
