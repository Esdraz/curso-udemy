package application;

public class BoxingUnboxingWrapperProgram {

    public static void main(String[] args) {

        //Boxing
        int x = 20;
        Object obj = x;
        System.out.println(obj);

        //Unboxing (casting)
        int y = (int) obj;

        System.out.println(y);

        //Wrapper são objetos dos tipos primitivos
/*      byte -- Byte
        short -- Short
        int -- Integer
        long -- Long
        float -- Float
        double -- Double
        char -- Character
        boolean -- Boolean
        */


    }
}
