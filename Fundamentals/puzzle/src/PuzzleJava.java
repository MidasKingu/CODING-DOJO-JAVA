import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    ArrayList<Integer> greaterThanArray() {
        ArrayList<Integer>arr = new ArrayList<Integer>();
        ArrayList<Integer> greatersArray = new ArrayList<Integer>();
        Random r = new Random();
        arr.add(3);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(7);
        arr.add(9);
        arr.add(8);
        arr.add(13);
        arr.add(25);
        arr.add(32);
        for(int  i = 0 ; i < arr.size(); i++ ) {
            if( arr.get(i) > 10) {
                greatersArray.add(arr.get(i));
            }
        }
        System.out.println(arr);
        return greatersArray;
    }
    ArrayList<String> shuffleArrAndLongerThan5() {
        ArrayList<String> stringArr = new ArrayList<String>();
        ArrayList<String> greaterArr = new ArrayList<String>();
        stringArr.add("Nancy");
        stringArr.add("Jinichi");
        stringArr.add("Fujibayashi");
        stringArr.add("Momochi");
        stringArr.add("Ishikawa");
        Collections.shuffle(stringArr);
        for ( int i = 0 ; i < stringArr.size(); i++ ) {
            System.out.println(stringArr.get(i));
            if(stringArr.get(i).length() > 5) {
                greaterArr.add(stringArr.get(i));
            }
        }
        return greaterArr;
    }
}
