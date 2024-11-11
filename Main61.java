import java.util.Scanner;

class Car {
    String color;
    String companyName;

    public Car(String color, String companyName) {
        this.color = color;
        this.companyName = companyName;
    }

    public String getColor() {
        return color;
    }

    public String getCompanyName() {
        return companyName;
    }
}

class Maruti extends Car {
    String model;
    String year;

    public Maruti(String color, String companyName, String model, String year) {
        super(color, companyName);
       this.model = model;
       this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
}

class Maruti800 extends Maruti {
    String speed;
    String engineNo;

    public Maruti800(String color, String companyName, String model, String year, String speed, String engineNo) {
        super(color, companyName, model, year);
        this.speed = speed;
        this.engineNo = engineNo;
    }

    public String getSpeed() {
        return speed;
    }

    public String getEngineNo() {
        return engineNo;
    }
}

public class Main61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car color: ");
        String color = scanner.nextLine();

        System.out.print("Enter company name: ");
        String companyName = scanner.nextLine();

        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        System.out.print("Enter year: ");
        String year = scanner.nextLine();

        System.out.print("Enter speed: ");
        String speed = scanner.nextLine();

        System.out.print("Enter engine number: ");
        String engineNo = scanner.nextLine();

        Maruti800 detail = new Maruti800(color, companyName, model, year, speed, engineNo);

        System.out.println("\nCar Details:");
        System.out.println("Color: " + detail.getColor());
        System.out.println("Company Name: " + detail.getCompanyName());
        System.out.println("Model: " + detail.getModel());
        System.out.println("Year: " + detail.getYear());
        System.out.println("Speed: " + detail.getSpeed());
        System.out.println("Engine Number: " + detail.getEngineNo());

        scanner.close();
    }
}
