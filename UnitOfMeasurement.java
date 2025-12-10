
/**
 * Enumeration class UnitOfMeasurement - write a description of the enum class here
 *
 * @author (Daksh Balram)
 * @version (version number or date here)
 */
public enum UnitOfMeasurement
{
    TSP("teaspoon"),
    TBSP("tablespoon"),
    CUP("cup"),
    GALLON("gallon"),
    MILLIMETER("millimeter"),
    LITER("liter"),
    OUNCE("ounce"),
    POUND("pound"),
    GRAM("gram"),
    KILLOGRAM("kilogram"),
    UNIT("");
    
    private String measurement;
    
    UnitOfMeasurement(String measurement)
    {
        this.measurement = measurement;
    }
    
    public String getmeasurement()
    {
        return measurement;
    }
    
    public String toString()
    {
        return measurement;
    }
}
