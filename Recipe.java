
import java.util.ArrayList;
import java.util.HashSet;
/**
 * Stores methods and fields for a recipe
 * It is the parent class of the sub-classes : Drinks, Snacks, Desserts
 *
 * @author (Richard)
 * @version (1)
 */
public class Recipe
{
    // instance variables - replace the example below with your own
    protected ArrayList<String> steps;
    protected HashSet<Ingredients> ingredients;
    protected double prepTime;
    protected ArrayList<Integer> ratings;
    protected String description;
    private ArrayList<Tags> tags;
    
    private String name;
    
    private ArrayList<Comment> comments;
    private int rating; 
    
    
    /**
     * Constructs a Recipe and the needed lists
     * @param name : the name of the recipe 
     */
    public Recipe(String name)
    {
        this.name = name;
        this.comments = new ArrayList<>();
        this.steps = new ArrayList<>();
        this.ratings = new ArrayList<>();
        this.ingredients = new HashSet<>();
        
        tags = new ArrayList<>();
    
    }
    
    /**
     * adds new ingredient to the recipe
     * 
     * @param name : the name of the ingredient
     * @param amount : the quantity of the ingredient
     * @param unit : the unit of measurement
     */
    public void addIngredient(String name, double amount, UnitOfMeasurement unit)
    {
        ingredients.add(new Ingredients(name, amount, unit));
    }
    
    /**
     * adda a tag to the recipe
     * 
     * @param tag : the tag that is associated with the recipe
     */
     public void addTag(Tags tag) 
    {
        tags.add(tag);
    }
    
    /**
     * Returns the total # of comments 
     * 
     * @return the number of customer comments for this item.
     */
    public int getNumberOfComments()
    {
        return comments.size();
    }
    
        /**
     * adda a user comment and rating to a recipe
     * 
     * @param username : the author of the comment
     * @param text : the text of the comment
     * @param rating : a number between 1-5 to rate the recipe
     * @param nameOfRecipe : namke of the recipe being reviewd
     * @return true if comment is added/false if comment isn't added
     */
    public boolean addComment(String username, String text, int rating, String nameOfRecipe)
    {
        if(ratingInvalid(rating)) {  // reject invalid ratings
            return false;
        }
    
        comments.add(new Comment(username, text, rating, nameOfRecipe));
        ratings.add(rating);
        return true;
    }
    
    /**     
     * adds a step to the recipe
     * 
     * @param step : the step being added
     */
    public void addStep(String step)
    {
        steps.add(step);
    }
    
                /**
     * Check whether the given rating is invalid. 
     * 
     * @param  rating : the rating the user input
     * @return true if rating is invalid/false if valid
     */
    private boolean ratingInvalid(int rating)
    {
        return rating < 1 || rating > 5;
    }
    

      /**
     * //gets all rating and find the mean(average) 
     * 
     * @return the avg rating/ 0.0 if no rating is found
     */
    public double calcAverageRating()
    {
        
        /*select a specific recipe and check if it has any comments/review
         * if it doesn't - don't perform and return null
         * else - add all of the reviews together snd divide it by get the number of reviews
         * store that value into a variable
         * return said variable
        */
        if (ratings == null)
        {
            System.out.print("There is currently no rating.");
            return 0.0;
        }
        double sum = 0.0;
        for (int rating : ratings)
        {
            sum = sum + rating;
        }
        
        return sum / ratings.size();
    }
    
   
        /** tells you which rating is most often given
         * 
        * @return  the most common rating of a recipe
        */
        public int getModeRating()
    
    {
        /*goes through all of the rating with iterator or for loop
         * everytime 1 is spotted add 1 to a
         * everytime 2 is spotted add 1 to b
         * everytime 3 is spotted add 1 to c
         * everytime 4 is spotted add 1 to d
         * everytime 5 is spotted add 1 to e
         * compare a,b,c,d,e and return the largest digit
         */
        
        int a = 0;// count of 1
        int b = 0; // count of 2
        int c = 0; // count of 3
        int d = 0; // count of 4
        int e = 0; // count of 5
        int max = a;
        int mode = 1;
                for (int rating : ratings) {
            switch (rating) {
                case 1: a++; 
                break;
                case 2: b++; 
                break;
                case 3: c++; 
                break;
                case 4: d++; 
                break;
                case 5: e++; 
                break;
            }
        }
        if (b > max) 
        { 
            max = b; 
            mode = 2;
        }
            
        if (c > max) 
        { 
            max = c; 
            mode = 3; 
        }
        if (d > max) 
        { 
            max = d;
            mode = 4; 
        }
        if (e > max) 
        { 
            max = e; 
            mode = 5; 
        }
        
        return mode; 
    }
    
    /** 
     * scales all ingredient by the scaler
     * 
     * @param  scaler : the amount  the user wants to multiply by
     * @return new HashSet with the scaled ingredients 
     */

    public HashSet<Ingredients> scaleRecipe(double scaler){

        HashSet<Ingredients> scaledIngredients = new HashSet<>();
        for (Ingredients ing : ingredients) {
            Ingredients updated = new Ingredients(ing.getName(), ing.getAmount() * scaler, UnitOfMeasurement.CUP);
            scaledIngredients.add(updated);
        }
        return scaledIngredients;
    }
    
    /**
     * retunrs the name of the recipe
     * 
     * @return the recipe name
     */
    public String getName()
    {
        return name;
    }
    /**
     * returns the list of steps
     * 
     * @return steps of the recipe
     */
    public ArrayList<String> getSteps()
    {
        return steps; 
    }
    /**
     * returns the description of a recipe
     * 
     * @return the description
     */
    public String getDescription()
    {
        System.out.println("Recipe: " + name);
        System.out.println("\nIngredients:");
        for (Ingredients ing : ingredients)
        {
            System.out.println(" - " + ing);
        }

        System.out.println("\nSteps:");
        for (String step : steps)
        {
            System.out.println(" - " + step);
        }

        System.out.println("\nComments:");
        if (comments.isEmpty())
        {
            System.out.println(" No comments yet.");
        }
         else
        {
            for (Comment c : comments)
            {
                System.out.println(" " + c.getUsername() + " (Rating: " + c.getRating() + "): " + c.getText());
            }
        }
        return description;
    }
    /**
     * returns the prep time
     * 
     * @return prep time
     */
    public double getPrepTime() 
    {
        return prepTime;
    }
    /**
     * returns the tags associated with the recipe
     * 
     * @return the recipe tag(s)
     */
    public ArrayList<Tags> getTags()
    {
        return tags;
    }
    /**
     * returns the ingredients used in the recipe
     * 
     * @return ingredient set
     */
    public HashSet<Ingredients> getIngredients()
    {
        return ingredients;
    }
    
    /**
     * returns a formatted string representation of the recipe
     * 
     * @return recipe summary
     */
    @Override
    public String toString()
    {
        return name + "The Avg Rating is : " + calcAverageRating();
    }   

}
