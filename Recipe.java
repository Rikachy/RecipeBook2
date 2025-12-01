
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.HashSet;
import java.util.List;

/**
 * Write a description of class Recipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe
{
    // instance variables - replace the example below with your own
    private ArrayList<String> steps;
    private HashSet<Ingredients> ingredients;
    private double prepTime;
    private ArrayList<Integer> ratings;
    private String description;
    
    double scaler ;// needed for scaleRecipe. method 
    /**
     * Constructor for objects of class Recipe
     */
    public Recipe()
    {
        
        
    }

    /**
     * allows the user to add their rating 
     */
    public void addRating()
    {
        
    }
    public void addComments()
    {
        
    }
      /**
     * //gets all rating and find the mean(average) 
     */
    public int calcAverageRating()
    {
        
    }

    public int getAverageRating()
    {
        //return averageRating; 
    }

    public int getmodeRating()
    {
        //return mode; 
    }
    
    public double scaleRecipe(double scaler){
        /* adjusting the quantity of the ingredients with the scaler input.
         * important to put restriction so you don't go below 0 or in negatives
         * 
         * select the recipe you want to modify with the help of a hashmap
         * after selecting, it will give you the value of your harshmap which will be the HashSet ingredients
         * Iterator to go through each element of that HashSet and applying the scaler to each ingredient
         * 
         */
    }
    
}

