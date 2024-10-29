public class L8Operators {
    public static void main(String[] args) {

  /*    ==  !=  < > <= >= && || ?:
        == - дорівнює
        != - не дорівнює
        && - "і"
        || - або права тру або ліва тру, то результат тру
        ?: - true/false
   */

        int x = 3;
        int y = 5;
        int z = 8;

        boolean boolVal = x <= y;
        System.out.println("BoolVal = " + boolVal);

        boolean boolVal2 = y > z;

        boolean resultBoolean = boolVal || boolVal2;

        //   true && true = true
        //   true && false = false
        //   true || false = true
        //   false || false = false

        System.out.println("resultBoolean = " + resultBoolean);

        int res = x > y ? x : y;
        //   якщо  x < y - тру, то повертає значення після ?, якщо фолс - то повертає значення після :
        System.out.println("Ternary sesult = " + res);

        int anotherRes = (x > y) && (z < y) ? x : y;
        System.out.println("Another Res = " + anotherRes);

    }
}
