package principal.entities;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import principal.physics.Position;
import principal.statemachine.characterstates.State;

public abstract class Entity {
		
	protected int width;
	protected int height;

	protected State state;
	
	protected ID id;

	private Position position;
	
	public Entity(float x, float y){
		position = new Position(x, y);
	}
	
	public abstract void draw(Graphics2D g, long time);
	public abstract void tick(ArrayList<Entity> objects, long beforeTime);
	
	// Limites
	public abstract Rectangle getBounds();
	public abstract Rectangle getTopBounds();
	public abstract Rectangle getLeftBounds();
	public abstract Rectangle getRightBounds();
	public abstract Rectangle getBotBounds();
	
	// Getters and setters
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public float getX(){
		return position.getX();
	}
	
	public void setX(float x){
		position.setX(x);
	}
	
	public float getY(){
		return position.getY();
	}
	
	public void setY(float y){
		position.setY(y);
	}
	
	public ID getID(){
		return id;
	}
	
	
	
	
	public void setXY(float x, float y){
		setX(x);
		setY(y);
	}
	
	public abstract String getName();


}
