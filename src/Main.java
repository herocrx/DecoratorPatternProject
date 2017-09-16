public class Main {

    public static void main(String[] args) {
        System.out.println("Making decorator pattern!");
        MotherBoard motherboard1 = new MotherBoard("Q510",130,670,30,50);
        Fan fan = new Fan(motherboard1);
        GraphicsCard graphicsCard = new GraphicsCard(fan);
        HDD hdd = new HDD(graphicsCard);
        NetworkCard networkCard = new NetworkCard(hdd);
        Processor processor = new Processor(networkCard);
        RAM ram = new RAM(processor);
        SoundSpeaker soundSpeaker = new SoundSpeaker(ram);

        System.out.format("Price of motherboard1: %s \n",soundSpeaker.totalCost());
        System.out.format("%s\n",soundSpeaker.getComponentsName());
        System.out.println();
        System.out.println();
        MotherBoard motherboard2 = new MotherBoard("TR231",81,1120,30,30);
        Fan fan2 = new Fan(motherboard2);
        NetworkCard networkCard2 = new NetworkCard(fan2);

        System.out.format("Price of motherboard2: %s \n",networkCard2.totalCost());
        System.out.format("%s\n",networkCard2.getComponentsName());

        System.out.println();
        System.out.println();
        MotherBoard motherboard3 = new MotherBoard("EW21",311,1120,30,300);
        GraphicsCard graphicsCard2 = new GraphicsCard(motherboard3);
        System.out.format("Price of motherboard3: %s \n",graphicsCard2.totalCost());
        System.out.format("%s\n",graphicsCard2.getComponentsName());



    }
}
