public class HDD extends MotherbardDecorator{
    public HDD(IMotherboard motherboard) {
        super(motherboard);
    }

    @Override
    public double getFreeSpace() {
        return motherboard.getFreeSpace()-45;
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
        return motherboard.heat() + 10;
    }

    @Override
    public double totalCost() {
        return motherboard.totalCost() + 11;
    }

    @Override
    public boolean getContainsGraphics()
    {
        return true;
    }

    @Override
    public String motherboardName() {
        return motherboard.motherboardName();
    }

    @Override
    public String getComponentsName() {
        return motherboard.getComponentsName() + "HDD,";
    }

}
