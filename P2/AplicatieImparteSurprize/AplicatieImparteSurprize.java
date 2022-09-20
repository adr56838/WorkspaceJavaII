package devmindJava.P2.AplicatieImparteSurprize;

public class AplicatieImparteSurprize {
     public static void main(String[] args){
         //Give fifo surprises and hug
         GiveSupriseAndHug hug = new GiveSupriseAndHug("fifo",1);
         ISurprise[] surprises = GatherSurprises.gather(2);

         for(ISurprise surprise : surprises){
             hug.put(surprise);
         }
         hug.giveAll();
         System.out.println("--------------");

         //Give random surprises and aplause
         GiveSurpriseAndApplause aplause = new GiveSurpriseAndApplause("random",2);
         surprises = GatherSurprises.gather(3);
         for(ISurprise surprise : surprises){
             aplause.put(surprise);
         }
         aplause.giveAll();
         System.out.println("--------------");

         //Give lifo surprises and sing
         GiveSurpriseAndSing sing = new GiveSurpriseAndSing("lifo",3);
         surprises = GatherSurprises.gather(3);
         for(ISurprise surprise : surprises){
             sing.put(surprise);
         }
         sing.giveAll();
         System.out.println("--------------");
    }
}
