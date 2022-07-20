package devmindJava.Curs8;

public class Main {


    public static void main(String [] args){
        Vehicle vehicle = new Vehicle("3FDS9DFF8FSD7",4,"Moby");
        vehicle.printInfo();
        OnRoad onRoad = new OnRoad("FDFL8KMFSDLKM6",2,"Sporty");
        onRoad.printInfo();
         OnWater onWater = new OnWater("F8GFDG86D87GGD",20,"Wavess",2,2000.0);
         onWater.printInfo();

         OnAir onAirT = new OnAir("GJR96GDF98DF9ND",120,"Bluesky",4, true);

         onAirT.printInfo();

        OnAir onAirF = new OnAir("BC325987DFKJS34",20,"Localsky",2, false);

        onAirF.printInfo();

    }
}
