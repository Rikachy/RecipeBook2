

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RecipeBookTest.
 *
 * @author  (Richard)
 * @version (1)
 */
public class RecipeBookTest
{
    /**
     * Default constructor for test class RecipeBookTest
     */
    public RecipeBookTest()
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
    public void testCommentsandList()
    {
        RecipeBook recipeBo1 = new RecipeBook();
        recipeBo1.addOwnRecipe();
        recipeBo1.addCommentToRecipe("hot water", "abby", "Good", 5);
        recipeBo1.addOwnRecipe();
        recipeBo1.addCommentToRecipe("hot WAter", "nolly", "", 2);
        recipeBo1.addCommentToRecipe("hot water", "booly", "", 2);
        assertEquals(2, recipeBo1.getModeRating("hot water"));
        assertEquals(3, recipeBo1.getAverageRating("hot water"), 0.1);
        recipeBo1.listAllRecipes();
        recipeBo1.listTopRatedRecipe();
        recipeBo1.printBookDetails();
        recipeBo1.printRecipeDetails("margarita");
        recipeBo1.scaleRecipeIngredients("margarita", 3);
        recipeBo1.printRecipeDetails("margarita");
    }

    @Test
    public void testSearchBy()
    {
        RecipeBook recipeBo1 = new RecipeBook();
        recipeBo1.searchByIngredient("apples");
        recipeBo1.searchByTags(Tags.GLUTEN);
        recipeBo1.searchSpecificRecipe("apple pie");
    }

    @Test
    public void testAddTagandAddsteps()
    {
        RecipeBook recipeBo1 = new RecipeBook();
        recipeBo1.addOwnRecipe();
        recipeBo1.addTag("fries and chips", Tags.SPICY);
        recipeBo1.addStepToRecipe("fries and chips", "buy chips");
        recipeBo1.addStepToRecipe("fries and chips", "put chips in a bag");
        recipeBo1.addStepToRecipe("fries and chips", "put the fries in the bag");
        recipeBo1.searchByTags(Tags.SPICY);
    }


}








