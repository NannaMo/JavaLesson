public class L17_Main {
    public static void main(String[] args) {

        System.out.println("Dog's count " + L17_Dog.getDogsCount());

        L17_Dog lab = new L17_Dog();
        lab.setPaws(4);
        lab.setTail(1);
        lab.setName("Charley");
        lab.setBreed("Lab");
        lab.setSize("average");
        lab.bite();

        // Ctrl + Shift + / - закомментировать область
        L17_Dog sheppard = new L17_Dog();
        sheppard.setPaws(4);
        sheppard.setTail(1);
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");
        sheppard.setSize("biG");
        sheppard.bite();

        L17_Dog doberman = new L17_Dog();
        doberman.setPaws(4);
        doberman.setTail(1);
        doberman.setName("Jack");
        doberman.setBreed("Doberman");
        doberman.bite();

        /*System.out.println("Lab's name is " + lab.getName());
        System.out.println("Sheppard's name is " + sheppard.getName());
        System.out.println("Lab has " + lab.getPaws() + " paws");
        System.out.println("Sheppard has " + sheppard.getTail() + " tail");*/
    }

}
