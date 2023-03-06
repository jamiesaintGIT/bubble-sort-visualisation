import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Random;

class BubbleSortVisualisationTest {
    @Test
    @DisplayName("[1] Long reversed")
    void testCase1(){
        int[] testArray = {20,19,18,17,16,15,14,14,14,13,12,12,11,10,10,10,10,10,10,10,9,8,7,6,5,5,4,3,2,1};
        BubbleSortVisualisation.runProgram(testArray);

    }
    @Test
    @DisplayName("[2] Short reversed")
    void testCase2(){
        int[] testArray = {5,4,3,2,1};
        BubbleSortVisualisation.runProgram(testArray);
    }

    @Test
    @DisplayName("[3] Short sorted")
    void testCase3(){
        int[] testArray = {1,2,3,4,5};
        BubbleSortVisualisation.runProgram(testArray);
    }

    @Test
    @DisplayName("[4] Long  set-random")
    void testCase4(){
        int[] testArray = {4, 6, 11, 18, 10, 3, 13, 16, 1, 9, 8, 2, 12, 20, 7, 19, 5, 15, 17, 14};
        BubbleSortVisualisation.runProgram(testArray);
    }

    @Test
    @DisplayName("[5] Long true-random")
    void testCase5(){
        int[] testArray = getRandomArray();
        BubbleSortVisualisation.runProgram(testArray);
    }



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

    boolean contains(int[] arr, int num){
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }
}
