
/**
 * Write a description of class Desserts here.
 *
 * @author (Daksh)
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
        /*if(this.isBaked) -> print("this is a baked recipe") return true
         * else return false
         */
        return isBaked;
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
