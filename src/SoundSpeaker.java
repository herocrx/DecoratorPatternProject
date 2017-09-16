public class SoundSpeaker extends MotherbardDecorator{
    public SoundSpeaker(IMotherboard motherboard) {
        super(motherboard);
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
        return motherboard.heat() + 1;
    }

    @Override
    public double totalCost() {
        return motherboard.totalCost() + 5;
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
        return motherboard.getComponentsName() + "Soundspeakers,";
    }
}
