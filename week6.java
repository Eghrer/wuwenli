public class BankAccount {
	
	private String accountNum;
	private double balance;
	public BankAccount() {
		super();
	}
	public BankAccount(String accountNum,double balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNum=" + accountNum + ", balance=" + balance + "]";
	}
	
}



public class CheckingAccount extends BankAccount{
	private double serviceChange;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String accountNum, double balance, double serviceChange) {
		super(accountNum, balance);
		this.serviceChange = serviceChange;
	}

	public double getServiceChange() {
		return serviceChange;
	}

	public void setServiceChange(double serviceChange) {
		this.serviceChange = serviceChange;
	}
	public String toString(){
		String info;
		info = "";
		return info;
	}
	
	public void assessServiceCharge(){
		
	}
}



public class Customer {
	private String ssn;
	private String name;
	private CheckingAccount checkingAccount;
	private SavingAccount savingAccount;
	public Customer() {
		super();
	}
	public Customer(String ssn, String name, CheckingAccount checkingAccount) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.checkingAccount = checkingAccount;
		this.savingAccount = savingAccount;
	}
	public Customer(String ssn, String name, SavingAccount savingAccount) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.checkingAccount = checkingAccount;
		this.savingAccount = savingAccount;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	public SavingAccount getSavingAccount() {
		return savingAccount;
	}
	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}
	
	public String toString(){
		String msg;
		msg = "";
		return msg;
	}
	
	
	
}




import java.util.Scanner;

public class Driver {
public static CheckingAccount ca;
public static SavingAccount sa;

	public static void main(String[] args) {
		int choice = menu();
		while(choice!=8){
			switch(choice){
			case 1:createAccount();break;
			case 2:saveMoney();break;
			case 3:withdraw();break;
			case 4:comsume();break;
			case 5:repay();break;
			case 6:settle();break;
			case 7:balance();break;
			default:System.out.println("??????????????????????????????");break;
			}
			choice = menu();
		}
		System.out.println("?????????????????????????????????");

	}
	public static int menu(){
		int choice = 0;
		System.out.println("====????????????????????????====");
		System.out.println("1.??????create");
		System.out.println("2.??????save");
		System.out.println("3.??????withdraw");
		System.out.println("4.??????comsume");
		System.out.println("5.??????repay");
		System.out.println("6.????????????settle");
		System.out.println("7.????????????balance");
		System.out.println("8.??????exit");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}
	public static int subMenu(){
		int choice = 0;
		System.out.println("---??????????????????---");
		System.out.println("1.?????????checkingAccount");
		System.out.println("2.?????????savingAccount");
		System.out.println("3.??????exit");
		System.out.println("?????????1-3???");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
	}
	
	public static void createAccount(){
		int choice = subMenu();
		Scanner scan = new Scanner(System.in);
		while(choice!=3){
			switch(choice){
			case 1:
				System.out.println("?????????????????????:");
				String ssn = scan.next();
				System.out.println("???????????????:");
				String name = scan.next();
				System.out.println("???????????????:");
				String accountNum = scan.next();
				System.out.println("??????????????????:");
				double serviceChange = scan.nextDouble();
				if(serviceChange <= 0) {System.out.println("????????????>0");break;}
				
				ca = new CheckingAccount(accountNum,50000,serviceChange);
				Customer cus = new Customer(ssn,name,ca);
				break;
			case 2:
				System.out.println("?????????????????????:");
				String ssn2 = scan.next();
				System.out.println("???????????????:");
				String name2 = scan.next();
				System.out.println("???????????????:");
				String accountNum2 = scan.next();
				System.out.println("???????????????:");
				double interestRate = scan.nextDouble();
				if(interestRate<0) {System.out.println("?????????>0");break;}
				
				sa = new SavingAccount(accountNum2,0,interestRate);
				Customer cus2 = new Customer(ssn2,name2,sa);
				break;
				default:System.out.println("??????????????????????????????");break;
			}
			choice = subMenu();
		}
		
	}
	public static void saveMoney(){
		if(sa == null) {
			System.out.println("????????????...");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("????????????????????????");
		double savemoney = scan.nextDouble();
		sa.setBalance(sa.getBalance()+savemoney);
		System.out.println("???????????????");
	}
	public static void withdraw(){
		if(sa == null) {
			System.out.println("????????????...");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("????????????????????????");
		double widraw = scan.nextDouble();
		if(sa.getBalance() < widraw) {
			System.out.println("???????????????");
			return;
		}
		sa.setBalance(sa.getBalance()-widraw);
		System.out.println("???????????????");
	}
	public static void comsume(){
		if(ca == null) {
			System.out.println("????????????...");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("????????????????????????");
		double com = scan.nextDouble();
		if(ca.getBalance()<com) {
			System.out.println("???????????????");
			return;
		}
		ca.setBalance(ca.getBalance()-com);
		System.out.println("???????????????");
	}
	public static void repay(){
		if(ca == null) {
			System.out.println("????????????...");
			return;
		}
		if (50000 - ca.getBalance() == 0) {
			System.out.println("????????????");
			return;
		}
		System.out.println("???????????????"+(50000-ca.getBalance()));

		Scanner scan = new Scanner(System.in);
		System.out.println("????????????????????????");
		double rep = scan.nextDouble();
		if(rep>50000-ca.getBalance()) {
			System.out.println("too much???????????????"+(50000-ca.getBalance()));
		}
		else if(rep>0) {
			ca.setBalance(ca.getBalance()+rep);
			System.out.println("???????????????");
		}
		
	}
	public static void settle(){
		if(ca != null)
			 ca.setBalance(ca.getBalance()-ca.getServiceChange());
		if(sa != null)
			 sa.setBalance(sa.getBalance()*(sa.getInterestRate()+1));
		if(ca == null && sa == null)
			 System.out.println("????????????...");
		else System.out.println("???????????????");
	}
	public static void balance(){
		if(ca != null) {
			System.out.println("??????????????????"+ca.getBalance());
		}
		if(sa != null) {
			System.out.println("??????????????????"+sa.getBalance());
		}
		if(ca == null && sa == null) {
			System.out.println("????????????...");
		}
	}
}





public class SavingAccount extends BankAccount{
	private double interestRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public String toString(){
		String info;
		info = "";
		return info;
	}
	
	public void payInterest(){
		
	}
}
