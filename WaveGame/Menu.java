package WaveGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import WaveGame.Game.STATE;


public class Menu extends MouseAdapter {
	
	private Game game;
	private Handler handler;
	private Random r = new Random();
	private HUD hud;
	
	public 	Menu(Game game, Handler handler, HUD hud) {
		this.game = game;
		this.hud = hud;
		this.handler = handler;
	}
	
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(game.gameState == STATE.Menu) {
			
			//play button
			if(mouseOver(mx, my, 210, 150, 200, 64)) {
				game.gameState = STATE.Game;
				handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
				handler.clearEnemys();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));

			}
			//help button
					if(mouseOver(mx, my, 210, 250, 200, 64)) {
						game.gameState = STATE.Help;
						
					}
			
			
			//quit button
			if(mouseOver(mx, my, 210, 350, 200, 64)) {
				System.exit(1);
				
			}
		
		}

		
		//back button for help
		if(game.gameState == STATE.Help /*|| game.gameState == STATE.Pro*/) {
					if(mouseOver(mx, my, 210, 350, 200, 64)) {
						game.gameState = STATE.Menu;
						return;
					}
				}
		//try again button
		if(game.gameState == STATE.End ) {
					if(mouseOver(mx, my, 210, 350, 200, 64)) {
						hud.setLevel(1);
						hud.setScore(0);
						game.gameState = STATE.Game;
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));
						handler.clearEnemys();
						handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		
					}
				}
			//try again button for winner 
		if(game.gameState == STATE.Pro) {
					if(mouseOver(mx, my, 205, 345, 195, 60)) {
					System.exit(1);
					}
				}			
	
	}
	

	public void mouseRelease(MouseEvent e) {
		
	}
	
	private	boolean mouseOver(int mx, int my, int x, int y, int width, int height) {
		if(mx > x && mx < x + width){
			if(my > y && my < y + height) {
				return true;
			}else return false;
		}else return false;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		if(game.gameState == STATE.Menu) {
		
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Wave", 240, 70);
		
		g.setFont(fnt2);
		g.drawRect(210, 150, 200, 64);
		g.drawString("Play", 270, 190);
		
		g.drawRect(210, 250, 200, 64);  
		g.drawString("Help", 270, 290);
		
		g.drawRect(210, 350, 200, 64);		
		g.drawString("Quit", 270, 390); 
			
		}else if(game.gameState == STATE.Help) {
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			Font fnt3 = new Font("arial", 1, 20);

			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Help", 240, 70);	
			
			g.setFont(fnt3);
			g.drawString("Use W A S D keys to move player and dodge enemies", 50, 200);
			
			g.setFont(fnt2);
			g.drawRect(210, 350, 200, 64);		
			g.drawString("Back", 270, 390);
		}else if(game.gameState == STATE.End ) {
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			Font fnt3 = new Font("arial", 1, 20);

			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Game Over", 180, 70);	
			
			g.setFont(fnt3);
			g.drawString("You lost with a score of: " + hud.getScore() , 175, 200);
			
			g.setFont(fnt2);
			g.drawRect(210, 350, 200, 64);		
			g.drawString("Try Again", 245, 390);
			
		}else if(game.gameState == STATE.Pro ) {
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 17);
			Font fnt3 = new Font("arial", 1, 20);

			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("WHOHO WHAT A PRO!!", 30, 60);	
			
			g.setFont(fnt3);
			g.drawString("You reach the last level CONGRATS!", 170, 200);
			g.drawString("Score: " + hud.getScore() , 255, 300);
			g.setFont(fnt2);
			g.drawRect(205, 345, 195, 60);		
			g.drawString("You Can Quit Now", 230, 380);
		}
			
		
		
	}
}
