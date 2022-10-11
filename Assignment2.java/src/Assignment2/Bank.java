package Assignment2;
public class Bank {

	private Double rateOfintrest = 1.2;
	private String pName = "Rupinder Kaur";
	private int accountNo = 15432534;
	private int salary = 1520000;

	public Bank() {
	}

	public Bank(double rateOfintrest, String pName, int accountNo, int salary) {
		this.rateOfintrest = rateOfintrest;
		this.pName = pName;
		this.accountNo = accountNo;
		this.salary = salary;
	}

	public double getRateOfintrest() {
		return rateOfintrest;
	}

	public void setRateOfintrest(double rateOfintrest) {
		this.rateOfintrest = rateOfintrest;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}

