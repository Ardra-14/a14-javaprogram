public class Main {
    public static void main(String[] args){
        bike b = new bike();
        b.setMake("Yamaha");
        b.setModel("Yamaha Byson F1");
        b.setYear(2021);
        b.start();
        System.out.println("Make: "+b.getMake());
        System.out.println("Model: "+b.getModel());
        System.out.println("year: "+ b.getYear());
        b.parking();
        b.stop();
        System.out.println();

        car c = new car();
        c.setMake("Honda");
        c.setModel("Jazz");
        c.setYear(2020);
        c.start();
        System.out.println("Make:  "+c.getMake());
        System.out.println("Model: "+c.getModel());
        System.out.println("Year: "+ c.getYear());
        c.detection();
        c.stop();
        System.out.println();

        truck t = new truck();
        t.setMake("BharatBenz");
        t.setModel("1217C");
        t.setYear(2020);
        t.start();
        System.out.println("Make:  "+t.getMake());
        System.out.println("Model: "+t.getModel());
        System.out.println("Year: "+ t.getYear());
        t.loading();
        t.stop();
    }
}