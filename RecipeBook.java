import java.util.ArrayList;
/**
 * Write a description of class RecipeBook here.
 *
 * @author (Daksh Balram)
 * @version (a version number or a date)
 */
public class RecipeBook
{
    private String title = "getting cooked";
    private String author = "Rich Dax";
    private String edition = "67th";
    private String publicationDate = "04,01,67";
    private int pageNumber;
    private ArrayList<Recipe> recipes;
    private ArrayList<Tags> tags;
    /**
    * Constructor for objects of class RecipeBook
    */
    public RecipeBook()
    {

    }
    
    public void printBookDetails()
    {
        System.out.println("-------- " + title + " --------");
        System.out.println("  ------  " + "by " + author + "   ------  ");
        System.out.println(edition + "edition");
        System.out.println("published" + publicationDate);
        System.out.println();     
    }
    
    public void listAllRecipes()
    {
        for(int i = 0; i > recipes.size(); i++)
        {
            recipes.get(i);
            System.out.println(i);
        }
    }
    
    public void listByType()
    {
        for(int i = 0; i > tags.size(); i++)
        {
            tags.get(i);
            System.out.println(i);
        }
    }
    
    public void searchByTags(Tags tag)
    {
        int i = 0;
        while(i > tags.size())
        {
            if(tags.contains(tag))
            {
                //to be continued    
            }
            i++;
        }
        //while loop to iterate through the tags collection and return all the recipes related to that tag 
    }
    
    public void searchSpecificRecipe(String recipe)
    {
        int i = 0;
        while(i > recipes.size())
        {
            if(recipes.contains(recipe))
            {
                System.out.println(recipe);
            } else {
                System.out.println("not a recipe");
            }
            i++;
        }
        /*while loop to iterate through the recipe collection and check if there is the recipe entered in the parameter
         * if recipes contains recipe return recipe
         * else print ("not a recipe")
         */   
    }
    
    public void searchByIngredient(String ingredient)
    {
        /*for each loop to iterate through recipe collection and 
         * if it contains the ingredient return all recipes containing that ingredient.
         */            
    }
    
    public void printRecipeDetails(String recipe)
    {
        
        //gets the recipe and prints the description field from the Recipe.Class       
    }
    
    public void listTopRatedRecipe()
    {
        //while loop to go through the ratings and compare them and return the highest rated one        
    }
    
    public void addOwnRecipe()
    {
        //get prompts from the the scanner to add the ingredients, steps and preptime    
    }
}
