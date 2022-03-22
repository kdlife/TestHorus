package Horus;

public class Blocks {
  private String color;
  private String material;
  
  public Blocks(String color, String material) {
	  this.setColor(color);
	  this.setMaterial(material);
  }

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}
  @Override
  public String toString() {
	  return color+"||"+material;
  }
}
