
public class HunterTestDrive {

    public static void main(String[] args) {
		Hunter hunter1 = new Hunter("Cedric", 9 ,5);

		System.out.println("Expected name is Cedric");
		System.out.println("Actual name is "+hunter1.getName());
		System.out.println();

		System.out.println("Expected X coordinate is 9");
		System.out.println("Actual name is "+hunter1.getX());
		System.out.println();

		System.out.println("Expected Y coordinate is 5");
		System.out.println("Actual name is "+hunter1.getY());
		System.out.println();

		System.out.println("Expected name: Cedric, X coordinate: 9, Y coordinate: 5");
		System.out.println("Actual " +hunter1.toString());
    }


}