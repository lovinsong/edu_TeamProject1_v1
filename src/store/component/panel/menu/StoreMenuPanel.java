package store.component.panel.menu;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class StoreMenuPanel extends JPanel {
	
	private static StoreMenuPanel panel;
		
	private static final int X_MARGIN = 320;
	private static final int Y_MARGIN = 70;
	
	static {
		panel = new StoreMenuPanel();	
	}
	
	private StoreMenuPanel() {
		setDefaultConfig();
		setComponents();
	}
	
	
	public static StoreMenuPanel getInstance() {
		if (panel == null) {
			panel = new StoreMenuPanel();
		}
		
		return panel;
	}
	
	private void setDefaultConfig() {
		setLayout(new CardLayout(X_MARGIN, Y_MARGIN));
	}
	
	private void setComponents() {
		StoreMenuCenterPanel center = StoreMenuCenterPanel.getInstance();
		add(center);
	}
}
