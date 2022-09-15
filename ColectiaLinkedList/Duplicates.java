package devmindJava.Curs22.ColectiaLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Duplicates {

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(9);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println(removeDuplicates(list));

    }



    private static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list){
        ListIterator<Integer> it = list.listIterator();
        int previous,current;

        if(!it.hasNext()){
            return list;
        }
        previous = it.next();

        while(it.hasNext()){
            current = it.next();
            if(previous == current){
                it.remove();
            }
            previous = current;
        }
        return list;
    }
}
