/**
 * Cereal.java
 *
 * @author – Tiku Mbu
 * @author – TTH  8:30, 10:30
 *
 */
public class Cereal
{
    // private instance variables to hold info about a cereal from the data set
    // the name, calories, fiber, carbohydrates, and cups
    private String name;
    private int cals;
    private double fiber;
    private double carbs;
    private double cups;
    // constructor that creates a cereal object
    public Cereal(String name, int cals, double fiber, double carbs, double cups){
        this.name = name;
        this.cals = cals;
        this.fiber = fiber;
        this.carbs = carbs;
        this.cups = cups;
    }

    // accessor methods for each instance variable
    public String getName(){
        return this.name;
    }
    public int getCalories(){
        return this.cals;
    }
    public double getFiber(){
        return this.fiber;
    }
    public double getCarbs(){    
        return this.carbs;
    }
    public double getCups(){
        return this.cups;
    }

    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */
    public String toString(){
       return "Cereal: " +this.name+ " has "
        +this.cals+ " calories, " 
        +this.fiber+ " g fiber, " 
        +this.carbs+ " and g carbs in " 
        +this.cups+ " cups.";
    }
}


