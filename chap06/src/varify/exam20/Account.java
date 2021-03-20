package varify.exam20;

public class Account {
	private String ownr, ano;
	private int balance;
	
		public Account( String ownr,  String ano, int balance ) {
			this.ownr=ownr;
			this.ano=ano;
			this.balance=balance;
		}
		
		public String getAno() {return ano;}
		public void setAno(String ano) { this.ano=ano;}
		public String getOwner() {return ownr;}
		public void setOwner(String ownr) { this.ownr=ownr;}
		public int getBalance() {return balance;}
		public void setBalance(int balance) {this.balance=balance;}
		
}
		
		

