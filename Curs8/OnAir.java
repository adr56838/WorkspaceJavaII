package devmindJava.Curs8;

public class OnAir extends Vehicle{
    private int noTurbines;
    private boolean hasFirstClass = false;

    public boolean hasFirstClass() {

        return hasFirstClass;
    }

    public OnAir (String serialNumber,int noPersons){
        super(serialNumber,noPersons);
    }
    public OnAir (String serialNumber,int noPersons, String name){
        super(serialNumber,noPersons,name);//e ok daca apelez de 2 ori super, ca sa preiau info din vehicle
    }
    public OnAir (String serialNumber,int noPersons, String name, int noTurbines){
        this(serialNumber, noPersons, name);
        this.noTurbines = noTurbines;
    }
    public OnAir (String serialNumber,int noPersons, String name, int noTurbines,boolean hasFirstClass){
        this(serialNumber, noPersons, name,noTurbines);

    }

    private String hasFirstClassMethod(){
        if(hasFirstClass){
            return "- has first class";
        }else{
            return "- does not have first class";
        }

    }

    @Override
    public boolean goTo(double positionX, double positionY){
        System.out.println("SFlying the airplane to coordinates: [41.3, 120.88]");
        return true;
    }

    @Override
    public boolean addFuel(double amount){
        System.out.println("Adding 3000.5 l of fuel to the airplane");
        return true;
    }




    @Override
    public void printInfo(){
        super.printInfo();
        String result = String.format("Airplane properties: \n\t- number of turbines: %d\n\t%s" ,this.noTurbines,hasFirstClassMethod());
        System.out.println(result);
    }


}
