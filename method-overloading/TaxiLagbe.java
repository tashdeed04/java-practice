public class TaxiLagbe {
    public String taxiNumber;
    public String area;
    public int totalPassenger;
    public String[] passengerList;
    public int total;

    public TaxiLagbe() {
        this.totalPassenger = 0;
        this.passengerList = new String[4];
        this.total = 0;
    }

    public void storeInfo(String taxiNumber, String area) {
        this.taxiNumber = taxiNumber;
        this.area = area;
    }

    public void addPassenger(String name, int fare) {
        if (totalPassenger < 4) {
            passengerList[totalPassenger] = name;
            totalPassenger++;
            total += fare;
            System.out.println("Dear " + name + "! Welcome to TaxiLagbe");
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void addPassenger(String name1, int fare1, String name2, int fare2) {
        if (totalPassenger + 2 <= 4) {
            passengerList[totalPassenger] = name1;
            passengerList[totalPassenger + 1] = name2;
            totalPassenger += 2;
            total += fare1 + fare2;
            System.out.println("Dear " + name1 + "! Welcome to TaxiLagbe");
            System.out.println("Dear " + name2 + "! Welcome to TaxiLagbe");
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void printDetails() {
        System.out.println("Taxi number: " + taxiNumber);
        System.out.println("This taxi can cover " + area + " area");
        System.out.println("Total Passenger: " + totalPassenger);
        System.out.println("Passenger Lists: ");
        for (int i = 0; i < totalPassenger; i++) {
            System.out.println(passengerList[i]);
        }
        System.out.println("Total collected fare: " + total + " Taka");
    }
}