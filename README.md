# Skill Builder 2 - Defining Classes and Methods

## Learning Outcomes

By the end of this activity, a student should be able to:
1. Implement a simple Java class
2. Use other classes to accomplish more complex tasks
3. Implement accessor and mutator methods
4. Design objects that interact with each other.

## The Grok Coalition

Imagine you are writing a video game that has a character called a Grok. The Grok is a simple creature that can eat power pills and increase its power level by the amount of power available in the power pill. If the Grok takes a hit, then its power level is reduced by 5 points.

## The PowerPill Class

A power pill is an object that is available for the Grok to ingest.  Once taken, it transfers its power to the Grok.  A client can create different power pills with varying levels of power and names.  Provided below are template classes.

```java
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
        // TODO - add your code here
    }
    
    // accessor methods
    
    /*
     * Returns the power provided by this pill.
     * @return the power provided by this power pill
     */
    
    public int getPower()
    {
        // TODO - add your code here
    }
    
    /*
     * Returns the name of this power pill.
     * @return the name of this power pill
     */
    
    public String getName()
    {
        // TODO - add your code here
    }
    
    // mutator methods
    
    /*
     * Sets the power value of this power pill.
     * @param power power value to set for this power pill.
     */
    public void setPower(int power)
    {
        // TODO - add your code here
    }
    
    /*
     * Set the name of this power pill.
     * @param name the name to give this power pill.
     */
    public void setName(String name)
    {
        // TODO - add your code here
    }
}

```

You are to complete the methods that contain TODO comments.  The Javadoc comments provide the documentation you need to complete the methods in the class.

## Grok Class

Groks are bad actors in a game. They can ingest a PowerPill to replenish their energy, making them a challenge to kill. When Groks take a power pill, they take the power level of the pill. When Groks get hit, they lose 5 points of power. You are provided the following class and will need to complete it based on the documentation provided.

```java
public class Grok
{
    private static final int DEFAULT_POWER_LEVEL=50;
    
    // instance variables
    private int powerLevel;
    
    // accessor variables
    
    /*
     * Initializes a Grok object to the default power level of 50.
     */
    public Grok()
    {
        setPowerLevel(DEFAULT_POWER_LEVEL);
    }
    
    /*
     * Initializes a Grok object to power powerLevel
     */
    public Grok(int powerLevel)
    {
        // TODO - add your code here
    }
    
    // accessor methods
    
    /*
     * Returns the power level of this Grok.
     * @return returns the power level of this Grok
     */
    public int getPowerLevel()
    {
        // TODO - add your code here
    }
    
    // mutator methods
    
    /*
     * Sets the power level of this Grok.
     * @param powerLevel the power value to set for this Grok.
     */
    public void setPowerLevel(int powerLevel)
    {
       // TODO - add your code here
    }
    
    /*
     * Set the power level of this Grok to the power level of
     * the pill.
     * @param pill The PowerPill that the this Grok.  The power
     * of the pill is added to the power level of this Grok.
     */
    public void takePowerPill(PowerPill pill)
    {
        //TODO - add your code here
    }
    
    /*
     * Invoked when this Grok takes a hit.  The power level of
     * this Grok is reduced by 5.
     */
    public void tookHit()
    {
        //TODO - add your code here
    }
}
```

## How To Use the Classes

An example of how the Classes may be used is,

```java
PowerPill bluePill = new PowerPill("Blue");
PowerPill redPill = new PowerPill("Red",40);

Grok ghostlyGrok = new Grok();
ghostlyGrok.takePowerPill(bluePill);
ghostlyGrok.tookHit();
ghostlyGrok.tookHit();
ghostlyGrok.takePowerPill(redPill);
```

## Implementing and Testing the Classes

In this Skill Builder, you are being asked to implement the methods that contain the TODO task comments.
It is recommended that you begin with the PowerPill class and implement and test each of the the following 
in the order provided:

1. The non-default constructor and `getName` method.
2. The `getPower` method.
3. The `setName` method.
4. The `setPower` method.

**Note:** *If the non-default constructor is incorrectly implemented, then the `getName` method will fail.*

**DO NOT test the Grok class until the PowerPill class has passed the test.  The Grok class uses the PowerPill class, and the Grok test assumes that the PowerPill class is working correctly.**

No test tests the non-default constructor directly. If the `setName` method fails, you will
need to determine if the non-default constructor is the culprit.  To make this determination, use the symbolic debugger and step through the code by putting a breakpoint at the beginning of the non-default constructor.

In general, getting used to the idea of using the symbolic debugger to locate the source of an error is an excellent
overall strategy.  So, use it on every method that fails the test!

For the Grok class, implement and test in the following order:
1. The `getPowerLevel` method.
2. The `setPowerLevel` method.
3. The `takePowerPill` method.
4. The `tookHit` method.

Again, for each method that fails the test, place a breakpoint at the beginning of the method and use the symbolic
debugger to find the problem.

<span style="font-size:2em;color:green;">Happy Coding!</span>