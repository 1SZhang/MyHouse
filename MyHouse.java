
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
    private Tree pineTree;

    /**s
     * Constructor for objects of class Myhouse
     */
    public MyHouse()
    {
        // initialise instance variables
        base = new Square();
        roof = new Triangle();
        sun = new Circle();
        
        // Create a pine tree 
        pineTree = new Tree(0,0);
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
         sun.moveHorizontal(220);
        sun.moveVertical(-90);
        
        // // set up the roof
         roof.makeVisible();
         roof.changeColor("black");
         roof.changeSize(90,140);
         roof.moveHorizontal(103);
         roof.moveVertical(30);
         
      
        
        
        
        
        // // set up the base of the house
        base.makeVisible();
        base.changeColor("blue");
         base.changeSize(125);
         base.moveVertical(83);
         base.moveHorizontal(30);
         
         
        
         
        
    }
}
