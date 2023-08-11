
    class CheckPost {
        public static void checkVehicle(Vehicle vehicle) {
            System.out.println("Checking the vehicle...");

            vehicle.start();
            vehicle.move();
            vehicle.stop();

            System.out.println("Vehicle check completed.");
        }
    }


