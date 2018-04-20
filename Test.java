
public class Test {

    public static void main (String [] args) {
		int x=0;
    	int y=0;
		for( y = 9;y>=0;y--) {
			System.out.print(y+" ");
			for ( x=0;x<10;x++) {
				if (x==2 && y==3) {
			System.out.print("x ");
			x++;

			}
				if (x==2 && y==3) {
			System.out.print("S ");
			x++;

			}
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



}