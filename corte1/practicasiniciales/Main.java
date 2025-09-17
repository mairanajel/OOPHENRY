package carros;


public class Main{
    public static void main(String[] args) {
        System.out.println("Hola,funiona!");

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setCompany_name("Chevrolet");
        car1.setModel_name("Cruze");
        car1.setYear(2009);
        car1.setMileage(64000);

        car2.setCompany_name("Vituz");
        car2.setModel_name("Dosmil");
        car2.setYear(2003);
        car2.setMileage(34000);

        car3.setCompany_name("Ferrari");
        car3.setModel_name("Crowu");
        car3.setYear(2011);
        car3.setMileage(7000);

        System.out.println("==== carro 1 ===");
        System.out.println("Company Name: " + car1.getCompany_name());
        System.out.println("Model Name: " + car1.getModel_name());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Mileage: " + car1.getMileage());

        System.out.println("==== carro 2 ===");
        System.out.println("Company Name: " + car2.getCompany_name());
        System.out.println("Model Name: " + car2.getModel_name());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Mileage: " + car2.getMileage());

        System.out.println("==== carro 3 ===");
        System.out.println("Company Name: " + car3.getCompany_name());
        System.out.println("Model Name: " + car3.getModel_name());
        System.out.println("Year: " + car3.getYear());
        System.out.println("Mileage: " + car3.getMileage());
    }
}



