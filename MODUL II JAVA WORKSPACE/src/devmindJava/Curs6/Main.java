package devmindJava.Curs6;



public class Main {
    public static void main(String[] args){

    MyIntArrayList list = new MyIntArrayList();
    list.add(12);
    list.add(23);
    list.add(79);
    list.add(83);
    list.add(2,7);
    list.add(28);
    list.add(7);
        System.out.println("Array-ul creat este: ");
        list.print();
    System.out.println("\nAvem numarul 12 in lista? " + list.contains(12) + " ,dar 45? " + list.contains(45));


        System.out.println("\nUltimul index al numarului 7 este: "+ list.lastIndexOf( 7));
        System.out.println("\nLa index-ul 3 este numarul: " + list.get(3));
        System.out.println("\nNumarul de elemente din array este: " + list.size());
        System.out.println("\nIndex-ul numarului 83 este: " + list.indexOf(83));
        System.out.println("\nDorim sa stergem numarul 55 din array, exista? " + list.remove(Integer.valueOf(55)));
        System.out.println("\nNoul array este: ");
        list.print();
        System.out.println("\nDorim sa stergem numarul 79 din array, exista? " + list.remove(Integer.valueOf(79)));
        System.out.println("\nNoul array este: ");
        list.print();
        System.out.println("\nStergem elementul cu index 2: " + list.removeElementAtIndex(2));
        System.out.print("\nNoul array este: ");
        list.print();



        MyIntArrayList listNew = new MyIntArrayList();
        listNew.add(12);
        listNew.add(0,1);
        listNew.add(23);
        System.out.print("\nlistNew = ");
        listNew.print();

        list.addAll(3,listNew);
        System.out.println("Adaugam listNew de la indexul 3:");
        list.print();

        list.addAll(listNew);
        System.out.println("Adaugam listNew la final: ");
        list.print();
        list.ensureCapacity(30);



    }
}
