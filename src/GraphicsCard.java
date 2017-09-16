public class GraphicsCard extends MotherbardDecorator {
    public GraphicsCard(IMotherboard motherboard) {
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
        return motherboard.heat() + 23;
    }

    @Override
    public double totalCost() {
        return motherboard.totalCost() + 56;
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
        return motherboard.getComponentsName() + "Graphics card,";
    }

}
