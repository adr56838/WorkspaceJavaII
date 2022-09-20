package devmindJava.P2.AplicatieImparteSurprize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise{

    private static final ArrayList<String> zicale = new ArrayList<>(Arrays.asList("A ajunge la sapă de lemn","A da de belea","A lua plasă, a lua țeapă","A lua la bani mărunţi","A strânge bani la ciorap","A face bani din piatră seacă","A face safteaua cuiva","A fi mână spartă","A umbla după potcoave de cai morți","A umblat cât a umblat, dar acum i s-a-nfundat.","Bani de buzunar","Banii nu cresc în copaci","Bate fierul cât e cald.","Bunul gospodar își face vara sanie și iarna car.","Buturuga mică răstoarnă carul mare.","Ce iau pe mere, dau pe pere.","Cum îți așternă, așa dormi.","Dai un ban dar stai în față","De dai, n-ai."));
    private final String message;

    public FortuneCookie(String message) {
        this.message = message;
    }

    public static FortuneCookie generate(){
            Random random = new Random();
            int randomZicale = Math.abs(random.nextInt()) % zicale.size();
            return new FortuneCookie(zicale.get(randomZicale));
        }

        @Override
    public void enjoy(){
            System.out.println("Zicala ta norocoasa este: " + this.message);
        }

}
