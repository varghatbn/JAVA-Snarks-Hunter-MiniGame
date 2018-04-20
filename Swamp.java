import java.util.*;
public class Swamp {

	public static int SIZE =10;
	private String relativePosition;
	public Hunter hunter1;
	public Snark snark1;

    public Swamp(){

		snark1 = new Snark("Snark1");
		hunter1 = new Hunter ("Hunter1");


    }

	public void showGrid(){
	int x=0;
    	int y=0;
		for( y = 9;y>=0;y--) {
			System.out.print(y+" ");
			for ( x=0;x<10;x++) {

				System.out.print(". ");

			}
			System.out.println();
			if (y==0){
			System.out.print("  ");
			for (int z=0; z<=9;z++)
			System.out.print(z+" ");
			}
		}
	}

	public void setHunterShot(){
		int x=0;
    	int y=0;
		for( y = 9;y>=0;y--) {
			System.out.print(y+" ");
			for ( x=0;x<10;x++) {
				if (x==hunter1.getX() && y==hunter1.getY()) {
					if(hunter1.getX() == snark1.getX() && hunter1.getY()== snark1.getY()){
						System.out.print("X ");
						x++;
					}
					else{
					System.out.print("* ");
					x++;
					}
			}
					if(x<10){

				System.out.print(". ");
					}
			}
			System.out.println();
			if (y==0){
			System.out.print("  ");
			for (int z=0; z<=9;z++)
			System.out.print(z+" ");
			}

		}
	}

	public boolean getIsSnarkDead(){
		if (hunter1.getX() == snark1.getX() && hunter1.getY()== snark1.getY()){
				 snark1.setIsDead(true);
		}
		return snark1.getIsDead();
	}

	public String setRelativePosition(){
		if(hunter1.getX() < snark1.getX() && hunter1.getY() < snark1.getY()){
			relativePosition = "Too far West and too far South. The Snark Lives!\n";
		}
		else if(hunter1.getX()< snark1.getX() && hunter1.getY() >snark1.getY()){
			relativePosition = "Too far West and too far North. The Snark Lives!\n";
		}
		else if(hunter1.getX()>snark1.getX() && hunter1.getY()<snark1.getY()){
			relativePosition ="Too far East and too far South. The Snark Lives!\n";
		}
		else if(hunter1.getX()>snark1.getX() && hunter1.getY()>snark1.getY()){
			relativePosition ="Too far East and too far North. The Snark Lives!\n";
		}
		else if(hunter1.getX()==snark1.getX() && hunter1.getY()>snark1.getY()){
			relativePosition="Too far North and x is correct. The Snark Lives!\n";
		}
		else if(hunter1.getX()==snark1.getX() && hunter1.getY()<snark1.getY()){
			relativePosition="Too far South and x is correct. The Snark Lives!\n";
		}
		else if(hunter1.getX()<snark1.getX() && hunter1.getY()==snark1.getY()){
			relativePosition="Too far West and y is correct. The Snark Lives!\n";
		}
		else if(hunter1.getX()>snark1.getX() && hunter1.getY()==snark1.getY()){
			relativePosition="Too far East and y is correct. The Snark Lives!\n";
		}
		else if(hunter1.getX()==snark1.getX() && hunter1.getY()==snark1.getY()){
			relativePosition="A Hit. The Snark is Dead!\n";
		}
		return relativePosition;
	}


	public String getRelativePosition(){
		return relativePosition;
	}


	public void welComeMsg(){
		System.out.println("*************************************************\n"+
						"***              Hunt the Snark!              ***\n"+
					"*************************************************\n"+
 				"The SNARK is a vicious beast that lives in the\n"+
 			"dismal swamp outside the city. To hunt it, you\n"+
 		"must enter 2 coordinates, each from 0-"+(SIZE-1)+" using\n"+
 		"an x y format (x = West/East, y = South/North).\n"+
 	"You will then be told how accurate your aim is.\n"+
 	"You have just 5 shots to find the SNARK!\n"+
	"*************************************************\n");
	}

}