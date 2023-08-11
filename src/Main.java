public class Main {
    public static void main(String[] args) {

            Car car = new Car();
            car.setPassingNo("MH26 1111");
            car.setManufacturer("MG HECTOR");
            car.setColor("Black");
            car.setFuelType((byte) 1);
            car.setNoOfGears(5);

            Bus bus = new Bus();
            bus.setPassingNo("XYZ789");
            bus.setManufacturer("HONDA");
            bus.setCapacity(50);

            CheckPost.checkVehicle(car);
            System.out.println("----------------------------------");
            CheckPost.checkVehicle(bus);
        }

}