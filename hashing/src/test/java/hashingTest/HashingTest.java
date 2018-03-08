package hashingTest;

import hashing.Hashing;
import org.junit.Test;

/**
 * Created by bobkuipers on 01/03/2018.
 */
public class HashingTest {
    Hashing hashing = new Hashing();

    @Test
    public void hashTest(){
        hashing.hash("bobkuipers", 101);
    }
}
