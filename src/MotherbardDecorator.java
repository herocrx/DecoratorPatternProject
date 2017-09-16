public abstract class MotherbardDecorator implements IMotherboard  {

    public MotherbardDecorator(IMotherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public double getFreeSpace() {
        return 0;
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
        return 0;
    }

    @Override
    public double totalCost() {
        return 0;
    }

    @Override
    public String motherboardName() {
        return null;
    }

    @Override
    public String getComponentsName() {
        return null;
    }

    @Override
    public boolean getContainsGraphics() {
        return false;
    }

    IMotherboard motherboard;
}
