package devmindJava.P2.AplicatieImparteSurprize;

public class BagFactory implements IBagFactory{

    @Override
    public IBag makeBag(String type){
        switch (type) {
            case "random":
                return new RandomBag();
            case "fifo":
                return new FIFOBag();
            case "lifo":
                return new LIFOBag();
            default:
                return null;
        }
    }
}
