

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DrinksTest.
 *
 * @author  (Daksh)
 * @version (1)
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
    public void testContainsAlchohol()
    {
        Drinks drinks1 = new Drinks("margarita", true, false, false);
        assertEquals(true, drinks1.containsAlcohol());
    }

    @Test
    public void testContainsDairy()
    {
        Drinks drinks1 = new Drinks("latte", false, true, true);
        assertEquals(true, drinks1.containsdairy());
    }

    @Test
    public void testHotOrCold()
    {
        Drinks drinks1 = new Drinks("hot chocolate", false, true, true);
        assertEquals(true, drinks1.hotOrCold());
    }
}




