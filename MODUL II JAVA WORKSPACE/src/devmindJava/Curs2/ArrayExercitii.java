package devmindJava.Curs2;

public class ArrayExercitii {



    public static void main(String[] args) {
        int[] a = {1, 2, 0, -5, 42, 0, 2, -1};
        int writeIndex = a.length - 1;
        for (int i = a.length - 1; i >= 0; --i) {
            if (a[i] != 0) {
                a[writeIndex] = a[i];
                writeIndex--;
            }
        }
        for (int i = writeIndex; i >= 0; i--) {
            a[i] = 0;

        }

        for(int i = 0; i <a.length;i++){
            System.out.print(a[i] + " ");
        }

    }
}
