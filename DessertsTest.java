

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DessertsTest.
 *
 * @author  (Richard)
 * @version (a version number or a date)
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
    public void TestingDesserts()
    {
        Desserts desserts1 = new Desserts();
        assertEquals(false, desserts1.checkBaked());
        assertEquals(false, desserts1.isGlutenFree());
        //Default state of a boolean is false
        
        
        
        
        
        
        
    }

    @Test
    public void Test2Dessers()
    {
        Desserts desserts2 = new Desserts();
        assertEquals("Super Duper Sweet", desserts2.getSweetLevel());
        
        assertEquals("Soft", desserts2.getTexture());
        
    }
}


