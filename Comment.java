
/**
 * Write a description of class Comment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Comment
{
    private String author;
    private String text;
    private int rating;

    /**
     * Constructor for objects of class Comment
     */
    public Comment(String author, String text, int rating)
    {
        this.author = author;
        this.text = text;
        this.rating = rating;
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
                         + "By: " + author + "\n"
                         + "    " + text + "\n";
        return details;    
    }
}
