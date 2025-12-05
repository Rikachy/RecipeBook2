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
        System.out.println(title);
        System.out.println("by " + author);
        System.out.println(edition + "edition");
        System.out.println("published" + publicationDate );
    }
    
    public void printBookDetails()
    {
         
    }
    
    public void listAllRecipes()
    {
        //for loop to print the collection of all the recipes
    }
    
    public void listByType()
    {
        //for loop to print colletion of all the tags 
    }
    
    public void searchByTags(Tags tag)
    {
        //while loop to iterate through the tags collection and return all the recipes related to that tag 
    }
    
    public void searchSpecificRecipe(String recipe)
    {
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
