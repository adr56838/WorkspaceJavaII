package devmindJava.P2.AplicatieImparteSurprize;

public class GiveSupriseAndHug extends AbstractGiveSurprises {

    public GiveSupriseAndHug(String type, int waitTime) {
        super(type, waitTime);
    }

    @Override
    void giveWithPassion(){
        System.out.println("Warm wishes and big hugs!");
    }
}
