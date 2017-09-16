public class MotherBoard implements IMotherboard {
    public MotherBoard(String fullName, double totalCost,double weight,double heat,double areaCM) {
        numberOfComponents = 1;
        containsGraphics = false;
        this.fullName = fullName;
        this.totalCost = totalCost;
        this.weight = weight;
        this.heat = heat;
        this.area = areaCM;
    }

    @Override
    public double getFreeSpace() {
        return area;
    }

    @Override
    public int Components() {
        return numberOfComponents;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double heat() {
        return heat;
    }

    @Override
    public double totalCost() {
        return totalCost;
    }

    @Override
    public boolean getContainsGraphics() {
        return false;
    }

    @Override
    public String motherboardName() {
        return fullName;
    }

    @Override
    public String getComponentsName() {
        return "This motherboard contains: ";
    }
    int numberOfComponents;
    double totalCost;
    double weight;
    double heat;
    double area;
    boolean containsGraphics;
    final String fullName;

}
