public class Fan extends MotherbardDecorator {

    public Fan(IMotherboard motherboard) {
        super(motherboard);
        this.motherboard = motherboard;
    }

    @Override
    public double getFreeSpace() {
        return motherboard.getFreeSpace()-15;
    }

    @Override
    public int Components() {
        return 0;
    }

    @Override
    public double weight() {
        return 0;
    }

    @Override
    public double heat() {
        return motherboard.heat() - 13;
    }

    @Override
    public double totalCost() {
        return motherboard.totalCost() + 13;
    }

    @Override
    public boolean getContainsGraphics()
    {
        return motherboard.getContainsGraphics();
    }

    @Override
    public String motherboardName() {
        return motherboard.motherboardName();
    }

    @Override
    public String getComponentsName() {
        return motherboard.getComponentsName() + "fan,";
    }

}
