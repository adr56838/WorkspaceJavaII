package devmindJava.P1.SistemDeGestiuneInscrieri;



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

    public Guest(){
    }

    public Guest(String lastName, String firstName, String email, String telephoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
    }

    @Override // for printing the guests contact details
    public String toString() {
        return "Guest[" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ']';
    }

    @Override // compare guests using equals
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Guest person = (Guest) obj;

        switch (compareType) {
            case lastNfirstNameCompareType:
                return this.lastName.equals(person.lastName) && this.firstName.equals(person.firstName);
            case emailCompareType:
                return this.email.equals(person.email);
            case telephoneNumberCompareType:
                return this.telephoneNumber.equals(person.telephoneNumber);
        }
        return false;

    }
}
