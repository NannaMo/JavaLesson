public class L17_Dog {
    private int paws = 4; // private - запрещает напрямую модифицировать значение при использовании в других классах.
    private int tail = 1;
    private String name;
    private String breed;

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
}