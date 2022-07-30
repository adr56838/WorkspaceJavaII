package devmindJava.P1.SistemDeGestiuneInscrieri;

import java.util.Locale;
import java.util.Scanner;

public class Guest {
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    private String lastName, firstName;
    private String email;
    private String telephoneNumber;

    public static int compareType;
    public static final int lastNfirstNameCompareType = 1;
    public static final int emailCompareType = 2;
    public static final int telephoneNumberCompareType = 3;


    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }

        if(this.getClass() != obj.getClass()){
            return false;
        }

        Guest person = (Guest)obj;

        //normal switch
       /* switch (compareType){
            case lastNfirstNameCompareType:
                return this.lastName.equals(person.lastName) && this.firstName.equals(person.firstName);
            case emailCompareType:
                return this.email.equals(person.email);
            case telephoneNumberCompareType:
                return this.telephoneNumber.equals(person.telephoneNumber);
        }
        return false;

        */
        //enhanced switch
        return switch (compareType) {
            case lastNfirstNameCompareType -> this.lastName.equals(person.lastName) && this.firstName.equals(person.firstName);
            case emailCompareType -> this.email.equals(person.email);
            case telephoneNumberCompareType -> this.telephoneNumber.equals(person.telephoneNumber);
            default -> false;
        };
    }

    public static void printMenu(){
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
    // creez constructor cu last first sau doar nume(last first)
    public Guest(String lastName, String firstName, String email, String telephoneNumber){
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
    }





}
