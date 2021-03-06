package main.component.panel.menu;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.geom.RoundRectangle2D;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import main.component.button.MenuBtn;
import main.component.button.MenuBtnEnum;
import main.controller.btn.MenuBtnClickListener;
import main.view.MenuView;

public class MainMenuBtnPanel extends JPanel {

	public static final Color BG_COLOR = new Color(0x006600);

	static final int GRID_ROW_NUM = 2;
	static final int GRID_COL_NUM = 3;
	static final int GRID_X_MARGIN = 0;
	static final int GRID_Y_MARGIN = 0;

	public MainMenuBtnPanel() {
		setDefaultConfig();
		setComponents();
	}

	private void setDefaultConfig() {
		setBackground(BG_COLOR);
		setLayout(new GridLayout(GRID_ROW_NUM, 
						 		 GRID_COL_NUM, 
								 GRID_X_MARGIN, 
								 GRID_Y_MARGIN));
	}

	private void setComponents() {
		for (int i = 0; i < GRID_ROW_NUM * GRID_COL_NUM; i++) {
			JButton btn;
			if (i < MenuBtnEnum.values().length) {
				btn = new MenuBtn(MenuBtnEnum.values()[i]);
			} else {
				btn = new MenuBtn("매장정보");
			}
			
			JPanel gridInPanel = new JPanel(new CardLayout(50, 50));
			gridInPanel.setBackground(new Color(0x186f3d));// 밑 배경
			gridInPanel.setBackground(BG_COLOR);// 밑 배경

			gridInPanel.add(btn);
			this.add(gridInPanel);
		}

	}

	
}
