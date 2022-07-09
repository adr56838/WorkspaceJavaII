package devmindJava.Curs2;

public class BubbleSort {
    public static double[] bubbleSort(double[] multime) {
        double aux;
        int index = multime.length - 1;
        boolean swap = false;
        for(int i = 0; i < multime.length-1;i++) {
            for (int j = 0; j < index; j++) {
                if (multime[j] > multime[j + 1]) { // < descrescator
                    aux = multime[j];
                    multime[j] = multime[j+1];
                    multime[j+1] = aux;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
            //boolean if is already sorted
            // index-ul trebuie sa scada dupa iesirea din for-ul cu j, ca la urmatorul i sa nu mai ajunga pana la ultima cifra
            --index;
        }
        return multime;
        }

        public static void print(double[] multime){
        for(int i = 0; i < multime.length;i++){
            System.out.print(multime[i] + " ");
        }
    }
    public static void main(String[] args){
        double[] multime = {0, 7, 6 , 5 , 4 , 2 , 1};
        bubbleSort(multime);
        print(multime);
    }
}
