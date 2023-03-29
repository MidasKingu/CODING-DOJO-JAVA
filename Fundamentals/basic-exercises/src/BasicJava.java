import java.util.Arrays;

public class BasicJava {
    void printFrom1To255() {
        for(int i = 1 ; i <= 255; i++ ) {
            System.out.println(i);
        }
    }
    void printOddFrom1To255() {
        for(int i = 1 ; i <= 255; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    void printSum() {
        int acum = 0;
        for(int i = 0; i <= 255; i++) {
            acum += i;
            System.out.println("Nuevo numero : " +i);
            System.out.println("La suma es : " + acum);
        }
    }
    void iterateArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}
