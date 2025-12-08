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
    // moved to Recipe private ArrayList<Tags> tags;
    /**
    * Constructor for objects of class RecipeBook
    */
    public RecipeBook()
    {
        
        recipes = new ArrayList<>();
    }
    
    public void printBookDetails()
    {
        System.out.println("-------- " + title + " --------");
        System.out.println("  ------  " + "by " + author + "   ------  ");
        System.out.println("  ------  " + edition + " edition" + "   ------  ");
        System.out.println("published" + publicationDate);
        System.out.println();     
    }
    
    public void listAllRecipes()
    {
        for(int i = 0; i < recipes.size(); i++)
        {
            System.out.println(recipes.get(i));
        }
    }
    /*
    public void listByType()
    {
        for(int i = 0; i < tags.size(); i++)
        {
            System.out.println(tags.get(i));
        }
    }
    */
    public void searchByTags(Tags tag)
    {
        for (Recipe recipe : recipes)
        {
            if(recipe.getTags().contains(tag))
            {
                System.out.println(recipe);
            }
        }
        
        //for loop to iterate through the tags collection and return all the recipes related to that tag 
    }
    
    public void searchSpecificRecipe(String recipeName)
    {
        boolean found = false;
        for (Recipe recip : recipes)
        {
            if(recip.getName().equals(recipeName))
            {
                System.out.println(recip.getDescription());
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("not a recipe");    
        }
        /*while loop to iterate through the recipe collection and check if there is the recipe entered in the parameter
         * if recipes contains recipe return recipe
         * else print ("not a recipe")
         */   
    }
    
    public void searchByIngredient(String ingredient)
    {
        for (Recipe r : recipes)
        {
            if(r.getIngredients().contains(ingredient))
            {
                System.out.println(r);
            }
        }
        /*for each loop to iterate through recipe collection and 
         * if it contains the ingredient return all recipes containing that ingredient.
         */            
    }
    
    public void printRecipeDetails(String recipeName)
    {
         for (Recipe r : recipes)
        {
            if (r.getName().equalsIgnoreCase(recipeName))
            {
                System.out.println(r.getDescription());
            }
        }
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
