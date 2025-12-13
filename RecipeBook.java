import java.util.ArrayList;
import java.util.Scanner;
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
    private String publicationDate = "04/01/67";
    private int pageNumber;
    private ArrayList<Recipe> recipes;
    private ArrayList<Tags> tags;
    
    
    /**
    * Constructor for objects of class RecipeBook
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
    
    public void listAllRecipes()
    {
            for(int i = 0; i < recipes.size(); i++)
        {
            System.out.println(recipes.get(i));
        }
    }
    
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
                System.out.println(recip.getName());
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
            for(Ingredients ing : r.getIngredients())
            {
                if(ing.getName().equals(ingredient))
                {
                    System.out.println(r);
                }   
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
    
    public void addCommentToRecipe(String recipeName, String username, String text, int rating) {
        for (Recipe r : recipes) {
            if (r.getName().equalsIgnoreCase(recipeName)) {
                r.addComment(username, text, rating, recipeName);
                System.out.println("Comment added");
                return;
            }
        }
        System.out.println("Recipe not found");
    }
    
    public double getAverageRating(String recipeName) {
        for (Recipe r : recipes) {
            if (r.getName().equalsIgnoreCase(recipeName)) {
                return r.calcAverageRating(); 
            }
        }
        System.out.println("Recipe not found");
        return 0.0;
    }
    
     public int getModeRating(String recipeName) {
        for (Recipe r : recipes) {
            if (r.getName().equalsIgnoreCase(recipeName)) {
                return r.getModeRating(); 
            }
        }
        System.out.println("Recipe not found");
        return 0; 
    } 
    
    public void addStepToRecipe(String recipeName, String step) {
        for (Recipe r : recipes) {
            if (r.getName().equalsIgnoreCase(recipeName)) {
                r.addStep(step);  
                System.out.println("Step added");
                return;
            }
        }
        System.out.println("Recipe not found");
    }
    
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
