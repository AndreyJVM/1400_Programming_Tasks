package pathOne;

import org.junit.Assert;
import org.junit.Test;

public class OutputInformationTest {

    @Test
    public void task1Line31_18_19() {
        Assert.assertEquals("31 18 79", OutputInformation.task1Line31_18_19());
    }

    @Test
    public void task2Line47__52__150() {
        Assert.assertEquals("47  52  150", OutputInformation.task2Line47__52__150());
    }

    @Test
    public void task3Return50down10() {
        Assert.assertEquals("50\n10", OutputInformation.task3Return50down10());
    }

    @Test
    public void task4Return5Down10Down150() {
        Assert.assertEquals("5\n10\n21", OutputInformation.task4Return5Down10Down150());
    }

    @Test
    public void task5Return1Down2() {
        Assert.assertEquals("1\n2", OutputInformation.task5Return1Down2());
    }

    @Test
    public void task6OutputPI() {
        Assert.assertEquals("3.142", OutputInformation.task6OutputPI());
    }
}