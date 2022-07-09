package devmindJava.Curs5;

import java.util.ArrayList;

public class ArrayList0 {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        //void add(int index, E element)
        list.add(0,1);
        list.add(1,7);
        list.add(1,8);
        list.add(0,9);
        System.out.println("ArrayList are urmatoarele elemente:\n\t" + list);

        //boolean add(E element) - ultima pozitie

        list.add(13);
        list.add(87);
        list.add(7);
        System.out.println("ArrayList are urmatoarele elemente:\n\t" + list);

        //int size()
        System.out.println("ArrayList are marimea de:\n\t" + list.size() + " elemente.");

        //boolean contains(Object o)
        System.out.println("ArrayList contine numarul 52? " + list.contains(52) + ",dar numarul 13 ? " + list.contains(13));

        //E get(int index)
        System.out.println("Ce numar se afla la indexul 3 din ArrayList? " + list.get(3));

        //int indexOf(obejct o)
        System.out.println("Indexul numarului 87 din ArrayList este:\n\t" + list.indexOf(87));

        //int lastIndexOf(Object o)
        System.out.println("Ultimul index al numarului 7 este:\n\t" + list.lastIndexOf(7));

        //boolean remove(Object o)

      //exista alta modalitate mai usoara pentru remove object?

        System.out.println("Stergem numarul 7 din ArrayList, exista? " + list.remove(Integer.valueOf(7)) + " si numarul 100, exista? " + list.remove(Integer.valueOf(100)));

        //E remove(int index)
        System.out.println("Stergem numarul cu index 3 = " + list.remove(3) + " si cu index maxim = " + list.remove(list.size() - 1));

        //void clear()
        System.out.println("Size inainte de stergere:\n\t" + list.size());
        list.clear();
        System.out.println("Size dupa stergere:\n\t " + list.size());

        //E set(int index, E element)
        list.add(25);
        System.out.println("Punem numarul 10 pe indexul 0:\n\t" + list.set(0,10));
        System.out.println("ArrayList nou:\n\t" + list);


    }
}
