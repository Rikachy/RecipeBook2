
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * The test class RecipeTest.
 *
 * @author  (Daksh)
 * @version (1)
 */
public class RecipeTest
{
    private Recipe testRecipe;
    /**
     * Default constructor for test class RecipeTest
     */
    public RecipeTest()
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
        testRecipe = new Recipe("Mushroom Risotto");
        
        testRecipe.addIngredient("Rice", 1.0, UnitOfMeasurement.CUP);
        testRecipe.addIngredient("Broth", 4.0, UnitOfMeasurement.CUP);
        testRecipe.addIngredient("Mushroom", 8.0, UnitOfMeasurement.OUNCE);
        testRecipe.addStep("Add rice and toast.");
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
    public void testAddIngredient()
    {
        assertEquals(3, testRecipe.getIngredients().size());
        
        testRecipe.addIngredient("Parmesan", 1.0/2, UnitOfMeasurement.CUP);
        assertEquals(4, testRecipe.getIngredients().size());
    }
    
    @Test
    public void testAddSteps()
    {
        assertEquals(1, testRecipe.getSteps().size());
        
        testRecipe.addStep("Stir for 20 minutes");
        assertEquals(2, testRecipe.getSteps().size());
    }
    
    @Test
    public void testAddComment()
    {
        Recipe recipe1 = new Recipe("donut");
        assertEquals(true, recipe1.addComment("michael", "pretty good", 4, "donut"));
        assertEquals(false, recipe1.addComment("Jeff", "SOO GOOD", 6, "donut"));
        assertEquals(false, recipe1.addComment("Mike", "Disgusting", 0, "donut"));
    }
}
