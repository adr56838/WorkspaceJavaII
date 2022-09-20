package devmindJava.P2.AplicatieImparteSurprize;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {

    private static final ArrayList<String> minioni = new ArrayList<>(Arrays.asList("Dave","Carl","Kevin","Stuart","Jerry","Tim"));
    private final String minion;

    private static int cnt = 0;

    public MinionToy(String minion) {
        this.minion = minion;
    }

    public static MinionToy generate(){
        if(cnt >= minioni.size()){
            cnt = 0;
        }
        MinionToy minionToy = new MinionToy(minioni.get(cnt));
        cnt++;

        return minionToy;
    }

    @Override
    public void enjoy(){
        System.out.println("Ai primit minionul cu numarul " + cnt + ", pe nume: " + this.minion);
    }

}
