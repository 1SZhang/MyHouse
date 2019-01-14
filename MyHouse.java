
/**
 * Write a description of class Myhouse here.
 * The function of making a house
 * @author Pzhang
 * @version Jan 11 2019
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    private Square base; 
    private Triangle roof;
    private Circle sun; 

    /**
     * Constructor for objects of class Myhouse
     */
    public MyHouse()
    {
        // initialise instance variables
        base = new Square();
        roof = new Triangle();
        sun = new Circle();
    }

    /**
     * Draws the house 
     */
    public void drawHouse()
    {
        // Arrande each object
        
        // Set upthe sun(Ctrl-Space)  
        sun.makeVisible();
        sun.changeSize(90);
        sun.changeColor("red");
        sun.moveHorizontal(230);
        sun.moveVertical(-180);
        
        // set up the roof
        roof.makeVisible();
        roof.changeSize(100,100);
        
        
        // set up the base of the house
        base.makeVisible();
        base.changeSize(95);
        
    }
}
