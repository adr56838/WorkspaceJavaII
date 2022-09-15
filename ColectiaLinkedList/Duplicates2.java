package devmindJava.Curs22.ColectiaLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

public class Duplicates2 {

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(9);
        list.add(9);
        list.add(10);
        System.out.println(list);
        System.out.println(removeDuplicates2(list));

    }

    private static LinkedList<Integer> removeDuplicates2(LinkedList<Integer> list){
        ListIterator<Integer> it = list.listIterator();
        Integer current;
        Integer next;
        Integer duplicateValue = null;

        if(!it.hasNext()){
            return list;
        }

        while(it.hasNext()){
            next = null;
            current = it.next();
            if(it.hasNext()){
                next = it.next();
            }
            if(Objects.equals(current, next)){
                duplicateValue = current;
                it.remove();
                it.previous();
                it.remove();

            }else if(Objects.equals(duplicateValue, current)){//imi recomanda IntelliJ varianta asta
                it.previous();
                it.previous();
                it.remove();
            }else if (it.hasNext()){
                it.remove();
            }

        }
        return list;
    }
}
