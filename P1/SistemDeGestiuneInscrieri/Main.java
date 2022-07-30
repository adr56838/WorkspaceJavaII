package devmindJava.P1.SistemDeGestiuneInscrieri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bun venit! Tastati \" help \" pentru a Afisa lista de comenzi: " );
        String menu = sc.nextLine();
       // Guest.printMenu();

        public String listaComenzi(Guest invitat){
            String comanda = "";
            comanda = comanda.toLowerCase();

            do {
                if (comanda.equals("quit")) {
                    System.out.println("Aplicatia se inchide...");
                }
                Scanner sc = null;
                int cautare = 0;
                int actualizare = 0;
                String searchPartial = "";
                searchPartial = searchPartial.toLowerCase();



                if(comanda.equals("help")){
                    Guest.printMenu();
                }
                //ADD
                else if (comanda.equals("add")) {
                    System.out.println("Se adauga o persoana...");
                    sc = new Scanner(System.in);
                    System.out.print("Adauga nume: ");
                    lastName = sc.nextLine();
                    System.out.print("Adauga prenume: ");
                    firstName = sc.nextLine();
                    System.out.print("Adauga email(format \"denumireemail@gmail.com\": ");
                    email = sc.nextLine();
                    System.out.print("Adauga numar de telefon (format\"+40745111999\"): ");
                    telephoneNumber = sc.nextLine();

                    Guest guest = new Guest(lastName, firstName, email, telephoneNumber);

                    //help
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                    // deleaga metoda de adaugare persoana 1.

                    //CHECK
                } else if (comanda.equals("check")) {
                    System.out.println("Alege modul de autentificare, tastand: " +
                            "\n\t\"1\" - lastName si firstName" +
                            "\n\t\"2\" - email" +
                            "\n\t\"3\" - telephoneNumber");
                    cautare = sc.nextInt();
                    if(cautare == 1){
                        System.out.println("Introdu lastName si firstName(ex: Popescu Ion):");
                        check(name); // se va face verificarea dupa NUME conform metodei din guestList
                    } else if(cautare == 2){
                        System.out.println("Introdu adresa de email(ex: adrian@gmail.com:");
                        check(email);// se va face verificarea dupa EMAIL conform metodei din guestList
                    }else if (cautare == 3){
                        System.out.println("Introdu numarul de telefon (ex: 0745111999):");
                        check(telephoneNumber)//// se va face verificarea dupa TELEFON conform metodei din guestList
                    } else {
                        System.out.println("Ai introdus un numar gresit! ");
                        Guest.printMenu();
                        System.out.println("-->Introdu din nou comanda \"check\" pentru a relua procesul de verificare: ");

                    }
                    //help
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                }

                //REMMOVE
                if(comanda.equals("remove")){
                    comanda.equals("check"); //apeleaza meniul check

                    //help
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                }

                //UPDATE
                if(comanda.equals("update")){
                    comanda.equals("check");
                    System.out.println("Alege campul de actualizat, tastand: " +
                            "\n\t\"1\" - Nume" +
                            "\n\t\"2\" - Prenume" +
                            "\n\t\"3\" - Email" +
                            "\n\t\"4\" - Numar de telefon(format \"+40733386462\"");
                    actualizare = sc.nextInt();
                    if(actualizare == 1){
                        System.out.println("Introduceti numele de familie:");
                    } else if (actualizare == 2){
                        System.out.println("Introduceti prenumele:");
                    } else if (actualizare == 3){
                        System.out.println("Introduceti email:");
                    } else if (actualizare == 4){
                        System.out.println("Introduceti numarul de telefon:");
                    } else {
                        System.out.println("Eroare: Ati introdus un numar gresit");
                        comanda.equals("update");
                    }
                    //help
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                }

                //GUESTS
                if(comanda.equals("guests")){
                    System.out.println(GuestList.guests);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                }

                //WAITLIST
                if(comanda.equals("waitlist")){
                    System.out.println(GuestList.waitlist);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                }

                //AVAILABLE
                if(comanda.equals("available")){
                    System.out.println(GuestList.available);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                }

                //GUEST_NO
                if(comanda.equals("guests_no")){
                    System.out.println(GuestList.guests_no);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                }

                //WAITLIST_NO
                if(comanda.equals("waitlist_no")){
                    System.out.println(GuestList.waitlist_no);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                }

                //SUBSCRIBE_NO
                if(comanda.equals("subscribe_no")){
                    System.out.println(GuestList.subscribe_no);
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                }

                //SEARCH
                if(comanda.equals("search")){
                    System.out.println("Introdu minim 3 litere sau cifre pentru o cautare valida: ");
                    searchPartial = sc.nextLine();
                    // searchPartial = searchPartial.toLowerCase();

                    if(GuestList.search){
                        System.out.println(GuestList.search);
                    }else{
                        System.out.println(!GuestList.search);
                        System.out.println("Nu exista nimeni cu aceste criterii \"" + searchPartial + "\" !");
                    }
                    System.out.println("Asteapta comanda: (help - Afiseaza lista de comenzi)");
                    comanda = sc.nextLine();
                }


            }while(!comanda.equals("quit"));
            return comanda;
        }






    }
}
