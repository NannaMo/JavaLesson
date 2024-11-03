import java.time.temporal.ValueRange;

public class L17_Main {
    public static void main(String[] args) {

        System.out.println("Dog's count " + L17_Dog.getDogsCount());

        L17_Dog lab = new L17_Dog();
        lab.setName("Charley");
        lab.setBreed("Lab");
        lab.setSize(L21_Size.AVERAGE);
        lab.bite();

        // Ctrl + Shift + / - закомментировать область
        L17_Dog sheppard = new L17_Dog();
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");
        sheppard.setSize(L21_Size.BIG);
        sheppard.bite();

        L17_Dog doberman = new L17_Dog();
        doberman.setName("Jack");
        doberman.setBreed("Doberman");
        doberman.setSize(L21_Size.BIG);
        doberman.bite();

        /*System.out.println("Lab's name is " + lab.getName());
        System.out.println("Sheppard's name is " + sheppard.getName());
        System.out.println("Lab has " + lab.getPaws() + " paws");
        System.out.println("Sheppard has " + sheppard.getTail() + " tail");*/

        L21_Size s = L21_Size.SMALL;
        L21_Size s1 = L21_Size.valueOf("BIG");
        //System.out.println(s1);

        L21_Size[] values = L21_Size.values();
        for(int i = 0; i< values.length; i++) {
            System.out.println(values[i]);
        }

    }



}
