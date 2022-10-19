public class PowerPill
{
    private static final int DEFAULT_POWER = 10;

    // instance variables
    private int powerSupply;
    private String name;

    // constructors
    /*
     * Initializes this power pill to a default power value and
     * and sets the name of the pill to name.
     * @param name name of this power pill.
     */
    public PowerPill(String name)
    {
        setName(name);
        setPower(DEFAULT_POWER);
    }

    /*
     * Initializes this power pill to the value of power  and
     * and sets the name of the pill to name.
     * @param name name of this power pill
     * @param power power level of this power pill.
     */
    public PowerPill(String name, int power)
    {
        setName(name);
        setPower(power); // TODO - add your code here
    }

    // accessor methods

    /*
     * Returns the power provided by this pill.
     * @return the power provided by this power pill
     */
    public int getPower()
    {
       return powerSupply; // TODO - add your code here

    }

    /*
     * Returns the name of this power pill.
     * @return the name of this power pill
     */
    public String getName()
    {
       return name; // TODO - add your code here
    }

    // mutator methods

    /*
     * Sets the power value of this power pill.
     * @param power power value to set for this power pill.
     */
    public void setPower(int power)
    {
        this.powerSupply = power; // TODO - add your code here
    }

    /*
     * Set the name of this power pill.
     * @param name the name to give this power pill.
     */
    public void setName(String name)
    {
       this.name = name; // TODO - add your code here
    }
}