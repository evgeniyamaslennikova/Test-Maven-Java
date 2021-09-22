import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DemoTest {

    @Test
    public void test_Pass() {
        Assert.assertTrue(true);
    }

    @Test
    public void test_Fail() {
        Assert.assertFalse(false);
    }
}
