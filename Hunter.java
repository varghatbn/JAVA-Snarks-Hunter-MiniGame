public class Hunter {
 		private String name;
 		private int X;
 		private int Y;


	public Hunter(String name, int X, int Y ){
		this.name = name;
		this.X=X;
		this.Y=Y;
	}
	public Hunter(String name){
		name = name;
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
		this.X= newX;
	}
	public int getY(){
		return this.Y;
	}
	public void setY(int newY){
		this.Y=newY;
	}
	public String toString(){
		String hunter = "name: " +name +", X coordinate: " + X +", Y coordinate: "+ Y;
		return hunter;
	}

}