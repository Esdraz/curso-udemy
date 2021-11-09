package application;

public class ForEachProgram {

    public static void main(String[] args) {

        String[] vector = new String[]{"Maria", "João", "Pedro"};

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        System.out.println("-----------------------");

        //for each - para cada objeto contigo no obj faça...
        for (String obj : vector) {
            System.out.println(obj);
        }
    }
}
