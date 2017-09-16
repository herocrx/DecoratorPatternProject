public class Main {

    public static void main(String[] args) {
        System.out.println("Making decorator pattern!");
        IMotherboard motherboard1 = new MotherBoard("Q510",130,670,30,50);
        motherboard1 = new Fan(motherboard1);
        motherboard1 = new GraphicsCard(motherboard1);
        motherboard1= new HDD(motherboard1);
        motherboard1 = new NetworkCard(motherboard1);
        motherboard1 = new Processor(motherboard1);
        motherboard1 = new RAM(motherboard1);
        SoundSpeaker soundSpeaker = new SoundSpeaker(motherboard1);

        System.out.format("Price of motherboard1: %s \n",motherboard1.totalCost());
        System.out.format("%s\n",motherboard1.getComponentsName());
        System.out.format("Free space: %s\n",motherboard1.getFreeSpace());
        System.out.format("Name of motherboard: %s\n", motherboard1.motherboardName());
        System.out.println();
        System.out.println();
        IMotherboard motherboard2 = new MotherBoard("TR231",81,1120,30,30);
        motherboard2 = new Fan(motherboard2);
        motherboard2 = new NetworkCard(motherboard2);

        System.out.format("Price of motherboard2: %s \n",motherboard2.totalCost());
        System.out.format("%s\n",motherboard2.getComponentsName());
        System.out.format("Free space: %s\n",motherboard2.getFreeSpace());
        System.out.format("Name of motherboard: %s\n", motherboard2.motherboardName());

        System.out.println();
        System.out.println();
        IMotherboard motherboard3 = new MotherBoard("EW21",311,1120,30,300);
        motherboard3 = new GraphicsCard(motherboard3);
        System.out.format("Price of motherboard3: %s \n",motherboard3.totalCost());
        System.out.format("%s\n",motherboard3.getComponentsName());
        System.out.format("Free space: %s\n",motherboard3.getFreeSpace());
        System.out.format("Name of motherboard: %s\n", motherboard3.motherboardName());

        System.out.println("Fourth motherboard has been added! ");

        System.out.println();
        System.out.println();
        IMotherboard motherboard4 = new MotherBoard("CH221",111,10,80,300);
        motherboard4= new GraphicsCard(motherboard4);
        motherboard4 = new NetworkCard(motherboard4);
        motherboard4 = new Processor(motherboard4);
        System.out.format("Price of motherboard4: %s \n",motherboard4.totalCost());
        System.out.format("%s\n",motherboard4.getComponentsName());
        System.out.format("Free space: %s\n",motherboard4.getFreeSpace());
        System.out.format("Name of motherboard: %s\n", motherboard4.motherboardName());


        System.out.println("To analyze tomorrow!");



    }
}
