
import java.util.ArrayList;
import java.util.HashSet;
/**
 * Write a description of class Recipe here.
 *
 * @author (Richard)
 * @version (a version number or a date)
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
     * Constructor for objects of class Recipe
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
    
    public void addIngredient(String name, double amount, UnitOfMeasurement unit)
    {
        ingredients.add(new Ingredients(name, amount, unit));
    }
        /**
     * Return the number of customer comments for this item.
     */
    public int getNumberOfComments()
    {
        return comments.size();
    }
    
        /**
     * Add a comment to the comment list of this sales item. Return true if
     * successful; false if the comment was rejected.
     * 
     * The comment will be rejected if the same author has already left a  
     * comment, or if the rating is invalid. Valid ratings are numbers between
     * 1 and 5 (inclusive).
     */
    public boolean addComment(String username, String text, int rating, String nameOfRecipe)
    {
        if(ratingInvalid(rating)) {  // reject invalid ratings
            return false;
        }
    
        comments.add(new Comment(username, text, rating, nameOfRecipe));
        return true;
    }
    
    public void addStep(String step)
    {
        steps.add(step);
    }
    
                /**
     * Check whether the given rating is invalid. Return true if it is invalid.
     * Valid ratings are in the range [1..5].
     */
    private boolean ratingInvalid(int rating)
    {
        return rating < 0 || rating > 5;
    }
    

      /**
     * //gets all rating and find the mean(average) 
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
    
    //tells you which rating is given most often given
    // ex. 2, 4, 2, 5, 4, 2 the following has the mode of 2
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
    

    // returns a HashSet and not double
    public HashSet<Ingredients> scaleRecipe(double scaler){
        /* adjusting the quantity of the ingredients with the scaler input.
         * important to put restriction so you don't go below 0 or in negatives
         * 
         * select the recipe you want to modify with the help of a hashmap
         * after selecting, it will give you the value of your hashmap which will be the HashSet ingredients
         * Iterator to go through each element of that HashSet and applying the scaler to each ingredient
         * Storing the new values into a local variable HashSet
         * retur the new HashSet
         */
        HashSet<Ingredients> scaledIngredients = new HashSet<>();
        for (Ingredients ing : ingredients) {
            Ingredients updated = new Ingredients(ing.getName(), ing.getAmount() * scaler, UnitOfMeasurement.CUP);
            scaledIngredients.add(updated);
        }
        return scaledIngredients;
    }
    
    public String getName()
    {
        return name;
    }
    
    public ArrayList<String> getSteps()
    {
        return steps; 
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public double getPrepTime() 
    {
        return prepTime;
    }
    
    public ArrayList<Tags> getTags()
    {
        return tags;
    }
    
    public HashSet<Ingredients> getIngredients()
    {
        return ingredients;
    }

    @Override 
    public String toString(){
        return "the average rating for "+ name +" is " + calcAverageRating(); 
    }
    
}
