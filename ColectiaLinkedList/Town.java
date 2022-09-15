package devmindJava.Curs22.ColectiaLinkedList;

public class Town implements Comparable<Town> {


    private final String nameTown;
    private int nrKm;

    public Town(String nameTown,int nrKm) {
        this.nameTown = nameTown;
        this.nrKm = nrKm;
    }

    @Override
    public int compareTo(Town o) {
        return this.nrKm - o.nrKm ;
    }

    @Override
    public String toString() {
        return this.nameTown;
    }

}
