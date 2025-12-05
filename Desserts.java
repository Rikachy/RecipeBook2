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
        /*if(this.isBaked) -> print("this is a baked recipe") return true
         * else return false
         */
        return isBaked;
    }
    
    public String getTexture()
    {
        ArrayList<String> possibleTextures = new ArrayList<>();
        possibleTextures.add("soft");
        possibleTextures.add("solid");
        possibleTextures.add("Crispy");
        possibleTextures.add("Crunchy");
        possibleTextures.add("Creamy");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please choose one of th following texture  : " + possibleTextures );
        String texture = sc.nextLine();
        
        for(String check : possibleTextures){
            if(texture.equals(check)){
                System.out.print("added " + texture);
            }else{
                System.out.print(texture + " is an invalid texture");
                return null;
            }
                  
        }
        
        return texture;  
        //implement a list of choices as arrayList so user doesn't input something random
    }
    
    public String getSweetLevel()
    {
        return sweetLevel;
        //implement a list of choices as arrayList so user doesn't input something random
    }
    
    public boolean isGlutenFree()
    {
        //return true if contains gluten
        return false;
    }
    
}
