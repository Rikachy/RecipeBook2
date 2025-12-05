

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SnacksTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
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
    public void TestGuac()
    {
        Snacks snacks1 = new Snacks();
        assertEquals(false, snacks1.checkIfGuacamoly());
    }
}

