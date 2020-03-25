package WaveGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class BounceEnemy extends GameObject{
	
	private Handler handler;
	private int timer = 80;
	private int timer2 = 50;
	Random r = new Random();
	
	public BounceEnemy(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		
		this.handler = handler;
		
		velX = 0;
		velY = 2; 
	
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 55, 55);
		
	}
	
	
	@Override
	public void tick() {
		x += velX;
		y += velY;
		
		if(timer <= 0) velY = 0;
		else timer--;
		
		
		
	if(timer <= 0) timer2--;
	if(timer2 <= 0) 
	{
		if(velX == 0) velX = 1;
		if(velX > 0)
		velX += 0.01f;
		else if (velX <0)
		velX -= 0.005f;
			
		velX = Game.clamp(velX, -10, 10);
		velY = Game.clamp(velY, -10, 10);	
		
		int spawn = r.nextInt(10);
		if(spawn == 0) handler.addObject(new EnemyBulletBounce((int)x+48, (int)y+48, ID.BasicEnemy, handler));
	}
	
		//if(y <= 0 || y >= Game.HEIGHT - 36) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 96) velX *= -1;
		
	
		handler.addObject(new Trail(x, y, ID.Trail, Color.green, 96, 96, 0.04f, handler));
		handler.addObject(new Trail(x, y, ID.Trail, Color.yellow, 96, 96, 0.04f, handler));
		handler.addObject(new Trail(x, y, ID.Trail, Color.orange, 96, 96, 0.05f, handler));
		handler.addObject(new Trail(x, y, ID.Trail, Color.red, 96, 96, 0.05f, handler));
		handler.addObject(new Trail(x, y, ID.Trail, Color.pink, 96, 96, 0.06f, handler));
		handler.addObject(new Trail(x, y, ID.Trail, Color.magenta, 96, 96, 0.06f, handler));
		handler.addObject(new Trail(x, y, ID.Trail, Color.cyan, 96, 96, 0.08f, handler));
		handler.addObject(new Trail(x, y, ID.Trail, Color.BLUE, 96, 96, 0.07f, handler));
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect((int)x, (int)y, 96, 96);
	}

}




