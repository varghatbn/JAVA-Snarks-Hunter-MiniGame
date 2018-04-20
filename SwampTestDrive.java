
public class SwampTestDrive {

    public static void main(String[] args) {
    	Swamp swamp1 =new Swamp();
    	swamp1.hunter1.setX(4);
    	swamp1.hunter1.setY(3);
    	Snark snark1 = new Snark("testSnark");

		System.out.println("Expected Size: 10");
		System.out.println("Actual Size: "+Swamp.SIZE);

		System.out.println("\n");

		System.out.println("Show Grid:" );
		swamp1.showGrid();
		System.out.println("\n");

		System.out.println("Show hunter1 on the grid: which should be x:4 and y:3");
		swamp1.setHunterShot();

		System.out.println("\n\n\nExpected boolean getSnarkIsDead : false");
		System.out.println("actual boolean getSnarkIsDead: "+swamp1.getIsSnarkDead() );
		System.out.println("\n");

		System.out.println("Expected relative position must be one of the options bellow:\n" +
							"1.Too far West and too far South. The Snark Lives!\n"+
							"2.Too far West and too far North. The Snark Lives!\n"+
							"3.Too far East and too far South. The Snark Lives!\n"+
							"4.Too far East and too far South. The Snark Lives!\n"+
							"5.Too far North and x is correct. The Snark Lives!\n"+
							"6.Too far South and x is correct. The Snark Lives!\n"+
							"7.Too far West and y is correct. The Snark Lives!\n"+
							"8.Too far East and x is correct. The Snark Lives!\n"+
							"9.A Hit. The Snark is Dead!");
		System.out.println();

		System.out.println("Actual relative position example 1 is : \n"+ swamp1.setRelativePosition());

		swamp1 = new Swamp();
		System.out.println("Actual relative position example 2 is : \n"+ swamp1.setRelativePosition());

		swamp1 = new Swamp();
		System.out.println("Actual relative position example 3 is : \n"+ swamp1.setRelativePosition());

		swamp1 = new Swamp();
		System.out.println("Actual relative position example 4 is : \n"+ swamp1.setRelativePosition());

		swamp1 = new Swamp();
		System.out.println("Actual relative position example 5 is : \n"+ swamp1.setRelativePosition());


		System.out.println("\nExpected Welcome Message: \n"+
			"*************************************************\n"+
						"***              Hunt the Snark!              ***\n"+
					"*************************************************\n"+
 				"The SNARK is a vicious beast that lives in the\n"+
 			"dismal swamp outside the city. To hunt it, you\n"+
 		"must enter 2 coordinates, each from 0-"+(Swamp.SIZE-1)+" using\n"+
 		"an x y format (x = West/East, y = South/North).\n"+
 	"You will then be told how accurate your aim is.\n"+
 	"You have just 5 shots to find the SNARK!\n"+
	"*************************************************\n");

		System.out.println("\nActual Welcome Message: ");
		swamp1.welComeMsg();


    }


}