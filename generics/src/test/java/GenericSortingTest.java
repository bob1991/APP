import GenericAlgorithmes.GenericInsertionSort;
import GenericAlgorithmes.GenericMergeSort;
import GenericAlgorithmes.GenericQuickSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by bobkuipers on 23/02/2018.
 */
public class GenericSortingTest {
    GenericInsertionSort<Integer> genericInsertionSort = new GenericInsertionSort<Integer>();

    Integer[] unsorted = new Integer[]{5,6,4,1,2};
    Integer[] sorted = new Integer[]{1,2,4,5,6};



    @Test
    public void genericInsorteionTest(){
        genericInsertionSort.genericInsertionSort(unsorted);

        assertArrayEquals(unsorted,sorted);
    }

    @Test
    public void mergeSortTest(){
        GenericMergeSort<Integer> genericMergeSort = new GenericMergeSort<Integer>();

        genericMergeSort.genericMergeSort(unsorted);

        assertArrayEquals(unsorted,sorted);

    }

    @Test
    public void quickSortTest(){
        GenericQuickSort<Integer> quickSort = new GenericQuickSort<Integer>();

        quickSort.sort(unsorted);

        assertArrayEquals(sorted,unsorted);

    }
}
