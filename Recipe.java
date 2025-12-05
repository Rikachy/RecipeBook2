
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.HashSet;
import java.util.List;
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
    
    /**
     * Constructor for objects of class Recipe
     */
    public Recipe()
    {
        
        
    }
    
   
    /**
     * allows the user to add their rating 
     * Rating + comment = review
     */
    public void addReviewBook()
    {

    }

      /**
     * //gets all rating and find the mean(average) 
     */
    public int calcAverageRating()
    {
        
        /*select a specific recipe and check if it has any comments/review
         * if it doesn't - don't perform and return null
         * else - add all of the reviews together snd divide it by get the number of reviews
         * store that value into a variable
         * return said variable
        */
        int x =0; // to make compilable 
        return x;
    }
    
    public int getAverageRating()
    {   
        int x =0; // to make compilable 
        return x;
    }
    //tells you which rating is given most often given
    // ex. 2, 4, 2, 5, 4, 2 the following has the mode of 2
    public int calcModeRating()
    {
        /*goes through all of the rating with iterator or for loop
         * everytime 1 is spotted add 1 to a
         * everytime 2 is spotted add 1 to b
         * everytime 3 is spotted add 1 to c
         * everytime 4 is spotted add 1 to d
         * everytime 5 is spotted add 1 to e
         * compare a,b,c,d,e and return the largest digit
         */
        
        int x =0; // to make compilable 
        return x;
    }
    public int getModeRating()
    {
        int x =0; // to make compilable 
        return x;
    }
    // returns a HashSet and not double
    public HashSet<Integer> scaleRecipe(double scaler){
        /* adjusting the quantity of the ingredients with the scaler input.
         * important to put restriction so you don't go below 0 or in negatives
         * 
         * select the recipe you want to modify with the help of a hashmap
         * after selecting, it will give you the value of your hashmap which will be the HashSet ingredients
         * Iterator to go through each element of that HashSet and applying the scaler to each ingredient
         * Storing the new values into a local variable HashSet
         * retur the new HashSet
         */
        HashSet<Integer> adjusted = new HashSet<>(); // to make compilable 
        return adjusted;
    }
    
}

