package devmindJava.Curs22.ColectiaLinkedList;

public class TestOrderedList {
    public static void main(String[] args) {

        OrderedList<Town> orderedTownsList = new OrderedList<>();

        // populate list with towns:
        Town town1 = new Town("Suceava",12);
        Town town2 = new Town("Cluj",745);
        Town town3 = new Town("Sibiu",122);
        Town town4 = new Town("Bucuresti",312);
        Town town5 = new Town("Oradea",212);




        orderedTownsList.addInOrderedList(town1);
        orderedTownsList.addInOrderedList(town2);
        orderedTownsList.addInOrderedList(town3);
        orderedTownsList.addInOrderedList(town4);
        orderedTownsList.addInOrderedList(town5);



        System.out.println(orderedTownsList);
    }
}
