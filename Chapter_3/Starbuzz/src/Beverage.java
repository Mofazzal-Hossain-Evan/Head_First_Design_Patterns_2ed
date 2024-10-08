public abstract class Beverage {


        public enum Size { TALL, GRANDE, VENTI };
    Size size = Size.TALL;
    String description =  "Unknown Beverage";
    public String getDescription() {
        return description;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return this.size;
    }

    // Instance variables for condiment costs
    private double milkCost = 0.5;  // Example cost, adjust as needed
    private double soyCost = 0.3;
    private double mochaCost = 0.2;
    private double whipCost = 0.4;

    // Variables to track whether the beverage includes condiments
    private boolean hasMilk;
    private boolean hasSoy;
    private boolean hasMocha;
    private boolean hasWhip;

    // Getters and setters for milk
    public boolean hasMilk() {
        return hasMilk;
    }

    public void setMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    // Getters and setters for soy
    public boolean hasSoy() {
        return hasSoy;
    }

    public void setSoy(boolean hasSoy) {
        this.hasSoy = hasSoy;
    }

    // Getters and setters for mocha
    public boolean hasMocha() {
        return hasMocha;
    }

    public void setMocha(boolean hasMocha) {
        this.hasMocha = hasMocha;
    }

    // Getters and setters for whip
    public boolean hasWhip() {
        return hasWhip;
    }

    public void setWhip(boolean hasWhip) {
        this.hasWhip = hasWhip;
    }

    // Calculate the total cost of condiments
    public double cost() {
        double condimentCost = 0.0;
        if (hasMilk()) {
            condimentCost += milkCost;
        }
        if (hasSoy()) {
            condimentCost += soyCost;
        }
        if (hasMocha()) {
            condimentCost += mochaCost;
        }
        if (hasWhip()) {
            condimentCost += whipCost;
        }
        return condimentCost;
    }
}



//public abstract class Beverage {
//    public enum Size { TALL, GRANDE, VENTI };
//    Size size = Size.TALL;
//    String description = “Unknown Beverage”;
//    public String getDescription() {
//        return description;
//    }
//    public void setSize(Size size) {
//        this.size = size;
//    }
//    public Size getSize() {
//        return this.size;
//    }
//    public abstract double cost();
//}