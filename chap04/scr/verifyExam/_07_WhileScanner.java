package verifyExam;

import java.util.Scanner;


public class _07_WhileScanner {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
boolean run = true;
int balance=20000;
Scanner scanner = new Scanner(System.in);
String inputString;
int keyinput = 0;

rturn: do {
main: do {
	System.out.println("-------------------------------------------------");
	System.out.println("                     ATM ����            		 ");
	System.out.println("-------------------------------------------------");
	System.out.println("                  1.   �Ա�                     �� ");
	System.out.println("                  2.   ���                     �� ");
	System.out.println("                  3. ���� ��ȸ    			�� ���� ");
	System.out.println("                  4. ���� ����                 ");
	System.out.println("-------------------------------------------------");
	System.out.print(">");
	inputString = scanner.nextLine();
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	if(inputString.equals("1")) {
deposit: do {	
	System.out.println("-------------------------------------------------");		
	System.out.println();
	System.out.println();
	System.out.println("             �Ա� ���񽺸� �����մϴ�.");
	System.out.println("             �󸶸� �Ա��Ͻðڽ��ϱ�?");
	System.out.println();
	System.out.println();
	System.out.println("                                     q: ���� �޴�����");
	System.out.println("-------------------------------------------------");
	System.out.print(">");
	inputString = scanner.nextLine();
	if(inputString.equals ("q")) { break main;
	} else {
	//�Ա�	
	keyinput = Integer.parseInt(inputString);
		balance += (long) keyinput;
		System.out.println("-------------------------------------------------");	
		System.out.println("         "+keyinput + "���� �Ա��߽��ϴ�.");
		System.out.println("      ���� ���� �ܰ�� " + balance + "�� �Դϴ�.");
		System.out.println();
		System.out.println();
		System.out.println("           �߰��� �Ա��Ͻðڽ��ϱ�? Y/N");
		System.out.println("-------------------------------------------------");	
		System.out.println(">");
		inputString = scanner.nextLine();
		if(inputString.equals("Y")||inputString.equals("y")) {
			continue deposit;
		}else if(inputString.equals("N")||inputString.equals("n")){ continue rturn;
   }
		}
	}  while(!inputString.equals("q"));
	continue main;
	//////////////////////////////////////////////////////////////////////
	} else if(inputString.equals("2")) {
withdraw :do {
	System.out.println("-------------------------------------------------");		
	System.out.println();
	System.out.println("             ��� ���񽺸� �����մϴ�.");
	System.out.println("              �󸶸� ����Ͻðڽ��ϱ�?");
	System.out.println();
	System.out.println("                                     q: ���� �޴�����");
	System.out.println("-------------------------------------------------");
	System.out.println(">");
	inputString = scanner.nextLine();
if(inputString.equals ("q")) { break main;
	} else {
	//���	
		keyinput = Integer.parseInt(inputString);
		if((long)balance>=(long)keyinput) {
///////////////////////////////////////////////////////// ���̳ʽ� �����	
		balance -= (long) keyinput;
		System.out.println("-------------------------------------------------");	
		System.out.println("         "+keyinput + "���� ����߽��ϴ�.");
		System.out.println("      ���� ���� �ܰ�� " + balance + "�� �Դϴ�.");
		System.out.println();
		System.out.println();
		
		System.out.println("           �߰��� ����Ͻðڽ��ϱ�? Y/N");
		System.out.println("-------------------------------------------------");	
		System.out.println(">");
		inputString = scanner.nextLine();
	
		if(inputString.equals("Y")||inputString.equals("y")) {
			continue withdraw;
		}else if(inputString.equals("N")||inputString.equals("n")){ continue rturn;
		  
		}
   }else {System.out.println("�ܰ� �����մϴ�.");
   System.out.println("�ݾ��� �ٽ� �Է��� �ֽʽÿ�");
	continue withdraw;
	}
		}
} while(!inputString.equals("q"));
	continue main;
	} else if(inputString.equals("3")) {
check: do {		
		System.out.println("-------------------------------------------------");		
		System.out.println();
		System.out.println("             �ܰ� ��ȸ ���񽺸� �����մϴ�.");
		System.out.println("             ���� �� �ݾ���  " + balance + "�� �Դϴ�.");
		System.out.println();
		System.out.println("                                     q: ���� �޴�����");
		System.out.println("-------------------------------------------------");
		inputString = scanner.nextLine();
} while(!inputString.equals("q"));
	continue main;
	}
}while (!inputString.equals("4"));
System.out.println("���񽺸� �����մϴ�.");

} while (!inputString.equals("4"));
System.out.println("�̿����ּż� �����մϴ�.");
}
}
	//// Ȯ�ι������� ��޾Ƽ� ������µ� I/O �Է� ��ġ �� �𸣴ϱ� ��򸮳�
// ����, �ݸ� �ٽ� �� �� �����ϰ� ���� �� �������߰ڴ�.