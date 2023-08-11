 class Bus extends Vehicle {
        private int capacity;

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Capacity: " + capacity);
        }

        @Override
        void start() {
            System.out.println("Bus starting...");
        }

        @Override
        void stop() {
            System.out.println("Bus stopping...");
        }

        @Override
        void move() {
            System.out.println("Bus moving...");
        }
    }


