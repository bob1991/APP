package GenericAlgorithmes;

/**
 * Created by bobkuipers on 23/02/2018.
 */
public class TestCompareable<T> implements Comparable<TestCompareable>{
    private int value;

    public int compareTo(TestCompareable o) {
        if(value == o.getValue()) {
            return 0;
        }
        else if(value > o.getValue()) {
            return 1;
        }
        return -1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
