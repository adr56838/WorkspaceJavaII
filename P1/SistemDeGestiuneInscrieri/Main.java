package devmindJava.P1.SistemDeGestiuneInscrieri;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void printMenu() {
        System.out.println("\nadd          - Adauga o noua persoana(inscriere)" +
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
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Bun venit! Tastati \" help \" pentru a Afisa lista de comenzi: ");
        String comanda = sc.nextLine();

        do{
            if(comanda.equals("help")) {
                printMenu();
            } else {
                System.out.println("Nu ati tastat corect \"help\"!");
                System.out.println("Introduceti din nou comanda \"help\"");
                comanda = sc.nextLine();
                printMenu();
            }
        }while(comanda.equals("help"));


        do {

            comanda = sc.nextLine();
            comanda = comanda.toLowerCase();

            switch (comanda) {
                case "add":
                    GuestList.addPerson();//cum fac aceasta delegare pentru a apela metoda din GuestList?

                    //help
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();

                case "check":
                    //GuestList.check;
                    //help
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();

                case "remove":


                    //help
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();

                case "update":

                    //help
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();

                case "guests":
                    System.out.println(GuestList.guests);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();

                case "waitlist":
                    System.out.println(GuestList.waitlist);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();

                case "available":
                    System.out.println(GuestList.available);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();

                case "guests_no":
                    System.out.println(GuestList.guests_no);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();

                case "waitlist_no":
                    System.out.println(GuestList.waitlist_no);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                case "subscribe_no":

                    System.out.println(GuestList.subscribe_no);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                case "search":

                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                case "quit":
                    System.out.println("Aplicatia se inchide...");

                default:
                    System.out.println("Ai introdus o comanda gresita");
                    printMenu();
            }
        } while (!comanda.equals("quit"));
    }
}

