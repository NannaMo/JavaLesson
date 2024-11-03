public class L17_Main {
    public static void main(String[] args) {
        L17_Dog lab = new L17_Dog();
        lab.setPaws(5);
        lab.setTail(2);
        lab.setName("Charley");
        lab.setBreed("Lab");

        // Ctrl + Shift + / - закомментировать область
        L17_Dog sheppard = new L17_Dog();
        sheppard.setPaws(4);
        sheppard.setTail(1);
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");

        System.out.println("Lab's name is " + lab.getName());
        System.out.println("Sheppard's name is " + sheppard.getName());
        System.out.println("Lab has " + lab.getPaws() + " paws");
        System.out.println("Sheppard has " + sheppard.getTail() + " tail");
    }

}
