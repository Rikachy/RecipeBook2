
/**
 * The UnitOfMeasurement enum represents the different units
 * that can be used to measure ingredients in a recipe
 *
 * @author (Daksh Balram)
 * @version (1)
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
    
    /**
     * Constructs a UnitOfMeasurement with a string representation.
     * 
     * @param measurement the string name of the unit
     */
    UnitOfMeasurement(String measurement)
    {
        this.measurement = measurement;
    }   
    
    /**
     * Returns the string representation of the unit of measurement.
     * 
     * @retrun the measurement name
     */
    public String getmeasurement()
    {
        return measurement;
    }
    
    /**
     * Returns the unit of measurement as a readable string.
     * 
     * @return the measurement string
     */
    public String toString()
    {
        return measurement;
    }
}
