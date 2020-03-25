package WaveGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FasterEnemy extends GameObject{
	
	private Handler handler;

	public FasterEnemy(float x, float y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		velX = 7;
		velY = 9; 
	
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 20, 20);
		
	}
	
	
	@Override
	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
		
		handler.addObject(new Trail((int)x, (int)y, ID.Trail, Color.magenta, 20, 20, 0.15f, handler));
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect((int)x, (int)y, 20, 20);
	}

}
