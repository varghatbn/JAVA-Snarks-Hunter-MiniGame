import java.util.*;
public class GameDrive {

    public static void main(String[] args){

    	int hunterCounter=0;
    	int snarkCounter =0;
    	char answer;
    	Swamp swamp1 = new Swamp();
    	int keyx=0;
    	int keyy=0;
    	int tryCounter=0;

    	Scanner input = new Scanner(System.in);

    	swamp1.welComeMsg();
    	System.out.println("Would you like to play? (y/n)");
    	answer = input.next().charAt(0);

		//to validate the input

    	while (answer !='y' && answer != 'n'){
    		System.out.println("Invalid input. Please type y for yes and n for no");
    		answer = input.next().charAt(0);
    	}


		while (answer == 'y'){
			if(tryCounter==0){
				swamp1 = new Swamp();
				System.out.println("\n\nThe snark is now hiding somewhere in dismal Swamp (pictured below). You may begin shooting!\n\n");
    		swamp1.showGrid();
			}
			if(keyx!=1){

			System.out.println("\nEnter the x and y coordinate of your shot on the same line separated by a space or enter -1 to quit");
			keyx = input.nextInt();
			}

			if (keyx != -1 && !swamp1.snark1.getIsDead() && tryCounter<5){
			keyy = input.nextInt();

				swamp1.hunter1.setX(keyx);
				swamp1.hunter1.setY(keyy);
				tryCounter++;
				swamp1.setHunterShot();
				System.out.println("\n\nTry # "+tryCounter+" " +"("+(5-tryCounter)+ " left)");
				swamp1.setRelativePosition();
				System.out.println(swamp1.getRelativePosition());
				swamp1.getIsSnarkDead();
				if (tryCounter > 4){
					keyx=1;
				}

				if (swamp1.snark1.getIsDead()){
					hunterCounter++;
					keyx=1;

				}


			}

				else{
					if (!swamp1.snark1.getIsDead() && keyx !=-1){
						snarkCounter++;
					}

					swamp1.snark1.setIsDead(false);
					tryCounter=0;
					if(keyx==-1){
						snarkCounter++;
					}
					keyx=0;
					System.out.println("\nWould you like to play again? (y/n)");
					answer = input.next().charAt(0);
						while (answer !='y' && answer != 'n'){
    				System.out.println("Invalid input. Please type y for yes and n for no");
    				answer = input.next().charAt(0);
					}




				}




    }



    System.out.println("\n\n\nThank you for playing\n");
    System.out.println("Hunter scored: "+ hunterCounter);
    System.out.println("Snark scored: "+ snarkCounter);


}
}