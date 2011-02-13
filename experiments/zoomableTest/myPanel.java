import java.awt.*;
import javax.swing.*;
import pocket.gui.ZoomAblePanel;

public class myPanel extends ZoomAblePanel {
	public myPanel() {
	}

	@Override
	public void drawContent(Graphics g) {
		g.fillRect(0,0,200,400);
	}

	public Dimension getPreferredSize() {
		return new Dimension(500,500);
	}
}
