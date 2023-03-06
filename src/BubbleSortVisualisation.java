public class BubbleSortVisualisation {

    /*
    * Solution
    * @param array -> array to perform solution on
    */
    static void runProgram(int[] array){
        System.out.println("RUNNING PROGRAM FOR:");
        System.out.println("Initial Array: " + displayArray(array) + "\n");     //displays initial array
        bubbleSort(array);  //sorted
        System.out.println("Sorted Array: " + displayArray(array));             //displays sorted array
        System.out.println("PROGRAM ENDED\n\n");
    }
    /*
    * Classic Bubble Sort
    * @param arr -> array to perform the sort upon
    * Calls visualise() after each pass to display current array in visual format
    */
    static void bubbleSort(int[] arr){
        visualise(arr);
        boolean swapped;
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
            visualise(arr);
        }
    }
    /*
    * Outputs array in a visual, bar-chart style format
    * @param arr -> array to display
    */
    static void visualise(int[] arr){
        int max = 0;
        for (int e : arr){
            if (e > max){
                max = e;
            }
        }
        for (int i = max; i > 0; i--) {
            for (int k : arr) {
                if (k >= i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    /*
    * Outputs array
    * Called to display array in written format before/after sort
    * @param arr -> array to display
    * @returns output -> array displayed as a String
    */
    static StringBuilder displayArray(int[] arr) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            output.append(arr[i]);
            if (i != arr.length - 1){
                output.append(" , ");
            }
        }
        return output;
    }
}
