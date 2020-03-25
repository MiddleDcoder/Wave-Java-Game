package WaveGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class EnemyBulletBounce extends GameObject{
	
	private Handler handler;
	Random r = new Random();
	
	private Color col;

	public EnemyBulletBounce(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		velX = (r.nextInt(5 - -5) + -5)+2;
		velY = 5; 
		
		col = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 10, 10);
	
	}
	
	
	@Override 
	public void tick() {
		x += velX;
		y += velY;
		
		//if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
		
		if(y >=  Game.HEIGHT) handler.removeObject(this);
		
		handler.addObject(new Trail(x, y, ID.Trail, col, 10, 10, 0.10f, handler));
	}

	@Override
	public void render(Graphics g) {
		g.setColor(col);
		g.fillRect((int)x, (int)y, 10, 10);
	}

}



