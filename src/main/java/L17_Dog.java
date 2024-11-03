public class L17_Dog {

    private static int dogsCount;

    public L17_Dog() {
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);
    }

    private int paws = 4; // private - запрещает напрямую модифицировать значение при использовании в других классах.
    private int tail = 1;
    private String name;
    private String breed;
    private String size;



    public static int getDogsCount() {
        return dogsCount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Average") ||
                size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.out.println("Size should be one of these: Big, Average or Small");
        }
    }
//Shift + 6 - исправляет опечатки во всех связях (предварительно нужноыделить слово).

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            System.out.println("User tried to assign " + paws + " paws for a dog");
            System.out.println("Correct number is 4");
        }

        // Сгенерировать set и get можно комбинацией Alt+Insert

    }

    public int getPaws() {
        return paws;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else {
            System.out.println("User tried to assign " + tail + " tails for a dog");
            System.out.println("Correct number is 1");
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        if (size.equalsIgnoreCase("Big")) {
            System.out.println("Wof - Wof");
        } else if (size.equalsIgnoreCase("Average")) {
            System.out.println("Raf - Raf");
        } else {
            System.out.println("Tiaf - Tiaf");
        }
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }
    }
}