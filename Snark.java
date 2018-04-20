import java.util.*;
public class Snark {
 		private String name;
 		private int X;
 		private int Y;
 		private boolean isDead = false;
		public static int SIZE = Swamp.SIZE;
 		Random generator = new Random();

	public Snark(String name){
		this.name = name;
		this.X=generator.nextInt(SIZE);
		this.Y=generator.nextInt(SIZE);
	}
	public String getName() {
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public int getX(){
		return this.X;
	}
	public void setX(int newX){
		this.X=newX;
	}
	public int getY(){
		return this.Y;
	}
	public void setY(int newY){
		this.Y=newY;
	}
	public boolean getIsDead(){
		return isDead;
	}
	public void setIsDead(boolean newIsDead){
		isDead = newIsDead;
	}
	public String toString(){
		String snark = "name: " +name +", X coordinate: " + X +", Y coordinate: "+ Y;
		return snark;
	}

}