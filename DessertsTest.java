

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DessertsTest.
 *
 * @author  (Richard)
 * @version (1)
 */
public class DessertsTest
{
    /**
     * Default constructor for test class DessertsTest
     */
    public DessertsTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }


    @Test
    public void testAllMethods()
    {
        Desserts desserts1 = new Desserts("banana pie", true, "Crunchy", "high");
        assertEquals(true, desserts1.checkBaked());
        assertEquals("high", desserts1.getSweetLevel());
        assertEquals("crunchy", desserts1.getTexture());
        assertEquals(false, desserts1.isGlutenFree());
        desserts1.setTexture("crispy");
        assertEquals("crispy", desserts1.getTexture());
    }
}



