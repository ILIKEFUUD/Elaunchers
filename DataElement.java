/*
 * Represents a data element
 * each data element will get its own row
 * Every company is one data element
 */

import java.util.ArrayList;

public class DataElement {
	private String name;
	private String[] info;
	private ArrayList<Integer> transactions = new ArrayList<Integer>();//stores transactions 

	public DataElement(String n) {
		
		name = n;
		info = new String[7];//holds 8 information values for each company
		//first name, last name, email, title, department, phone, fax
	}

	public void addFName(String Fname) {
		info[0] = Fname;
	}

	public void addLName(String Lname) {
		info[1] = Lname;
	}

	public void addEmail(String email) {
		info[2] = email;
	}

	public void addTitle(String title) {
		info[3] = title;
	}

	public void addDept(String dept) {
		info[4] = dept;
	}

	public void addPhone(String phone) {
		info[5] = phone;
	}

	public void addFax(String fax) {
		info[6] = fax;
	}

	public void addTransaction(int money) {
		transactions.add(money);
	}
	
	//override toString
	public String toString(){
		String print = "\"" + name + "\",";
		
		for (String i : info)
			print+= "\"" + i + "\",";
		
		for (int m : transactions)
			print+= "\"" + m + "\",";
		
		return print;
		
	}

}
