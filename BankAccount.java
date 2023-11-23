import java.util.Scanner;

class BankAccount{
	int balance;
	int prevTransaction;
	String customerName;
	String customerId;
	
	int flag=0;
	BankAccount(String cName, String cID){
		customerName= cName;
		customerId=cID;
	}

	  public final void clscr(){
		  try{

			  final string os=System.getProperty("os.name");

			  if(os.contains("windows")){
				  
				  Runtime.getRuntime()exec("clear");
				  
			  }
			    else{
					Runtime.getRuntime().exec("clear")
					
					
				}
		  }
		     catch(final Exception e){

				 new processBuilder("cmd", "/c","cls").inheritIo().start().waitfor();

			 }
	  }
	     catch (final Exception es){

		 }
}
        void checkId() {

			clrscr();
			System.out.println("welcome"+ customerName);
			System.out.println();
			System.out.println("please enter the customer Id or pin:");

			Scanner id=new Scanner(System.in);
			String chk=id.nextLine();

			if(chk.equals(customerid)){

				clrscr();
				showMenu();
			} 
			else
				{

				System.out.println("===============================");
				System.out.println("wrong Login!");
				System.out.println("===============================");


				if(flag< 3){
					flag++;
					chekId();
				}
				}
		} 

		  void deposit(int amount){
			  if(amount!=0){
				  balance=balance+amount;
				  preTransaction=amount;
			  }
		  }
		   void withdraw( int amount){
                  if(this.balance>amount){
				  balance=balance-amount;
				  prevTransaction=-amount;
				  }
				  else
			   {
					  clrscr();
					  System.out.println("==============================");
					  System.out.println("Sufficient Blance not available for this withdraw!");
					  System.out.println("===============================");

			   }
		   }
		     void getprevTransaction() {
				 if(prevTransaction >0) {
					 System.out.println("Deposited:"+ prevTransaction);
				 }
				 else if(prevTransaction <0){
					 System.out.println("withdraw: " +Math.abs(prevTransaction));
				 }
				 else
				 {
					 System.out.println("No tarnsaction occured");
				 }
			 }
			     public void transfer(double amount,BankAccount acc){
					 if(this.balance < amount){
						 clrscr();
						 System.out.println("============================");
						 System.out.println("Transfers fail due to insufficient balance!");
						 System.out.println("============================");
					 }
					 else
					 {
						 this.balance-=amount;
						 acc.balance+=amount;
						 System.out.println("Account of "+this.customerName+"becomes $" +this.balance);
						 System.out.println("Account of "+acc.customerName +"becomes $" +acc.balance);
						 System.out.println("\n");
					 }
				 }
				   private void showMenu(){
					   char option;
					   Scanner sc=new Scanner(System.in);
					   System.out.println("Your Id is "+customer Id);
					   do{
						   System.out.println("\n");
						   System.out.println("\n");
						   System.out.println("A. Check Balance");
						   System.out.println("B. Deposit");
						   System.out.println("C. withdraw");
						   System.out.println("D. prevTransaction");
						   System.out.println('E. transfer");
						   System.out.println("F. Exit");

						   System.out.println("=============================");
						   System.out.println("Enter the option");
						   System.out.println("=============================");
						   option=sc.next().charAt(0);
						   option=character.toUpperCase(option);
						   System.out.println("\n");
						   
						   switch(option) {
							   case 'A':
							   clrscr();
							   System.out.println("===========================");
							   System.out.println("Balance" +balance);
							   System.out.println("===========================");
							   System.out.println("\n");
							   break;

							   case 'B':
								   clrscr();
							       System.out.println("===========================");
								   System.out.println("Enter the amount of Deposit");
								   System.out.println("============================");
								   int amount=sc.nextInt();
								   deposit(amount);
								   System.out.println("\n");
								   break;

								case 'C':
									clrscr();
								    System.out.println("===========================");
									System.out.println("Enter the amount of withdraw");
									System.out.println("============================");
									int amount2=sc.nextInt();
									withdraw(amount);
									System.out.println("\n");
									break;

								case 'D':
									clrscr();
								    System.out.println("===============================");
									getPrevTransaction();
									System.out.println("===============================");
									System.out.println("\n");
									
								case 'E':
									Clrscr();
								    System.out.println("********************************");
									System.out.println("To whom");
									BankAccount bb=new BankAccount("Vijay", "1002");
									System.out.println(bb.customerName);
									System.out.println("*********************************");
									System.out.println("Ammount to transfer");
									double am=sc.nextDouble();
									System.out.println("***********************************");
									transfer(am, bb);
									break;

								case'F':
									Clrscr();
								    System.out.println("************************************");
									break;

									default:
										Clrscr();
									    System.out.println("Invalid option! please enter again");
						   }
					   }
					       while(option!='F');
						   System.out.println("ThankYou For using our services");


				   }
				   }
				    public class ATMinterface{
						public static void main(String[]args){
							BankAccount ba=new BankAccount("Lokesh","1008");
							ba.CheckId();
						}
					}
