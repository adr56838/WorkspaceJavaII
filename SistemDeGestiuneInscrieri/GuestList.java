package devmindJava.P1.SistemDeGestiuneInscrieri;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestList {

    Scanner sc = new Scanner(System.in);
    private Guest theGuest;
    private final int nrLocuri;

    ArrayList<Guest> myGuestsArrayList = new ArrayList<>();
    ArrayList<Guest> waitingGuestsArrayList = new ArrayList<>();

    public GuestList(Guest theGuest, int nrLocuri) {
        this.theGuest = theGuest;
        this.nrLocuri = nrLocuri;
    }

    // ------- Add guest method -------
    public int addPerson(Guest guest) {

        if (!myGuestsArrayList.contains(guest) && myGuestsArrayList.size() < nrLocuri) {
            myGuestsArrayList.add(guest);
            System.out.println("[" + guest.getLastName() + " " + guest.getFirstName() + "] Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
            return 0;
        } else if (!myGuestsArrayList.contains(guest) && myGuestsArrayList.size() >= nrLocuri) {
            waitingGuestsArrayList.add(guest);
            int X = waitingGuestsArrayList.indexOf(guest) + 1;
            System.out.println("[" + guest.getLastName() + " " + guest.getFirstName() + "] Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine " + X + ". Te vom notifica daca un loc devine disponibil");
            return X;
        } else {
            System.out.println("Participantul exista deja in lista de invitati");

            return -1;
        }
    }


    // ------- Check methods via contact details -------
    public int checkByName(String lastName, String firstName) {
        for (Guest guest : myGuestsArrayList) {
            if (guest.getLastName().equals(lastName) && guest.getFirstName().equals(firstName)) {
                System.out.println("Persoana se afla in lista de participanti");
                return 1;
            }
        }
        for (Guest guest : waitingGuestsArrayList) {
            if (guest.getLastName().equals(lastName) && guest.getFirstName().equals(firstName)) {
                System.out.println("Persoana se afla in lista de asteptare");
                return 2;
            }
        }
        return 0;
    }

    public int checkByEmail(String email) {
        for (Guest guest : myGuestsArrayList) {
            if (guest.getEmail().equals(email)) {
                return 1;
            }
        }
        for (Guest guest : waitingGuestsArrayList) {
            if (guest.getEmail().equals(email))  {
                return 2;
            }
        }
        return 0;
    }

    public int checkByTelephone(String telephoneNumber) {
        for (Guest guest : myGuestsArrayList) {
            if (guest.getTelephoneNumber().equals(telephoneNumber)) {
                return 1;
            }
        }
        for (Guest guest : waitingGuestsArrayList) {
            if (guest.getTelephoneNumber().equals(telephoneNumber))  {
                return 2;
            }
        }
        return 0;
    }

    // ------- Search methods via contact details -------
    public Guest searchByNameFirstName(String lastName, String firstName) {
        for (Guest guest : myGuestsArrayList) {
            if (guest.getLastName().equals(lastName) && guest.getFirstName().equals(firstName)) {
                return guest;
            }
        }
        for (Guest guest : waitingGuestsArrayList) {
            if (guest.getLastName().equals(lastName) && guest.getFirstName().equals(firstName)) {
                return guest;
            }
        }
        return null;
    }

    public Guest searchByEmail(String email) {
        for (Guest guest : myGuestsArrayList) {
            if (guest.getEmail().equals(email)) {
                return guest;
            }
        }
        for (Guest guest : waitingGuestsArrayList) {
            if (guest.getEmail().equals(email)) {
                return guest;
            }
        }
        return null;
    }

    public Guest searchByTelephoneNr(String telephoneNumber) {
        for (Guest guest : myGuestsArrayList) {
            if (guest.getTelephoneNumber().equals(telephoneNumber)) {
                return guest;
            }
        }
        for (Guest guest : waitingGuestsArrayList) {
            if (guest.getTelephoneNumber().equals(telephoneNumber)) {
                return guest;
            }
        }
        return null;
    }

    // ------- Remove guest methods using different contact details -------
    public boolean removeByName(String lastName, String firstName){
        for(Guest guest : myGuestsArrayList){
            if(guest.getLastName().equals(lastName) && guest.getFirstName().equals(firstName)){
                myGuestsArrayList.remove(guest);
                System.out.println("Stergerea persoanei s-a realizat cu succes");
                if(waitingGuestsArrayList.size() > 0){
                    myGuestsArrayList.add(waitingGuestsArrayList.get(0));
                    waitingGuestsArrayList.remove(0);
                }
                return true;
            }
        }
        for( Guest guest : waitingGuestsArrayList){
            if(guest.getLastName().equals(lastName) && guest.getFirstName().equals(firstName)){
                if(checkByName(guest.getLastName(), guest.getFirstName()) == 2 && waitingGuestsArrayList.size() > 0){
                    waitingGuestsArrayList.remove(guest);
                    System.out.println("Stergerea persoanei s-a realizat cu succes");
                    return true;
                }
            }
        }
        if(checkByName(lastName, firstName) == 0){
            System.out.println("Eroare: Persoana nu este inscrisa la eveniment");
        }
        return false;
    }

    public boolean removeByEmail(String email){
        for(Guest guest : myGuestsArrayList){
            if(guest.getEmail().equals(email)){
                myGuestsArrayList.remove(guest);
                System.out.println("Stergerea persoanei s-a realizat cu succes");
                if(waitingGuestsArrayList.size() > 0){
                    myGuestsArrayList.add(waitingGuestsArrayList.get(0));
                    waitingGuestsArrayList.remove(0);
                }
                return true;
            }
        }
        for( Guest guest : waitingGuestsArrayList){
            if(guest.getEmail().equals(email)){
                if(checkByEmail(guest.getEmail()) == 2 && waitingGuestsArrayList.size() > 0){
                    waitingGuestsArrayList.remove(guest);
                    System.out.println("Stergerea persoanei s-a realizat cu succes");
                    return true;
                }
            }
        }
        if(checkByEmail(email) == 0){
            System.out.println("Eroare: Persoana nu este inscrisa la eveniment");
        }
        return false;
    }

    public boolean removeByTelephoneNr(String telephoneNumber){
        for(Guest guest : myGuestsArrayList){
            if(guest.getTelephoneNumber().equals(telephoneNumber)){
                myGuestsArrayList.remove(guest);
                System.out.println("Stergerea persoanei s-a realizat cu succes");
                if(waitingGuestsArrayList.size() > 0){
                    myGuestsArrayList.add(waitingGuestsArrayList.get(0));
                    waitingGuestsArrayList.remove(0);
                }
                return true;
            }
        }
        for( Guest guest : waitingGuestsArrayList){
            if(guest.getTelephoneNumber().equals(telephoneNumber)){
                if(checkByTelephone(guest.getTelephoneNumber()) == 2 && waitingGuestsArrayList.size() > 0){
                    waitingGuestsArrayList.remove(guest);
                    System.out.println("Stergerea persoanei s-a realizat cu succes");
                    return true;
                }
            }
        }
        if(checkByTelephone(telephoneNumber) == 0){
            System.out.println("Eroare: Persoana nu este inscrisa la eveniment");
        }
        return false;
    }

    // ------- Update guest contact details methods -------

    public void updateLastName(String lastName, String newLastName){
        for(Guest guest : myGuestsArrayList){
            if(guest.getLastName().equals(lastName)){
                guest.setLastName(newLastName);
            }
        }
        for(Guest guest : waitingGuestsArrayList){
            if(guest.getLastName().equals(lastName)) {
                guest.setLastName(newLastName);
            }
        }
    }

    public void updateFirstName(String firstName, String newFirstName){
        for(Guest guest : myGuestsArrayList){
            if(guest.getFirstName().equals(firstName)){
                guest.setFirstName(newFirstName);
            }
        }
        for(Guest guest : waitingGuestsArrayList){
            if(guest.getFirstName().equals(firstName)){
                guest.setFirstName(newFirstName);
            }
        }
    }

    public void updateEmail(String email, String newEmail){
        for(Guest guest : myGuestsArrayList){
            if(guest.getEmail().equals(email)){
                guest.setEmail(newEmail);
            }
        }
        for(Guest guest : waitingGuestsArrayList){
            if(guest.getEmail().equals(email)){
                guest.setEmail(newEmail);
            }
        }
    }

    public void updateTelephoneNr(String telephoneNumber, String newTelephoneNumber){
        for(Guest guest : myGuestsArrayList){
            if(guest.getTelephoneNumber().equals(telephoneNumber)){
                guest.setTelephoneNumber(newTelephoneNumber);
            }
        }
        for(Guest guest : waitingGuestsArrayList){
            if(guest.getTelephoneNumber().equals(telephoneNumber)){
                guest.setTelephoneNumber(newTelephoneNumber);
            }
        }
    }

    // ------- Guests list -------
    public void guests () {
        for (int i = 0; i < this.myGuestsArrayList.size(); i++) {
            System.out.println("" + myGuestsArrayList);
        }
        if (myGuestsArrayList.isEmpty()) {
            System.out.println("Lista de invitati este goala...");
        }
    }

    // ------- Waiting list -------
    public void waitlist () {
        for (int i = 0; i < this.waitingGuestsArrayList.size(); i++) {
            System.out.println(this.waitingGuestsArrayList.get(i));
        }
        if (waitingGuestsArrayList.isEmpty()) {
            System.out.println("Lista de asteptare este goala…");
        }
    }

    // ------- Available seats -------

    public int available () {
            return myGuestsArrayList.toArray().length - myGuestsArrayList.size();
        }

    // ------- Guests size -------
    public int guests_no () {
            return myGuestsArrayList.size();
        }

    // ------- Waiting list size -------
    public int waitlist_no () {
            return waitingGuestsArrayList.size();
        }

    // ------- Subscribe size -------
    public int subscribe_no () {
        return myGuestsArrayList.size() + waitingGuestsArrayList.size();
    }

    // ------- Search with few letters or digits -------
    public boolean search(){
        System.out.println("Introdu litere sau cifre pentru o cautare valida: ");
        String search = sc.nextLine();
        String searchPartial = search.toLowerCase();
        int i = 1;

        //Search in guests list
        for (Guest guest : myGuestsArrayList) {
           if(guest.getLastName().toLowerCase().contains(searchPartial)){
               System.out.println("Contactul " + i + " contine numele " + guest.getLastName());

           } if(guest.getFirstName().toLowerCase().contains(searchPartial)){
               System.out.println("Contactul " + i +" contine prenumele " + guest.getFirstName());

           } if(guest.getEmail().toLowerCase().contains(searchPartial)){
               System.out.println("Contactul " + i + " contine email-ul " + guest.getEmail());

           }if(guest.getTelephoneNumber().toLowerCase().contains(searchPartial)){
               System.out.println("Contactul " + i + " contine telefonul " + guest.getTelephoneNumber());
           }
           i++;
        }

        //Search in waiting list
        int j = 1;
        for (Guest guest : waitingGuestsArrayList) {
            if(guest.getLastName().toLowerCase().contains(searchPartial)){
                System.out.println("Contactul " + j + " contine numele " + guest.getLastName());

            } if(guest.getFirstName().toLowerCase().contains(searchPartial)){
                System.out.println("Contactul " + j +" contine prenumele " + guest.getFirstName());

            } if(guest.getEmail().toLowerCase().contains(searchPartial)){
                System.out.println("Contactul " + j + " contine email-ul " + guest.getEmail());

            }if(guest.getTelephoneNumber().toLowerCase().contains(searchPartial)){
                System.out.println("Contactul " + j + " contine telefonul " + guest.getTelephoneNumber());
            }
            j++;
        }
        return false;
    }
}

