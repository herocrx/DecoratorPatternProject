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
        System.out.format("Free space: %s\n",soundSpeaker.getFreeSpace());
        System.out.format("Name of motherboard: %s\n", soundSpeaker.motherboardName());
        System.out.println();
        System.out.println();
        MotherBoard motherboard2 = new MotherBoard("TR231",81,1120,30,30);
        Fan fan2 = new Fan(motherboard2);
        NetworkCard networkCard2 = new NetworkCard(fan2);

        System.out.format("Price of motherboard2: %s \n",networkCard2.totalCost());
        System.out.format("%s\n",networkCard2.getComponentsName());
        System.out.format("Free space: %s\n",networkCard2.getFreeSpace());
        System.out.format("Name of motherboard: %s\n", networkCard2.motherboardName());

        System.out.println();
        System.out.println();
        MotherBoard motherboard3 = new MotherBoard("EW21",311,1120,30,300);
        GraphicsCard graphicsCard2 = new GraphicsCard(motherboard3);
        System.out.format("Price of motherboard3: %s \n",graphicsCard2.totalCost());
        System.out.format("%s\n",graphicsCard2.getComponentsName());
        System.out.format("Free space: %s\n",graphicsCard2.getFreeSpace());
        System.out.format("Name of motherboard: %s\n", graphicsCard2.motherboardName());


        System.out.println();
        System.out.println();
        MotherBoard motherboard4 = new MotherBoard("CH221",111,10,80,300);
        GraphicsCard graphicsCard3 = new GraphicsCard(motherboard4);
        NetworkCard networkCard3 = new NetworkCard(graphicsCard3);
        Processor processor1 = new Processor(networkCard3);
        System.out.format("Price of motherboard4: %s \n",processor1.totalCost());
        System.out.format("%s\n",processor1.getComponentsName());
        System.out.format("Free space: %s\n",processor1.getFreeSpace());
        System.out.format("Name of motherboard: %s\n", processor1.motherboardName());






    }
}
