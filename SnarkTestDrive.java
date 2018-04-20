public class SnarkTestDrive {

    public static void main (String[] args) {

	Snark snark1 = new Snark("mice");

	System.out.println("Expected name of the Snark is: mice ");
	System.out.println("Actual name of the Snark is: " + snark1.getName());
	System.out.println();

	System.out.println("Expected value for X is: 0..." + (Snark.SIZE-1));
	System.out.println("Actual value for X is: " + snark1.getX());
	System.out.println();

	System.out.println("Expected value for Y is: 0..." + (Snark.SIZE-1));
	System.out.println("Actual value for X is: " + snark1.getY());
	System.out.println();

	System.out.println("Expected name: mice, X coordinate: "+snark1.getX()+", " + "Y coordinate: "+ snark1.getY());
	System.out.println("Actual "+snark1.toString());
	System.out.println();

	System.out.println("Expected boolean isDead: false");
	System.out.println("actual boolean isDead: "+snark1.getIsDead());
	System.out.println();

	System.out.println("Expected name: mice, X coordinate:0...9, Y coordinate:0...9");
	System.out.println("Actial "+snark1.toString());
    }

}
