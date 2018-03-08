import java.util.Arrays;

/**
 * Created by bobkuipers on 21/02/2018.
 */
public class Main {
    public static void main(String[] args){
        MergeSort mergeSort = new MergeSort();

        int[] unsortedArray = {1,8,5,6,2,3,9};

        mergeSort.mergeSort(unsortedArray);

        System.out.print(Arrays.toString(unsortedArray));
    }
}
