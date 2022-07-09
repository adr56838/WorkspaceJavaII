package devmindJava.Curs4;

public class ProgramMasina {
    public static final String producedBy = "Volvo";
    private final int productionYear;
    private final String vin;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    private String plateNumber;

    public int getKilometers() {
        return kilometers;
    }

    private int kilometers;
    private int lastSoldOnYear;
    private double positionX, positionY;

    private ProgramMasina (String vin, int productionYear){
        this.vin = vin;
        this.productionYear = productionYear;

    }

    private ProgramMasina (String vin, int productionYear,String plateNumber, int kilometers, int lastSoldOnYear){
    this(vin, productionYear);
    this.plateNumber = plateNumber;
    this.kilometers = kilometers;
    this.lastSoldOnYear = lastSoldOnYear;
    }

    private ProgramMasina(String vin, int productionYear,double positionX,double positionY, int lastSoldOnYear, int kilometers){
        this(vin,productionYear);
        this.positionX = positionX;
        this.positionY = positionY;
        this.lastSoldOnYear = lastSoldOnYear;
        this.kilometers = kilometers;
     }
    //a. Implementeaza o metoda sellVehicle(String plateNumber, int lastSoldOnYear) care actualizeaza corespunzator starea obiectului in urma unei (noi) achizitii. Metoda va actualiza valorile campurilor plateNumber respectiv lastSoldOnYear.
     public void sellVechicle(String plateNumber, int lastSoldOnYear){
        this.plateNumber = plateNumber;
        this.lastSoldOnYear = lastSoldOnYear;
     }
    //b. Implementeaza o metoda care permite mutarea masinii intr-o noua pozitie, actualizand corespunzator coordonatele acesteia (i.e. positionX si positionY) precum si distanta parcursa (i.e. kilometers). Pentru a calcula distanta parcursa se va folosi formula de distanta euclidiana intre doua puncte carteziene in plan:
     public void moveCar(double newPositionX, double newPositionY){
        double difX = positionX - newPositionX;
        double difY = positionY - newPositionY;
     }

     //c. Implementeaza o metoda isVinValid(boolean isDrivingInNorthAmerica) care verifica daca seria sasiului unei masini este sau nu valida. In cazul in care autovehiculul circula in zona Americii de Nord seria sasiului se va verifica conform algoritmului prezentat la adresa:

    public boolean isVinValid(boolean isDrivingInNorthAmerica) {
        if (!isDrivingInNorthAmerica) {
            return false;
        } else {

            char[] litere = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            int[] litereNumber = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 7, 9, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] values = new int[vin.length()];

            int[] weight = {8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2};
            int products = 0;
            boolean result = false;

            for (int i = 0; i < vin.length(); i++) {
                char c = vin.charAt(i);
                //pentru cifre
                if (!Character.isLetter(c)) {
                    values[i] = c - '0';
                    continue;
                }
                //if(i == 8){
                //  continue;
                //}
                for (int j = 0; j < litere.length; j++) {
                    if (litere[j] == c) {
                        values[i] = litereNumber[j];
                    }
                }
            }

            for (int k = 0; k < vin.length(); k++) {
                products += values[k] * weight[k];
            }
            if (products % 11 == 10) {
                return true;
            } else {
                return false;
            }
        }
    }


     public void printVINDecompose(){
         System.out.println("Partile componente conform VIN-ului masininii sunt:");
        String producerIdentifier = vin.substring(0,3);
         System.out.println("\t- Identificatorul producatorului = " + producerIdentifier);
         String vehicleAtribute = vin.substring(3,8);
         System.out.println("\t- Atributele vehiculului = " + vehicleAtribute);
         String verificationCode = vin.substring(8,9);
         System.out.println("\t- Cifra de verificare = " + verificationCode);
         String yearOfModelProduction = vin.substring(9,10);
         System.out.println("\t- Anul productiei modelului = " + yearOfModelProduction);
         String factorySeries = vin.substring(10,11);
         System.out.println("\t- Seria fabricii = " + factorySeries);
         String numberIdentificator = vin.substring(11,17);
         System.out.println("\t- Identificatorul numeric = " + numberIdentificator);
     }

     public void display(){

            String displayVehicle = String.format("\n\tMasina produsa in anul %d de catre %s, are numarul de inmatriculare %s si %dkm parcursi.\nUltimul proprietar detine autoturismul din anul %d, iar raportul detaliat poate fi verificat conform VIN-ul masinii: %s.\nPozitionarea masinii conform coordonatelor GPS este %.2fX:%.2fY.",productionYear,producedBy,plateNumber,kilometers,lastSoldOnYear,vin,positionX,positionY);
         System.out.println(displayVehicle);
     }


     public static void main(String[] args){
        ProgramMasina masina1 = new ProgramMasina("1M8GDM9AXKP042788",2007,12.0,25.7,2010,175689);
        masina1.printVINDecompose();
        masina1.display();
         System.out.println();


         masina1.isVinValid(false);
         /*System.out.println(isVinValid("1M8GDM9AXKP042788"));
         System.out.println(isVinValid("JALC4J167C7000484"));
         System.out.println(isVinValid("SCA664S5XAUX48670"));

          */







     }
}
