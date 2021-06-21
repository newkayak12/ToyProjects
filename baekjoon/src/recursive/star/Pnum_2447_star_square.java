package recursive.star;

public class Pnum_2447_star_square {
	
	public static void main(String[] args) {
		new Pnum_2447_star_square().starMaker(1);
		 
	}
	
	public void starMaker(int j) {
		int i = j;
		if(i%3==0) {
			System.out.println("*");
			++i;
		} else if(i==5) {
			System.out.print(" ");
			++i;
		} else if(i>9){
			return;
		} else {
			System.out.print("*");
			++i;
		}
		new Pnum_2447_star_square().starMaker(i);
	}
}
