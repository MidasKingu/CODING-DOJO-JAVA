import java.util.Arrays;
import java.util.List;

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
    void max(int[] array) {
        int max = array[0];
        for(int i = 1 ; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
    }

    void average(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum/array.length);
    }

    void greaterThanY(int[] array, int y) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if( array[i] > y) {
                count++;
            }
        }
        System.out.println(count);
    }

    void valuesElevated(int[] array) {

        for (int i = 0 ; i < array.length; i++){
            array[i] = array[i] * array[i];
        }
        System.out.printf(Arrays.toString(array));
    }
    void replaceNegatives(int[] array) {

        for (int i = 0 ; i < array.length; i++){
            if(array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.printf(Arrays.toString(array));
    }
    void minMaxAndAvg(int[] array) {
        int max = array[0];
        int min = array[0];
        int sum = 0;
        int[] values = {max,min,sum/array.length};
        for(int i = 1 ; i < array.length; i++) {
            sum += array[i];
            if(max < array[i]){
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(Arrays.toString(values));
    }

}
