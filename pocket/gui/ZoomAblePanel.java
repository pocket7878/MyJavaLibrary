package pocket.gui;

import java.awt.*;
import java.awt.geom.*;
import java.awt.Graphics2D;
import javax.swing.*;

public class ZoomAblePanel extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private AffineTransform Maffine;
    public double currentMoveX = 0;
    public double currentMoveY = 0;
    private double currentZoom = 1;

    private AffineTransform getMaffine()
    {
	AffineTransform ScaleTransform = AffineTransform.getScaleInstance(currentZoom, currentZoom);
	ScaleTransform.translate(currentMoveX, currentMoveY);
	return ScaleTransform;
    }
    
    public ZoomAblePanel()
    {
	Maffine = getMaffine();
    }
	
    //Zoom methods.
    public void zoom()
    {
	currentZoom *= 2;
	Maffine = getMaffine();
    }

    public void unzoom()
    {
	currentZoom *= 0.5;
	Maffine = getMaffine();
    }

    //Scrolle Method
    public void scrollX() {
	    currentMoveX++;
    }

    public void scrollX(double sx) {
	    this.currentMoveX += sx;
    }

    public void scrollY() {
	    currentMoveY++;
    }

    public void scrollY(double sy) {
	    this.currentMoveY += sy;
    }

    @Override
	public void paintComponent(Graphics g)
    {
	Graphics2D g2d = (Graphics2D)g;
	super.paintComponent(g);
	g2d.transform(Maffine);
	//User modifiable method.
	drawContent(g);
    }
	
    public Point transformMousePoint(int x, int y) {
	Point start = new Point(x, y);
	Point dist = new Point(0, 0);
	try {
	    Maffine.createInverse().transform((Point2D)start, (Point2D)dist);
	} catch(java.awt.geom.NoninvertibleTransformException e) {
	    e.printStackTrace();
	}
	return dist;
    }

    //User modifiable method.
    public void drawContent(Graphics g) {
	//ADD MAIN DRAW CODE HERE
    }

}

