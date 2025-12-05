

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class IngredientsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IngredientsTest
{
    /**
     * Default constructor for test class IngredientsTest
     */
    public IngredientsTest()
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
    public void IngredientsTest1()
    {
        Ingredients ingredie1 = new Ingredients();
        assertEquals(1.0, ingredie1.getAmount(), 0.1);
        assertEquals("Milk", ingredie1.getName());
        ingredie1.listAllIngredients();
        ingredie1.listAllIngredients();
        ingredie1.listAllIngredients();
        ingredie1.setAmount(2);
    }
}

