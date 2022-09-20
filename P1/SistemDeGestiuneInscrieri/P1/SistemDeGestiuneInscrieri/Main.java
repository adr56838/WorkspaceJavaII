package devmindJava.P1.SistemDeGestiuneInscrieri;

import java.util.Scanner;

public class Main {

    public static void printMenu() {
        System.out.println( "\nadd          - Adauga o noua persoana(inscriere)" +
                            "\ncheck        - Verifica daca o persoana este inscrisa la eveniment" +
                            "\nremove       - Sterge o persoana existenta din lista" +
                            "\nupdate       - Actualizeaza detaliile unei persoane" +
                            "\nguests       - Lista de persoane care participa la eveniment" +
                            "\nwaitlist     - Persoanele din lista de asteptare" +
                            "\navailable    - Numarul de locuri libere" +
                            "\nguests_no    - Numarul de persoane care participa la eveniment" +
                            "\nwaitlist_no  - Numarul de persoane din lista de asteptare" +
                            "\nsubscribe_no - Numarul total de persoane inscrise" +
                            "\nsearch       - Cauta toti invitatii conform sirului de caractere introdus" +
                            "\nquit         - Inchide aplicatia");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bun venit! Introduceti numarul de locuri disponibile: ");
        int nrLocuri = sc.nextInt();
        GuestList guests = new GuestList(new Guest(), nrLocuri);
        String comanda = "";

        while (!comanda.equals("quit")) {
            System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
            comanda = sc.next();

            switch (comanda) {
                case "help":
                    printMenu();
                    break;

                case "add":
                    System.out.println("Se adauga o noua persoana...");
                    System.out.print("Adauga nume: ");
                    String lastName = sc.next();

                    System.out.print("Adauga prenume: ");
                    String firstName = sc.next();

                    System.out.print("Adauga email(format \"denumireemail@gmail.com\": ");
                    String email = sc.next();

                    System.out.print("Adauga numar de telefon (format\"+40745111999\"): ");
                    String telephoneNumber = sc.next();
                    Guest guest = new Guest(lastName,firstName,email,telephoneNumber);

                    guests.addPerson(guest);
                    break;

                case "check":
                    System.out.println("Alege modul de autentificare, tastand: " +
                            "\n\t\"1\" - lastName si firstName" +
                            "\n\t\"2\" - email" +
                            "\n\t\"3\" - telephoneNumber");
                    int cautare = sc.nextInt();
                    switch (cautare){
                        case 1:
                            System.out.println("Introdu lastName(ex: Popescu):");
                            lastName = sc.next();
                            System.out.println("Introdu firstName(ex: Ion):");
                            firstName = sc.next();
                            guests.searchByNameFirstName(lastName,firstName);
                            break;
                        case 2:
                            System.out.println("Introdu adresa de email(ex: adrian@gmail.com:");
                            email = sc.next();
                            guests.searchByEmail(email);
                            break;
                        case 3:
                            System.out.println("Introdu numarul de telefon (ex: 0745111999):");
                            telephoneNumber = sc.next();
                            guests.searchByTelephoneNr(telephoneNumber);
                            break;
                    }
                    break;

                case "remove":
                    System.out.println("Alege modul de autentificare, tastand: " +
                            "\n\t\"1\" - lastName si firstName" +
                            "\n\t\"2\" - email" +
                            "\n\t\"3\" - telephoneNumber");
                    cautare = sc.nextInt();
                    switch (cautare){
                        case 1:
                            System.out.println("Introdu lastName(ex: Popescu):");
                            lastName = sc.next();
                            System.out.println("Introdu firstName(ex: Ion):");
                            firstName = sc.next();
                            guests.removeByName(lastName,firstName);
                            break;
                        case 2:
                            System.out.println("Introdu adresa de email(ex: adrian@gmail.com:");
                            email = sc.next();
                            guests.removeByEmail(email);
                            break;
                        case 3:
                            System.out.println("Introdu numarul de telefon (ex: 0745111999):");
                            telephoneNumber = sc.next();
                            guests.removeByTelephoneNr(telephoneNumber);
                            break;
                    }
                    break;

                case "update":
                    System.out.println("Alege modul de autentificare, tastand: " +
                            "\n\t\"1\" - lastName si firstName" +
                            "\n\t\"2\" - email" +
                            "\n\t\"3\" - telephoneNumber");
                    cautare = sc.nextInt();
                    switch (cautare) {
                        case 1:
                            System.out.println("Introdu lastName(ex: Popescu):");
                            lastName = sc.next();
                            System.out.println("Introdu firstName(ex: Ion):");
                            firstName = sc.next();
                            Guest guestByName = guests.searchByNameFirstName(lastName, firstName);
                            System.out.println("Alege campul de actualizat, tastand: " +
                                    "\n\t\"1\" - Nume" +
                                    "\n\t\"2\" - Prenume" +
                                    "\n\t\"3\" - Email" +
                                    "\n\t\"4\" - Numar de telefon(format \"+40733386462\"");
                            int actualizare = sc.nextInt();
                            switch (actualizare) {
                                case 1:
                                    System.out.print("Introduceti numele: ");
                                    lastName = sc.next();
                                    guests.updateLastName(guestByName.getLastName(), lastName);
                                    break;
                                case 2:
                                    System.out.println("Introduceti prenumele: ");
                                    firstName = sc.next();
                                    guests.updateFirstName(guestByName.getFirstName(), firstName);
                                    break;
                                case 3:
                                    System.out.println("Introduceti email: ");
                                    email = sc.next();
                                    guests.updateEmail(guestByName.getEmail(), email);
                                    break;
                                case 4:
                                    System.out.println("Introduceti telephoneNumber: ");
                                    telephoneNumber = sc.next();
                                    guests.updateTelephoneNr(guestByName.getTelephoneNumber(), telephoneNumber);
                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("Introdu adresa de email(ex: adrian@gmail.com:");
                            email = sc.next();
                            Guest guestByEmail = guests.searchByEmail(email);
                            System.out.println("Alege campul de actualizat, tastand: " +
                                    "\n\t\"1\" - Nume" +
                                    "\n\t\"2\" - Prenume" +
                                    "\n\t\"3\" - Email" +
                                    "\n\t\"4\" - Numar de telefon(format \"+40733386462\"");
                            actualizare = sc.nextInt();
                            switch (actualizare) {
                                case 1:
                                    System.out.print("Introduceti numele: ");
                                    lastName = sc.next();
                                    guests.updateLastName(guestByEmail.getLastName(), lastName);
                                    break;
                                case 2:
                                    System.out.println("Introduceti prenumele: ");
                                    firstName = sc.next();
                                    guests.updateFirstName(guestByEmail.getFirstName(), firstName);
                                    break;
                                case 3:
                                    System.out.println("Introduceti email: ");
                                    email = sc.next();
                                    guests.updateEmail(guestByEmail.getEmail(), email);
                                    break;
                                case 4:
                                    System.out.println("Introduceti telephoneNumber: ");
                                    telephoneNumber = sc.next();
                                    guests.updateTelephoneNr(guestByEmail.getTelephoneNumber(), telephoneNumber);
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("Introdu numarul de telefon (ex: 0745111999):");
                            telephoneNumber = sc.next();
                            Guest guestByTelephoneNumber = guests.searchByTelephoneNr(telephoneNumber);
                            System.out.println("Alege campul de actualizat, tastand: " +
                                    "\n\t\"1\" - Nume" +
                                    "\n\t\"2\" - Prenume" +
                                    "\n\t\"3\" - Email" +
                                    "\n\t\"4\" - Numar de telefon(format \"+40733386462\"");
                            actualizare = sc.nextInt();
                            switch (actualizare) {
                                case 1:
                                    System.out.print("Introduceti numele: ");
                                    lastName = sc.next();
                                    guests.updateLastName(guestByTelephoneNumber.getLastName(), lastName);
                                    break;
                                case 2:
                                    System.out.println("Introduceti prenumele: ");
                                    firstName = sc.next();
                                    guests.updateFirstName(guestByTelephoneNumber.getFirstName(), firstName);
                                    break;
                                case 3:
                                    System.out.println("Introduceti email: ");
                                    email = sc.next();
                                    guests.updateEmail(guestByTelephoneNumber.getEmail(), email);
                                    break;
                                case 4:
                                    System.out.println("Introduceti telephoneNumber: ");
                                    telephoneNumber = sc.next();
                                    guests.updateTelephoneNr(guestByTelephoneNumber.getTelephoneNumber(), telephoneNumber);
                                    break;
                            }
                            break;
                    }

                case "guests":
                    guests.guests();
                    break;

                case "waitlist":
                    guests.waitlist();
                    break;

                case "available":
                    System.out.println("Numarul de locuri ramase: " + guests.available());
                    break;

                case "guests_no":
                    System.out.println("Numarul de participanti: " + guests.guests_no());
                    break;

                case "waitlist_no":
                    System.out.println("Dimensiunea listei de asteptare este: " + guests.waitlist_no());
                    break;

                case "subscribe_no":
                    System.out.println("Lista totala de participanti este: " + (guests.subscribe_no()));
                    break;

                case "search":
                    guests.search();
                    break;

                case "quit":
                    System.out.println("Aplicatia se inchide...");
                    break;

                default:
                    System.out.println("Ai introdus o comanda gresita");
                    printMenu();
            }

        }
    }
}

