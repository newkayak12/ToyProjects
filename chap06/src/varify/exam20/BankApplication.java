package varify.exam20;

import java.util.*;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
		private static Scanner scanner = new Scanner(System.in);
		
		
	public static void main(String[] args) {
		boolean run =true;
			while( run ) {
				System.out.println("---------------------------------------------------------------");
				System.out.println();
				System.out.println("                    Bank Service");
				System.out.println();
				System.out.println("---------------------------------------------------------------");
				System.out.println("1.create | 2.list | 3.deposit | 4. withdraw | 5.exit");
				System.out.println("---------------------------------------------------------------");
				System.out.print("select >");
				
			int selectNo = scanner.nextInt();
				
				if( selectNo ==1 ) {
					cA();
				} else if ( selectNo ==2)  {
					accountList();
				} else if ( selectNo ==3 ) {
					deposit();
				} else if ( selectNo ==4 ) {
					withdraw();
				} else if( selectNo ==5 ) {
					run = false;
				}
					
			}
			System.out.println("Process logged out");}
			
			
				
	
			
	

//1 create account

private static void cA ( ) {
	
		
ac :		for(int i=0; i<accountArray.length; i++) {
		System.out.print("Your Name > ");
			String nm=scanner.next();
		System.out.print("Your Accont Number > ");
			String ac=scanner.next();
		System.out.print("Your deposit amount > ");
			int bal = scanner.nextInt();
			accountArray [i] =new Account (nm, ac, bal);
		System.out.print("countinue? y/n");
		String input = scanner.next();
		if(input.equals("y")) {
		continue ac;	
		} else {
			break;
		}
		}
}

//2 account list

private static void accountList() {
	 
ac:		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]!=null) {
				System.out.println("Account list");
				System.out.println("Name : "  + accountArray[i].getOwner() + " | Account Number : " + accountArray[i].getAno() + " | Balance : " + accountArray[i].getBalance());
			} else {
				break;
			}

		}
	
}

//3 deposit

private static void deposit() {
	int sum;
	System.out.println("Deposit");
	System.out.print("please enter your account number >");
	String input = scanner.next();
	System.out.print("please enter the amount to deposit > ");
	int inputN = scanner.nextInt();
	System.out.print("Current Account Balance : ");
	sum= findAccount(input).getBalance() + inputN;
	findAccount(input).setBalance(sum);
	System.out.println(findAccount(input).getBalance());
}

//4 withdraw

private static void withdraw() {
	int sum;
	System.out.println("Withdraw");
	System.out.print("please enter your account number >");
	String input = scanner.next();
	System.out.print("please enter the amount to withdraw > ");
	int inputN = scanner.nextInt();
	System.out.print("Current Account Balance : ");
	sum= findAccount(input).getBalance() - inputN;
	findAccount(input).setBalance(sum);
	System.out.println(findAccount(input).getBalance());	
	}
private static Account findAccount (String ano) {
	int j = 0;
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(ano.equals(accountArray[i].getAno())) {
j=i;					j=i;
				}
			} else {break;}					
				}
 return accountArray[j];		
}
	}




