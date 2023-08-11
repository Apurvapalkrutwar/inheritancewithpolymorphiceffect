 abstract class Vehicle {
        private String passingNo;
        private String manufacturer;


        public void setPassingNo(String passingNo) {
            this.passingNo = passingNo;
        }

        public String getPassingNo() {
            return passingNo;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void display() {
            System.out.println("Passing No: " + passingNo);
            System.out.println("Manufacturer: " + manufacturer);
        }

        abstract void start();

        abstract void stop();

        abstract void move();
    }


