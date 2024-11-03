import java.text.DecimalFormat;

public class L17_Dog {

    private static int dogsCount;
    // Если мы не указываем тип приватный или публичный,
    // то это значит использование метода или переменной
    // только! в пределах пакета. Package private

    //Protected - тип


    // Конструктор:
    public L17_Dog() {
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);
    }

    public static final int PAWS = 4;
    // private - запрещает напрямую модифицировать значение
    // при использовании в других классах.
    //final - константа !!!
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private L21_Size size = L21_Size.UNDEFINED;

    public static int getDogsCount() {
        return dogsCount;
    }

    public L21_Size getSize() {
        return size;
    }

    public void setSize(L21_Size size) {
        this.size = size;
       /* if (size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Average") ||
                size.equalsIgnoreCase("Small")) {
            this.size = size;
        } else {
            System.out.println("Size should be one of these: Big, Average or Small");
        }*/
    }
//Shift + 6 - исправляет опечатки во всех связях (предварительно нужноыделить слово).

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    /*protected void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("User tried to assign " + paws + " paws for a dog");
            System.out.println("Correct number is 4");
        }

    } */

    }*/


        // Сгенерировать set и get можно комбинацией Alt+Insert


        public int getPaws () {
            return PAWS;
        }

        public int getTail () {
            return TAIL;
        }


        public String getBreed () {
            return breed;
        }

        public void setBreed (String breed){
            this.breed = breed;
        }


    public void bark() {

        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Wof - Wof");
                break;
            case AVERAGE:
                System.out.println("Raf - Raf");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tiaf - Tiaf");
                break;

        }
    }

        public void bark () {

            switch (size) {
                case BIG:
                case VERY_BIG:
                    System.out.println("Wof - Wof");
                    break;
                case AVERAGE:
                    System.out.println("Raf - Raf");
                    break;
                case SMALL:
                case VERY_SMALL:
                    System.out.println("Tiaf - Tiaf");
                    break;
                default:
                    System.out.println("Dog's size is undefined");

       /* if ("Big".equalsIgnoreCase(size)) {
            System.out.println("Wof - Wof");
        } else if ("Average".equalsIgnoreCase(size)) {
            System.out.println("Raf - Raf");
        } else {
            System.out.println("Tiaf - Tiaf");

        }*/
            }



        }
        public void bite () {
            if (dogsCount > 2) {
                System.out.println("Dogs are biting you");
            } else {
                bark();
            }
        }

}