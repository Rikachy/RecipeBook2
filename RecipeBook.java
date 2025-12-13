import java.util.ArrayList;
import java.util.Scanner;
/**
 * The RecipeBook class represents a collection of recipes.
 * Users can interact with the recipes.
 *
 * @author (Daksh Balram)
 * @version (1)
 */
public class RecipeBook
{
    private String title = "getting cooked";
    private String author = "Rich Dax";
    private String edition = "67th";
    private String publicationDate = "04/01/67";
    private ArrayList<Recipe> recipes;
    private ArrayList<Tags> tags;
    
    
    /**
    * Constructs a RecipeBook object and initializes it with a few recipes.
    */
    public RecipeBook()
    {
        recipes = new ArrayList<>();
        tags = new ArrayList<>();
        
        Desserts cake = new Desserts("Chocolate Cake", true, "Soft", "High");
        cake.addIngredient("flour", 7/4, UnitOfMeasurement.CUP);
        cake.addIngredient("sugar", 2, UnitOfMeasurement.CUP);
        cake.addIngredient("cocoa powder", 3/4, UnitOfMeasurement.CUP);
        cake.addIngredient("baking soda", 3/2, UnitOfMeasurement.TSP);
        cake.addIngredient("baking powser", 3/2, UnitOfMeasurement.TSP);
        cake.addIngredient("eggs", 2, UnitOfMeasurement.UNIT);
        cake.addStep("Mix dry ingredients");
        cake.addStep("Add eggs");
        cake.addStep("Bake for 30 minutes");
        recipes.add(cake);
        tags.add(Tags.GLUTEN);
        
        Desserts pie = new Desserts("Apple pie", true, "flaky", "Medium");
        pie.addIngredient("apples", 7, UnitOfMeasurement.CUP);
        pie.addIngredient("sugar", 1, UnitOfMeasurement.CUP);
        pie.addIngredient("flour", 3, UnitOfMeasurement.TBSP);
        pie.addIngredient("butter", 2, UnitOfMeasurement.TBSP);
        pie.addIngredient("nutmeg", 1/8, UnitOfMeasurement.TBSP);
        pie.addStep("Combine apples, suggar, flour and nutmeg");
        pie.addStep("Dot with butter");
        pie.addStep("bake until crust is golden(40 - 50 mins)");
        recipes.add(pie);
        
        Snacks bananaBites = new Snacks(true, "Chocolate banana bites");
        bananaBites.addIngredient("banana", 1, UnitOfMeasurement.UNIT);
        bananaBites.addIngredient("chocolate chips", 2, UnitOfMeasurement.OUNCE);
        bananaBites.addStep("peel the banana and and cut it into slices");
        bananaBites.addStep("microwave the chocolate for 30s");
        bananaBites.addStep("dip banana in chocolate then freeze");
        recipes.add(bananaBites);
        
        Snacks toast = new Snacks(true, "Guacamole toast");
        toast.addIngredient("avocado", 2, UnitOfMeasurement.UNIT);
        toast.addIngredient("bread", 1, UnitOfMeasurement.UNIT);
        toast.addStep("toast a slice of bread");
        toast.addStep("mix avocados together to make guacamole");
        toast.addStep("apply guacamole to the slice");
        recipes.add(toast);
        
        Drinks milk = new Drinks("Chocolate milk", false, true, false);
        milk.addIngredient("milk", 1, UnitOfMeasurement.CUP);
        milk.addIngredient("chocolate powder", 2, UnitOfMeasurement.TBSP);
        milk.addStep("pour the milk in to a glass");
        milk.addStep("mix powder in milk");
        milk.addStep("can warm up the milk before if you want it hot");
        recipes.add(milk);
        
        Drinks margarita = new Drinks("Margarita", true, false, false);
        margarita.addIngredient("tequila", 2, UnitOfMeasurement.OUNCE);
        margarita.addIngredient("lime juice", 1, UnitOfMeasurement.OUNCE);
        margarita.addIngredient("ice ", 1, UnitOfMeasurement.OUNCE);
        margarita.addIngredient("Coarse Salt", 1/4, UnitOfMeasurement.CUP);
        margarita.addStep("salt the rim");
        margarita.addStep("combine salt with lime");
        margarita.addStep("pour into wine glass and add ice");
        recipes.add(margarita);
    }
    
    /**
    * Prints the title, author, edition and the publication date of the recipe book.
    */
    public void printBookDetails()
    {
        System.out.println("====================================");
        System.out.println("           " + title);
        System.out.println("====================================");
        System.out.println("Author      : " + author);
        System.out.println("Edition     : " + edition + " edition");
        System.out.println("Published   : " + publicationDate);
        System.out.println("====================================");
    }
    
    /**
    * Displays all recipes currently stored in the recipe book.
    */
    public void listAllRecipes()
    {
            for(int i = 0; i < recipes.size(); i++)
        {
            System.out.println(recipes.get(i));
        }
    }
    
    /**
    * Searches for and prints all recipes that contains the given tag.
    * 
    * @param tag the tag you want to seach for
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
    }
    
    /**
    * Searches for a recipe by name and prints its description if the recipe is found.
    * 
    * @param recipeName the name of the recipe to search for
    */
    public void searchSpecificRecipe(String recipeName)
    {
        boolean found = false;
        for (Recipe recip : recipes)
        {
            if(recip.getName().equals(recipeName))
            {
                System.out.println(recip.getName());
                System.out.println(recip.getDescription());
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("not a recipe");    
        }
    }
    
    /**
    * Searches for prints all recipes that contain the specified ingredient.
    * 
    * @param ingredient the ingredient to search for
    */
    public void searchByIngredient(String ingredient)
    {
        for (Recipe r : recipes)
        {
            for(Ingredients ing : r.getIngredients())
            {
                if(ing.getName().equals(ingredient))
                {
                    System.out.println(r);
                }   
            }
        }          
    }
    
    /**
    * Prints the description of a recipe with the given name.
    * 
    * @param recipeName the name of the recipe that you want the details of
    */
    public void printRecipeDetails(String recipeName)
    {
         for (Recipe r : recipes)
        {
            if (r.getName().equalsIgnoreCase(recipeName))
            {
                System.out.println(r.getDescription());
            }
        }       
    }
    
    /**
    * Finds and prints the highest rated recipes in the recipe book.
    */
    public void listTopRatedRecipe()
    {
      
    }
    
    /**
    * Allows the user to add a new recipe to the recipe book
    */
    public void addOwnRecipe()
    {
 
    }
    
    /**
    * Adds a comment and rating to a specified recipe.
    * 
    * @param recipeName the name of the recipe
    * @param username the name of the person making the comment
    * @param text the comment 
    * @param rating the rating given to the recipe
    */
    public void addCommentToRecipe(String recipeName, String username, String text, int rating) 
    {
        for (Recipe r : recipes) {
            if (r.getName().equalsIgnoreCase(recipeName)) {
                r.addComment(username, text, rating, recipeName);
                System.out.println("Comment added");
                return;
            }
        }
        System.out.println("Recipe not found");
    }
    
    /**
    * Calculates and returns the average rating for a given recipe.
    * 
    * @param recipeName the name of the recipe
    * @return the average rating of the recipe
    */
    public double getAverageRating(String recipeName) 
    {
        for (Recipe r : recipes) {
            if (r.getName().equalsIgnoreCase(recipeName)) {
                return r.calcAverageRating(); 
            }
        }
        System.out.println("Recipe not found");
        return 0.0;
    }
    
    /**
    * Returns the most popular rating for a recipe.
    * 
    * @param recipeName the name of the recipe
    * @return the most popular rating
    */
    public int getModeRating(String recipeName)
    {
        for (Recipe r : recipes) {
            if (r.getName().equalsIgnoreCase(recipeName)) {
                return r.getModeRating(); 
            }
        }
        System.out.println("Recipe not found");
        return 0; 
    } 
    
    /**
    * Adds a new step to the specified recipe.
    * 
    * @param recipeName the name of the recipe
    * @param step the step to be added
    */
    public void addStepToRecipe(String recipeName, String step) 
    {
        for (Recipe r : recipes) {
            if (r.getName().equalsIgnoreCase(recipeName)) {
                r.addStep(step);  
                System.out.println("Step added");
                return;
            }
        }
        System.out.println("Recipe not found");
    }
    
    /**
    * Driver method allowing the user to run the recipe book
    */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        RecipeBook recipeBook = new RecipeBook();
            
        recipeBook.printBookDetails();
        
        boolean running = true;
        
        while(running)
        {
            System.out.println("\nRecipe book options");
            System.out.println("1. List all recipes");
            System.out.println("2. Search recipe by name");
            System.out.println("3. Search recipes by ingredients");
            System.out.println("4. Add comment to a recipe");
            System.out.println("5. Get average rating for a recipe");
            System.out.println("6. Exit");
            System.out.print("\nChoose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
        
            switch (choice)
            {
                case 1: recipeBook.listAllRecipes();
                        System.out.print("\nEnter a recipe name: ");
                        String r = sc.nextLine();
                        recipeBook.printRecipeDetails(r);
                        System.out.println("\nType anything to head back to the option menu: ");
                        String option = sc.nextLine();                         
                        break;
                        
                case 2: System.out.print("Enter a recipe name: ");
                        String name = sc.nextLine();
                        recipeBook.searchSpecificRecipe(name);
                        break;
                        
                case 3: System.out.print("Enter ingredient name: ");
                        String ingredient = sc.nextLine();
                        recipeBook.searchByIngredient(ingredient);
                        break;
                        
                case 4: System.out.print("Enter recipe name: ");
                        String recipeName = sc.nextLine();
                        System.out.print("Enter your name: ");
                        String username = sc.nextLine();
                        System.out.print("Enter your comment: ");
                        String comment = sc.nextLine();
                        System.out.print("Enter rating (1-5): ");
                        int rating = sc.nextInt();
                        sc.nextLine();
                        recipeBook.addCommentToRecipe(recipeName, username, comment, rating);
                        break;
                    
                case 5: System.out.print("Enter recipe name: ");
                        String recipe = sc.nextLine();
                        System.out.println("average rating: " + recipeBook.getAverageRating(recipe));
                        break;
                        
                case 6: System.out.print("bye bye!");
                        running = false;
                        break;
                        
                default: System.out.println("Invalid Option");
                
            }
        }
        sc.close();
    }
}
