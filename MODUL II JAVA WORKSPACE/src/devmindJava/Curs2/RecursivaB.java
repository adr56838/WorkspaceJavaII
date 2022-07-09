package devmindJava.Curs2;

public class RecursivaB {
    public static int recursivB (int numar, int putere){
        if(putere == 0){
            return 1;
        }
        if(putere == 1){
           return numar;
        }
        return numar * recursivB(numar, putere -1);
    }

    public static void main(String[] args){
        System.out.println(recursivB(2,4));
    }

}
