import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        try {
            for(int i = 0; i < myList.size(); i++) {
                int castedValue = (int) myList.get(i);
                System.out.println(castedValue);
            }
        }catch (Exception err) {
            System.out.println(err);
        }


    }
}