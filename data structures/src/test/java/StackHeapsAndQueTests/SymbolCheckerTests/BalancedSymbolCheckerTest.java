package StackHeapsAndQueTests.SymbolCheckerTests;

import org.junit.Test;
import stackHeapsAndQue.SymbolChecker.BalanceSymbolChecker;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by bobkuipers on 26/02/2018.
 */
public class BalancedSymbolCheckerTest {
    BalanceSymbolChecker sut = new BalanceSymbolChecker();

    @Test
    public void correctSymbolTest(){
        String symbols = "{()}";

        assertEquals(sut.testString(symbols),true);
    }
}
