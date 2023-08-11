 class Car extends Vehicle {
        private String color;
        private byte fuelType;
        private int noOfGears;

        // Setters and Getters for color
        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }


        public void setFuelType(byte fuelType) {
            this.fuelType = fuelType;
        }

        public byte getFuelType() {
            return fuelType;
        }

        public void setNoOfGears(int noOfGears) {
            this.noOfGears = noOfGears;
        }

        public int getNoOfGears() {
            return noOfGears;
        }


        @Override
        public void display() {
            super.display(); // Calling the base class display method
            System.out.println("Color: " + color);
            System.out.println("Fuel Type: " + (fuelType == 1 ? "Petrol" : "Diesel"));
            System.out.println("Number of Gears: " + noOfGears);
        }


        @Override
        void start() {
            System.out.println("Car starting...");
        }

        @Override
        void stop() {
            System.out.println("Car stopping...");
        }

        @Override
        void move() {
            System.out.println("Car moving...");
        }
    }


