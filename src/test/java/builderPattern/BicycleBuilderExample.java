package builderPattern;

class Bicycle {
    private boolean hasGears;
    private boolean hasDoubleStand;
    private boolean hasDoubleSeats;
    private boolean hasCarrier;

    private Bicycle(Builder builder) {
        this.hasGears = builder.hasGears;
        this.hasDoubleStand = builder.hasDoubleStand;
        this.hasDoubleSeats = builder.hasDoubleSeats;
        this.hasCarrier = builder.hasCarrier;
    }

    public boolean hasGears() {
        return hasGears;
    }

    public boolean hasDoubleStand() {
        return hasDoubleStand;
    }

    public boolean hasDoubleSeats() {
        return hasDoubleSeats;
    }

    public boolean hasCarrier() {
        return hasCarrier;
    }

    public static class Builder {
        private boolean hasGears = false;
        private boolean hasDoubleStand = false;
        private boolean hasDoubleSeats = false;
        private boolean hasCarrier = false;
        private boolean built = false;

        public Builder addGears() {
            if (!built) {
                this.hasGears = true;
            }
            return this;
        }

        public Builder addDoubleStand() {
            if (!built) {
                this.hasDoubleStand = true;
            }
            return this;
        }

        public Builder addDoubleSeats() {
            if (!built) {
                this.hasDoubleSeats = true;
            }
            return this;
        }

        public Builder addCarrier() {
            if (!built) {
                this.hasCarrier = true;
            }
            return this;
        }

        public Bicycle build() {
            if (!built) {
                built = true;
                return new Bicycle(this);
            } else {
                throw new IllegalStateException("The bicycle has already been built.");
            }
        }
    }
}

public class BicycleBuilderExample {
    public static void main(String[] args) {
        Bicycle basicBicycle = new Bicycle.Builder().build();
        System.out.println("Basic Bicycle Features:");
        printBicycleFeatures(basicBicycle);

        Bicycle customBicycle = new Bicycle.Builder()
                .addGears()
                .addDoubleStand()
                .addDoubleSeats()
                .addCarrier()
                .build();
        System.out.println("\nCustomized Bicycle Features:");
        printBicycleFeatures(customBicycle);
    }

    private static void printBicycleFeatures(Bicycle bicycle) {
        System.out.println("Gears: " + bicycle.hasGears());
        System.out.println("Double Stand: " + bicycle.hasDoubleStand());
        System.out.println("Double Seats: " + bicycle.hasDoubleSeats());
        System.out.println("Carrier: " + bicycle.hasCarrier());
    }
}
