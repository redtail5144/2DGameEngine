/*
 * This class contains
 * the game menu
 */

package com.engine.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends MouseAdapter {

	// The Game
	private Game game;

	// Game's handler
	private Handler handler;

	public Menu(Game game) {
		this.game = game;
		this.handler = game.getHand();
	}

	// When mouse is clicked
	public void mousePressed(MouseEvent e) {

	}

	// When mouse click is released
	public void mouseReleased(MouseEvent e) {

	}

	// Return if you clicked on Rectangle r
	private boolean mouseOver(int mx, int my, MenuButton button) {
		if (mx > button.getX() && mx < button.getX() + button.getWidth())
			if (my > button.getY() && my < button.getY() + button.getHeight())
				return true;

		return false;
	}

	private boolean mouseOver(int mx, int my, MenuButtonPic button) {
		if (mx > button.getX() && mx < button.getX() + button.getWidth())
			if (my > button.getY() && my < button.getY() + button.getHeight())
				return true;

		return false;
	}

	// Menu ticks
	public void tick() {

	}

	// Renders menu
	public void render(Graphics g) {

	}

}
