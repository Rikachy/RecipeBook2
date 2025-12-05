
/**
 * Write a description of class Comment here.
 *
 * @username (your name)
 * @version (a version number or a date)
 */
public class Comment
{
    private String username;
    private String nameOfRecipe;
    private String text;
    private int rating;

    /**
     * Constructor for objects of class Comment
     */
    public Comment(String username, String text, int rating,String nameOfRecipe )
    {
        this.username = username;
        this.text = text;
        this.rating = rating;
        this.nameOfRecipe = nameOfRecipe;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
       */
    public String sampleMethod()
    {
        String details = "Rating: " + rating + "\n"
                         + "By: " + username + "\n"
                         + "    " + nameOfRecipe + "\n"
                         + "    " + text + "\n";
        return details;    
    }
    
            /**
     * Check whether the given rating is invalid. Return true if it is invalid.
     * Valid ratings are in the range [1..5].
     */
    private boolean ratingInvalid(int rating)
    {
        return rating < 0 || rating > 5;
    }
}
