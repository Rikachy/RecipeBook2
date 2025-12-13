

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SnacksTest.
 *
 * @author  (Daksh)
 * @version (1)
 */
public class SnacksTest
{
    /**
     * Default constructor for test class SnacksTest
     */
    public SnacksTest()
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
    public void testGuac()
    {
        Snacks snacks1 = new Snacks(true, "donut");
        assertEquals(false, snacks1.checkIfGuacamoly());
    }

    @Test
    public void testSchoolApproriate()
    {
        Snacks snacks1 = new Snacks(true, "gummies");
        assertEquals(true, snacks1.isSchoolAppropriate());
    }
}



