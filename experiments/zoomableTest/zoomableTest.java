import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import pocket.gui.ZoomAblePanel;

public class zoomableTest extends JFrame implements KeyListener {
	private myPanel mypanel;

	public zoomableTest() {
		mypanel = new myPanel();
		getContentPane().add(mypanel);
		this.setTitle("zoomableTest");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);
		this.setFocusable(true);
		this.pack();
	} 

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_Z) {
			mypanel.zoom();
		}
		else if(key == KeyEvent.VK_U) {
			mypanel.unzoom();
		}
		else if(key == KeyEvent.VK_DOWN) {
			mypanel.scrollY();
		}
		else if(key == KeyEvent.VK_UP) {
			mypanel.scrollY(-1);
		}
		else if(key == KeyEvent.VK_LEFT) {
			mypanel.scrollX(-1);
		}
		else if(key == KeyEvent.VK_RIGHT) {
			mypanel.scrollX();
		}
		mypanel.repaint();
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public static void main(String[] args) {
		zoomableTest zt = new zoomableTest();
		zt.setVisible(true);
	}
}
