package hashingTest;

import hashing.Hashing;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by bobkuipers on 01/03/2018.
 */
public class hashingModulo10 {

    @Test
    public void hashingModulo10(){
        Hashing hashing = new Hashing();

        int a[] = {4371, 1323, 6173, 4199, 4344, 9679, 1989};
        int[] hashTableArray = new int[10];
        for(int i = 0; i < a.length; i++){
            hashTableArray[hashing.hashMod10(a[i])] = a[i];
        }

        System.out.println(Arrays.toString(hashTableArray));
    }


}
