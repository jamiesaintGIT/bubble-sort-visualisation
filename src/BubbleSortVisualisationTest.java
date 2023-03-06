import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.DisplayName;           //displays test case name
import org.junit.jupiter.api.Test;                  //defines functions as tests

import java.util.Arrays;
import java.util.Random;                            //allows creation of random array



class BubbleSortVisualisationTest {

    /*
    * Worst case - 20 elements
    */
    @Test
    @DisplayName("[1] Long reversed")
    void testCase1(){
        int[] testArray = {20,19,18,17,16,15,14,14,14,13,12,12,11,10,10,10,10,10,10,10,9,8,7,6,5,5,4,3,2,1};
        BubbleSortVisualisation.runProgram(testArray);
        assertArrayEquals(new int[]{1,2,3,4,5,5,6,7,8,9,10,10,10,10,10,10,10,11,12,12,13,14,14,14,15,16,17,18,19,20}, testArray);

    }

    /*
    * Worst case - 5 elements
    */
    @Test
    @DisplayName("[2] Short reversed")
    void testCase2(){
        int[] testArray = {5,4,3,2,1};
        BubbleSortVisualisation.runProgram(testArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, testArray);
    }

    /*
    * Best Case - 5 elements
    */
    @Test
    @DisplayName("[3] Short sorted")
    void testCase3(){
        int[] testArray = {1,2,3,4,5};
        BubbleSortVisualisation.runProgram(testArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, testArray);
    }

    /*
    * Pre-defined random - 20 elements
    */
    @Test
    @DisplayName("[4] Long  set-random")
    void testCase4(){
        int[] testArray = {4, 6, 11, 18, 10, 3, 13, 16, 1, 9, 8, 2, 12, 20, 7, 19, 5, 15, 17, 14};
        BubbleSortVisualisation.runProgram(testArray);
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}, testArray);
    }

    /*
    * Random array - 25 elements
    * Creates new array each time test is called
    */
    @Test
    @DisplayName("[5] Long true-random")
    void testCase5(){
        int[] testArray = getRandomArray();
        BubbleSortVisualisation.runProgram(testArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25}, testArray);
    }


    /*
    * Generates random array of 25 elements
    * Rules -> [1:25] inclusive, no-repeating elements
    * Calls contains to prevent repeats
    */
    private int[] getRandomArray(){
        int[] arr = new int[25];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int num;
            do {
                num = rand.nextInt(25) + 1;
            } while (contains(arr, num));
            arr[i] = num;
        }
        return arr;
    }

    /*
    * Checks if array contains a value
    * @param arr -> array to search through
    * @param num -> value to search for
    * Used to ensure no-repeating elements in an array
    */
    boolean contains(int[] arr, int num){
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }
}
