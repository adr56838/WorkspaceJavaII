package devmindJava.Curs22.ColectiaLinkedList;

import java.util.LinkedList;
import java.util.List;

public class BigNumberLinkedList {

    public static LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2){

        LinkedList<Integer> sum = new LinkedList<>();
        int carry = 0,crt;
        int size = Math.min(op1.size(), op2.size());
       
        //calcul pentru dimensiunea egala a cele 2 array-uri
        for(int i = 1; i <= size;i++){
            crt = op1.pollLast() + op2.pollLast();
            sum.addFirst((crt % 10 + carry));
            carry = 0;
            carry = crt / 10 + carry;
        }

        int count1 = op1.size();
        for(int j = 1; j <= count1; j++){
            int lastNr = op1.pollLast();
            sum.addFirst((lastNr + carry) % 10);
            carry = (lastNr + carry) /10 ;
        }

        int count2 = op2.size();
        for(int j = 1; j <= count2; j++){
            int lastNr = op2.pollLast();
            sum.addFirst((lastNr + carry) % 10);
            carry = (lastNr + carry) /10 ;
        }

        if( carry != 0){
            sum.addFirst(carry);
        }
        return sum;
    }

    public static void main(String[] args){
        LinkedList<Integer> op1 = new LinkedList<>(List.of(2,3,4));
        LinkedList<Integer> op2 = new LinkedList<>(List.of(2,3,4,5));
        System.out.println(sum(op1,op2));
    }


}
