package WaveGame;

import java.util.Random;

public class Spawn {
	
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	public static int scoreKeepValue;
	int zero = 0;
	
	public static int scoreKeep = 0;
	
	public Spawn(Handler handler, HUD hud) {
		
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick() {
		scoreKeep++;
	
		if(scoreKeep >= 300) {
			scoreKeep = 0;
		
			scoreKeepValue = hud.getLevel()+zero;
					
			hud.setLevel(hud.getLevel() + 1);
			
			if(hud.getLevel() == 2 ) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 3) {
				handler.addObject(new BlueEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BlueEnemy, handler));
			}else if(hud.getLevel() == 4) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 5) {
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 6) {
				handler.addObject(new FasterEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FasterEnemy, handler));
			}else if(hud.getLevel() == 7) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 10) {
				handler.clearEnemys();
				handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, - 170, ID.EnemyBoss, handler));
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
		
			}else if(hud.getLevel() == 15) {
				handler.clearEnemys();
				handler.addObject(new FasterEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FasterEnemy, handler));
			}
			else if(hud.getLevel() == 16) {
				handler.addObject(new FasterEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FasterEnemy, handler));
			}else if(hud.getLevel() == 17) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 19) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 20) {
				handler.clearEnemys();
				handler.addObject(new BounceEnemy((Game.WIDTH / 2) -48, -210, ID.BounceEnemy, handler));
			}else if(hud.getLevel() == 25) {
				handler.clearEnemys();
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 26) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 27) {
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 28) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 29) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 30) {
				handler.clearEnemys();
				handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, - 170, ID.EnemyBoss, handler));
			}else if(hud.getLevel() == 35) {
				handler.clearEnemys();
				handler.addObject(new FasterEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FasterEnemy, handler));
			}else if(hud.getLevel() == 36) {
				handler.addObject(new FasterEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FasterEnemy, handler));
			}else if(hud.getLevel() == 37) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 38) {
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 39) {
				handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 40) {
				handler.addObject(new BlueEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BlueEnemy, handler));
			}else if(hud.getLevel() == 45) {
				handler.clearEnemys();
				handler.addObject(new BounceEnemy((Game.WIDTH / 2) - 48, -210, ID.BounceEnemy, handler));
				handler.addObject(new FasterEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FasterEnemy, handler));
			}else if(hud.getLevel() == 50) {
				handler.clearEnemys();
				handler.addObject(new BlueEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BlueEnemy, handler));
			}else if(hud.getLevel() == 51) {
				handler.addObject(new BlueEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BlueEnemy, handler));
			}else if(hud.getLevel() == 52) {
				handler.addObject(new FasterEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FasterEnemy, handler));
			}else if(hud.getLevel() == 53) {
				handler.addObject(new FasterEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FasterEnemy, handler));
			}else if(hud.getLevel() == 54) {
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 55) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 56) {
				handler.clearEnemys();
				handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, -210, ID.EnemyBoss, handler));
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 60) {
				handler.clearEnemys();
				handler.addObject(new BlueEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BlueEnemy, handler));
			}else if(hud.getLevel() == 61) {
				handler.addObject(new BlueEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BlueEnemy, handler));
			}else if(hud.getLevel() == 62) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			}else if(hud.getLevel() == 63) {
				handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			}else if(hud.getLevel() == 64) {
				handler.clearEnemys();
				handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				handler.addObject(new EnemyBoss((Game.WIDTH / 2) - 48, - 170, ID.EnemyBoss, handler));
				handler.addObject(new FasterEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FasterEnemy, handler));
			}
		}
	
 	}
}
