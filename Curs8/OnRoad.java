package devmindJava.Curs8;

public class OnRoad extends Vehicle{
    private int noWheels;
    private int noDoors;

    public OnRoad(String serialNumber, int noPersons){
        super(serialNumber,noPersons);
    }
    public OnRoad(String serialNumber, int noPersons, String name){
        super(serialNumber,noPersons,name);
        this.noWheels = 4;
        this.noDoors = 4;
    }

    public OnRoad(String serialNumber, int noPersons, String name, int noWheels){
        this(serialNumber,noPersons,name);
        this.noWheels = 4;
    }

    public OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors){
        this(serialNumber,noPersons,name,noWheels);
        this.noDoors = noDoors;
    }

    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.println("Driving the vehicle on road to coordinates: [21.3,12.88]");
        return true;
    }

    @Override
    public boolean addFuel(double amount){
        System.out.println("Adding 28.12 1 of fuel to the driving vehicle");
        return true;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        String result = String.format("Driving vehicle properties: \n\t- number of wheels: %d\n\t- number of doors: %d\n",this.noWheels,this.noDoors);
        System.out.println(result);
    }



}
