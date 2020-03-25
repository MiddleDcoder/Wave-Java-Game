package WaveGame;

import java.util.LinkedList;
import java.awt.Graphics;

public class Handler {
	
	LinkedList<GameObject> object = new LinkedList<GameObject>();

	public void tick() {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
			
 		}
	}
	
	public void render(Graphics g) {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
			
				
		}		
	}
	
	public void clearEnemys() {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			if(tempObject.getId() != ID.Player) removeObject(tempObject);
			
			object.clear();
			if(Game.gameState != Game.STATE.End && Game.gameState != Game.STATE.Pro)	
			addObject(new Player((int)tempObject.getX(), (int)tempObject.getY(), ID.Player, this));
		}	
	}
	
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.object.remove(object);
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}