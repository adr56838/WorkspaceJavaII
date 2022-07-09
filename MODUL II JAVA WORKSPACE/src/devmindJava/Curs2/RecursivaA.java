package devmindJava.Curs2;

public class RecursivaA {
    public static int reverse(int numar) {
        if (numar < 10) {
            System.out.println("Numar = " + numar);
            return numar;
        }

        int result = reverse(numar / 10);
        System.out.println("result = " + result);
        int cifra = numar % 10;
        System.out.println("cifra = " + cifra);
        int numarZerouri = 1;
        while (numar >= 10) {
            numarZerouri = numarZerouri * 10;
            numar = numar / 10;
        }
        System.out.println("Numar zerouri = " + numarZerouri);
        result = cifra * numarZerouri + result;
        return result;
    }

    public static void main(String[] args){
        System.out.println(reverse(74758));
    }


}
