package devmindJava.P2.AplicatieImparteSurprize;
import java.util.concurrent.TimeUnit;
public abstract class AbstractGiveSurprises {

    //container tolba, pentru un scenariu generic
    private IBag bag;

    //Un timp de asteptare intre distribuirea surprizelor, dat ca numar de secunde.
    int waitTime = 1;

    public AbstractGiveSurprises (String type, int waitTime){
        this.bag = new BagFactory().makeBag(type);
        this.waitTime = waitTime;
    }


    //Adauga o noua surpriza in container.
    void put(ISurprise newSurprise){
        this.bag.put(newSurprise);
    }

    //Muta toate surprizele din container-ul parametru in acest container.
    void put(IBag surprises){
        while(!surprises.isEmpty()){
            this.bag.put(surprises.takeout());
        }

    }

    ISurprise give(){
        ISurprise surprise = this.bag.takeout();
        giveWithPassion();
        surprise.enjoy();

        return surprise;
    }

    void giveAll(){
        while(!bag.isEmpty()){
            this.give();
            try {
                TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    boolean isEmpty(){
        return this.bag.isEmpty();
    }

    abstract void giveWithPassion();

}
