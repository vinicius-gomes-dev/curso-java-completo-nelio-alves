package entities;

import enums.Color;

public abstract class AbstractShapeImpl implements Shape{
	
	private Color color;
	
	public AbstractShapeImpl() {
	}
	
	public AbstractShapeImpl(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
