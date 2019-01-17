
/**
 * Creates an instance of a Tree.
 *
 * @author P.Zhang
 * @version January 17, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Square lowerbase;
    private Square upperbase;
    private Triangle level1;
    private Triangle level2;
    private Triangle level3;
    

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        lowerbase = new Square();
        upperbase = new Square();
        level1 = new Triangle();
        level2 = new Triangle ();
        level3 = new Triangle();
        
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        lowerbase.makeVisible();
        lowerbase.changeSize(50);
        lowerbase.changeColor("black");
        lowerbase.moveVertical(140);
        lowerbase.moveHorizontal(140);
        upperbase.makeVisible();
        upperbase.changeSize(50);
        upperbase.changeColor("black");
        upperbase.moveHorizontal(140);
        upperbase.moveVertical(100);
        
        // Lefes area
        level1.makeVisible();
        level1.changeColor("green");
        level1.changeSize(60,90);
        level2.makeVisible();
        level3.makeVisible();
       
      
        
        
        // translate the tree to the specified location
        
        
    }
    
}