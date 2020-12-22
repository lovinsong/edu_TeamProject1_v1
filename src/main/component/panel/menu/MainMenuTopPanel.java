package main.component.panel.menu;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import main.component.label.LogoLabel;
import main.view.MenuView;

public class MainMenuTopPanel extends JPanel {
	
//	public static final Color COLOR = MenuView.COLOR;
	
	public static final int WIDTH = 0;
	public static final int HEIGHT = 340;
	
	public MainMenuTopPanel() {
		setDefaultConfig();
		setComponents();
	}
	
	private void setDefaultConfig() {
		setBackground(Color.white);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setLayout(new CardLayout());
	}
	
	private void setComponents() {
		String text = "Welcome CAFE!";
		JLabel label = new JLabel(text,
								  LogoLabel.getImgIcon(), 
								  SwingConstants.CENTER);
		label.setFont(new Font("맑은 고딕", Font.BOLD, 68));
		label.setForeground(new Color(0x2868b0));
		
		add(label);
		
	
	}
	
}
