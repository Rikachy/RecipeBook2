import java.util.ArrayList;
/**
 * Write a description of class RecipeBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RecipeBook
{
    // instance variables - replace the example below with your own
    private String title;
    private String author;
    private String edition;
    private String publicationDate;
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
        //Give a brief description of what the book contains, prints the fields title, author, edition, publicationDate,     
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
        //while loop to iterate threw the tags collection and return all the recipes related to that tag 
    }
    
    public void searchSpecificRecipe()
    {
        //while loop to iterate threw the recipe collection and check if there is the recipe entered in the parameter   
    }
    
    public void searchByIngredient()
    {
            
    }
    
    public void printRecipeDetails()
    {
        
    }
    
    public void listTopRatedRecipe()
    {
        
    }
    
    public void addOwnRecipe()
    {
        
    }
}
