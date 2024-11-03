public class L20_BigDog extends L17_Dog {
    //extends - наследует другой класс,
    // типо продолжение, расширение функционала.
    //и если какой-то метод или переменная предыдущего класса
    //имеет тип protected, то будет ошибка и они не будут унаследованы.

    @Override
    public void setSize(String size) {
        super.setSize(size);
    }

    //private, package-private(default), protected, public


