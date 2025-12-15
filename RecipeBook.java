import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

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
        cake.addIngredient("flour", 7.0/4, UnitOfMeasurement.CUP);
        cake.addIngredient("sugar", 2, UnitOfMeasurement.CUP);
        cake.addIngredient("cocoa powder", 3.0/4, UnitOfMeasurement.CUP);
        cake.addIngredient("baking soda", 3.0/2, UnitOfMeasurement.TSP);
        cake.addIngredient("baking powser", 3.0/2, UnitOfMeasurement.TSP);
        cake.addIngredient("eggs", 2, UnitOfMeasurement.UNIT);
        cake.addStep("Mix dry ingredients");
        cake.addStep("Add eggs");
        cake.addStep("Bake for 30 minutes");
        cake.addComment("Alice", "Delicious!", 5,"Chocolate Cake");
        cake.addComment("Bob", "Too sweet", 4,"Chocolate Cake");
        recipes.add(cake);
        tags.add(Tags.GLUTEN);
        
        Desserts pie = new Desserts("Apple pie", true, "flaky", "Medium");
        pie.addIngredient("apples", 7, UnitOfMeasurement.CUP);
        pie.addIngredient("sugar", 1, UnitOfMeasurement.CUP);
        pie.addIngredient("flour", 3, UnitOfMeasurement.TBSP);
        pie.addIngredient("butter", 2, UnitOfMeasurement.TBSP);
        pie.addIngredient("nutmeg", 1.0/8, UnitOfMeasurement.TBSP);
        pie.addStep("Combine apples, suggar, flour and nutmeg");
        pie.addStep("Dot with butter");
        pie.addStep("bake until crust is golden(40 - 50 mins)");
        pie.addComment("Emma", "Classic and tasty", 5, "Apple pie");
        pie.addComment("Noah", "Could use more cinnamon", 1, "Apple pie");
        recipes.add(pie);
        pie.addTag(Tags.GLUTEN);
        
        Snacks bananaBites = new Snacks(true, "Chocolate banana bites");
        bananaBites.addIngredient("banana", 1, UnitOfMeasurement.UNIT);
        bananaBites.addIngredient("chocolate chips", 2, UnitOfMeasurement.OUNCE);
        bananaBites.addStep("peel the banana and and cut it into slices");
        bananaBites.addStep("microwave the chocolate for 30s");
        bananaBites.addStep("dip banana in chocolate then freeze");
        bananaBites.addComment("Liam", "Super easy and fun", 5, "Chocolate banana bites");
        bananaBites.addComment("Olivia", "Great quick snack", 5, "Chocolate banana bites");
        recipes.add(bananaBites);
        bananaBites.addTag(Tags.VEGAN);
        
        Snacks toast = new Snacks(true, "Guacamole toast");
        toast.addIngredient("avocado", 2, UnitOfMeasurement.UNIT);
        toast.addIngredient("bread", 1, UnitOfMeasurement.UNIT);
        toast.addStep("toast a slice of bread");
        toast.addStep("mix avocados together to make guacamole");
        toast.addStep("apply guacamole to the slice");
        toast.addComment("Ava", "Fresh and healthy", 5, "Guacamole toast");
        toast.addComment("Ethan", "Simple but good", 3, "Guacamole toast");
        recipes.add(toast);
        toast.addTag(Tags.VEGAN);
        
        Drinks milk = new Drinks("Chocolate milk", false, true, false);
        milk.addIngredient("milk", 1, UnitOfMeasurement.CUP);
        milk.addIngredient("chocolate powder", 2, UnitOfMeasurement.TBSP);
        milk.addStep("pour the milk in to a glass");
        milk.addStep("mix powder in milk");
        milk.addStep("can warm up the milk before if you want it hot");
        milk.addComment("Sophia", "Perfect after school drink", 5, "Chocolate milk");
        milk.addComment("Mason", "Could be more chocolaty", 2, "Chocolate milk");
        recipes.add(milk);
        milk.addTag(Tags.DAIRY);
        
        Drinks margarita = new Drinks("Margarita", true, false, false);
        margarita.addIngredient("tequila", 2, UnitOfMeasurement.OUNCE);
        margarita.addIngredient("lime juice", 1, UnitOfMeasurement.OUNCE);
        margarita.addIngredient("ice ", 1, UnitOfMeasurement.OUNCE);
        margarita.addIngredient("Coarse Salt", 1.0/4, UnitOfMeasurement.CUP);
        margarita.addStep("salt the rim");
        margarita.addStep("combine salt with lime");
        margarita.addStep("pour into wine glass and add ice");
        margarita.addComment("Lucas", "Refreshing and strong", 5, "Margarita");
        margarita.addComment("Mia", "Nice balance of flavors", 4, "Margarita");
        recipes.add(margarita);
        margarita.addTag(Tags.VEGAN);
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
     * scales the recipe by a given amount
     * 
     * @param recipeName : the name of the recipe you want to scale
     * @param factor : by how much you want to scale the recipe
     * @return the scaled recipe
     */
    public HashSet<Ingredients> scaleRecipeIngredients(String recipeName, double factor)
    {
        for (Recipe r : recipes)
        {
            if (r.getName().equalsIgnoreCase(recipeName))
            {
                HashSet<Ingredients> scaledIngredients = r.scaleRecipe(factor);
                r.scaleRecipe(factor);
                System.out.println("Scaled recipe: " + recipeName);
                return scaledIngredients;
            }
        }
        System.out.println("Recipe not found");
        return null;
    }
    
    /**
    * Searches for and prints all recipes that contains the given tag.
    * 
    * @param tag the tag you want to seach for
    */
    public void searchByTags(Tags tag)
    {
        boolean found = false;
        for (Recipe recipe : recipes)
        {
            if(recipe.getTags().contains(tag))
            {
                System.out.println(recipe);
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("No recipes are of this tag");
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
            if(recip.getName().equalsIgnoreCase(recipeName))
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
        boolean found = false;
        for (Recipe r : recipes)
        {
            for(Ingredients ing : r.getIngredients())
            {
                if(ing.getName().equalsIgnoreCase(ingredient))
                {
                    System.out.println(r);
                    found = true;
                }   
            }
        }
        if(!found)
        {
            System.out.println("No recipes contains this ingredient");
        }
    }
    
    /**
    * Prints the description of a recipe with the given name.
    * 
    * @param recipeName the name of the recipe that you want the details of
    */
    public void printRecipeDetails(String recipeName)
    {
        boolean found = false;
        for (Recipe r : recipes)
        {
            if (r.getName().equalsIgnoreCase(recipeName))
            {
                System.out.println(r.getDescription());
                found = true;
            }
        }
        if(!found)
        {
            System.out.print("You did not enter a valid recipe");
        }
    }
    
    /**
    * Finds and prints the highest rated recipes in the recipe book.
    */
    public void listTopRatedRecipe()
    {
        Recipe topRecipe = null;
        double highestAverage = 0.0;
        
        for(Recipe r : recipes)
        {
            double avg = r.calcAverageRating();
            if(avg > highestAverage)
            {
                highestAverage = avg;
                topRecipe = r;
            }
        }
        System.out.println("Top Rated Recipe: " + topRecipe.getName());
        System.out.println("Average Rating: " + highestAverage);
    }
    
    /**
    * Allows the user to add a new recipe to the recipe book
    */
    public void addOwnRecipe()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter recipe name: ");
        String name = scanner.nextLine();
        
        System.out.println("Choose a recipe type: ");
        System.out.println("1. Dessert");
        System.out.println("2. Snack");
        System.out.println("3. Drink");
        int type = scanner.nextInt();
        scanner.nextLine();
        
        Recipe newRecipe = null;
        switch(type)
        {
            case 1: System.out.print("Is it baked?(true or false): ");
                    boolean isBaked = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Enter texture: ");
                    String texture = scanner.nextLine();
                    System.out.print("Enter sweetness level: ");
                    String sweet = scanner.nextLine();
                    newRecipe = new Desserts(name, isBaked, texture, sweet);
                    break;
            
            case 2: System.out.print("is it school appropriate? (true or false): ");
                    boolean approp = scanner.nextBoolean();
                    scanner.nextLine();
                    newRecipe = new Snacks(approp, name);
                    break;
                    
            case 3: System.out.print("Is it alcoholic? (true or false): ");
                    boolean alcoholic = scanner.nextBoolean();
                    System.out.print("Is it cold? (true/false): ");
                    boolean cold = scanner.nextBoolean();
                    System.out.print("Does it have dairy? (true orfalse): ");
                    boolean dairy = scanner.nextBoolean();
                    scanner.nextLine();
                    newRecipe = new Drinks(name, alcoholic, dairy, cold);
                    break;
            
            default: System.out.println("not a valid choice");
        }
        recipes.add(newRecipe);
        System.out.println("Recipe added successfully!");
        scanner.close();
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
     * Adds a tag to a selected recipe
     * 
     * 
     */
    public void addTag(String recipeName, Tags tag)
    {
        for (Recipe r : recipes) {
            if (r.getName().equalsIgnoreCase(recipeName)) {
                r.addTag(tag);
                System.out.println("Tag added");
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
            System.out.println("5. Get average rating for a recipe");
            System.out.println("6. Get the best rated recipe");
            System.out.println("9. Add your own recipe");
            System.out.println("10. Exit");
            System.out.print("\nChoose an option(the number): ");
            
            int choice = sc.nextInt();
            sc.nextLine();
        
            switch (choice)
            {
                case 1: recipeBook.listAllRecipes();
                        System.out.print("\nEnter a recipe you'd like to view: ");
                        String r = sc.nextLine();
                        recipeBook.printRecipeDetails(r);
                        System.out.println("\nType anything to head back to the option menu: ");
                        String option = sc.nextLine();                         
                        break;
                        
                case 2: System.out.print("Enter recipe name: ");
                        String recipeToScale = sc.nextLine();
                        System.out.print("Enter scale factor: ");
                        double factor = sc.nextDouble();
                        sc.nextLine();
                        recipeBook.scaleRecipeIngredients(recipeToScale, factor);
                        break;
                        
                case 3: System.out.print("Enter a recipe name: ");
                        String name = sc.nextLine();
                        recipeBook.searchSpecificRecipe(name);
                        break;
                        
                case 4: System.out.print("Enter ingredient name: ");
                        String ingredient = sc.nextLine();
                        recipeBook.searchByIngredient(ingredient);
                        break;
                        
                case 5: System.out.println("Choose a tag:");
                        System.out.println("1. GLUTEN");
                        System.out.println("2. DAIRY");
                        System.out.println("3. VEGAN");
    
                        System.out.print("Enter tag number: ");
                        int tagChoice = sc.nextInt();
                        sc.nextLine();

                if (tagChoice == 1)
                {
                    recipeBook.searchByTags(Tags.GLUTEN);
                }
                else if (tagChoice == 2)
                {
                    recipeBook.searchByTags(Tags.DAIRY);
                }
                else if (tagChoice == 3)
                {
                    recipeBook.searchByTags(Tags.VEGAN);
                }
                else
                {
                    System.out.println("Invalid tag choice");
                }
                        break;
                
                case 6: System.out.print("Enter recipe name: ");
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
                    
                case 7: System.out.print("Enter recipe name: ");
                        String recipe = sc.nextLine();
                        System.out.println("average rating: " + recipeBook.getAverageRating(recipe));
                        break;
                        
                case 8: recipeBook.listTopRatedRecipe();
                        break;
                        
                case 9: recipeBook.addOwnRecipe();
                        break;
                        
                case 10: System.out.print("bye bye!");
                        running = false;
                        break;
                        
                default: System.out.println("Invalid Option");
            }
        }
        sc.close();
    }
}
