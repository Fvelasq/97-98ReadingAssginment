import java.util.*;

public class Account{
private int id = 0;
private double balance = 0;
private double annualInterestRate = 0;
private Date dateCreated = new Date();

Account account = new Account();

public Account(){
	id = id;
	dateCreated = dateCreated;
}

public int getId(){
	return id;
}

public double getBalance(){
	return balance;
}

public Date getDate(){
	return dateCreated;
}

public double getMonthlyInterestRate(){
	return annualInterestRate/12; 
}

public double getMonthlyInterest(){
	return  balance * getMonthlyInterestRate();
}


}

