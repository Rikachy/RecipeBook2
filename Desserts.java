import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class Desserts here.
 *
 * @author (Daksh Balram)
 * @version (a version number or a date)
 */
public class Desserts extends Recipe
{
    private boolean isBaked;
    private String texture;
    private String sweetLevel;

    /**
     * Constructor for objects of class Desserts
     */
    public Desserts()
    {
        
    }

    public boolean checkBaked()
    {
        if(isBaked)
        {
            System.out.println("this is a baked dessert");
            return true;
        } else {
            System.out.println("This is not a baked dessert");
            return false;
        }
        /*if(this.isBaked) -> print("this is a baked recipe") return true
         * else return false
         */
    }
    
    public void setTexture(String texture)
    {
        ArrayList<String> possibleTextures = new ArrayList<>();
        possibleTextures.add("soft");
        possibleTextures.add("solid");
        possibleTextures.add("Crispy");
        possibleTextures.add("Crunchy");
        possibleTextures.add("Creamy");   
        
        if(possibleTextures.contains(texture))
        {
            this.texture = texture;
        } else {
            System.out.println(texture + " is not a valid texture");
        }
    }
    
    public String getTexture()
    {
        return texture;  
    }
    
    public String getSweetLevel()
    {   
        return sweetLevel;
    }
    
    public boolean isGlutenFree()
    {
        //return true if contains gluten
        return false;
    }
    
}
