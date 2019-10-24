import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void test() {
        Hello h = new Hello();

        assertEquals(5, h.add(2, 3));
    }
}
