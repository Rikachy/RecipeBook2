

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DrinksTest.
 *
 * @author  (Richard)
 * @version (a version number or a date)
 */
public class DrinksTest
{
    /**
     * Default constructor for test class DrinksTest
     */
    public DrinksTest()
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
    public void HotTest()
    {
        Drinks drinks1 = new Drinks();
        assertEquals(true, drinks1.hotOrCold());
    }
}

