package star;

public class Star {


		public static void main(String[] args) {
			
			int o=1; 
				 for(int i =1; i <=5; i++) {
					for(int j=5; j>=1; j--) {
						System.out.print(" ");
						if(i>=j) {
						
							break;
						}
					}
				
					for(int k=1; k<=15; k++) {
						 System.out.print("#");
						 if(o<=k) {
							 System.out.println();
							 o+=2;
						 break;
						 }
					}
				 }

				 
				 
				 
				 
//				 int o=1; 
//				 for(int i =1; i <=5; i++) {
//					 for(int k=1; k<=15; k++) {
//						System.out.print("#");
//						 if(o<=k) {
//							 System.out.println();
//							 o+=2;	 
//						 break;
//						 }
//						 
//				 	}
//				 }
				 
				 
	}

}
