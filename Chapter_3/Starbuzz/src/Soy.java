public class Soy extends CondimentsDecorator {

    private Beverage beverage; // The beverage we're decorating

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // Add "Soy" to the description of the wrapped beverage
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        // Add the cost of soy to the cost of the wrapped beverage
        return 0.15 + beverage.cost(); // Soy costs 0.15, adjust as needed
    }
}
