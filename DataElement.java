
/*
 * Represents a data element
 * each data element will get its own row
 * Every company is one data element
 */

import java.util.ArrayList;

public class DataElement {
	private String name;
	// private String[] info;
	private ArrayList<Integer> transactions;// stores transactions

	private ArrayList<String> data;

	boolean isComplete = false;// represents when the data entry has all fields
								// completed

	public DataElement(String n) {

		name = n;
		// info = new String[7];//holds 8 information values for each company

		transactions = new ArrayList<Integer>();
		
		data = new ArrayList<String>();

		// first name, last name, email, title, department, phone, fax
	}

	/*
	 * public void addFName(String Fname) { info[0] = Fname; }
	 * 
	 * public void addLName(String Lname) { info[1] = Lname; }
	 * 
	 * public void addEmail(String email) { info[2] = email; }
	 * 
	 * public void addTitle(String title) { info[3] = title; }
	 * 
	 * public void addDept(String dept) { info[4] = dept; }
	 * 
	 * public void addPhone(String phone) { info[5] = phone; }
	 * 
	 * public void addFax(String fax) { info[6] = fax; isComplete = true; }
	 */

	public void add(String dataEntry) {
		data.add(dataEntry);
	}

	public void addTransaction(int money) {
		transactions.add(money);
	}

	// override toString
	//temporary, TODO: CHANGE TO BE CORRECT FORMATTING FOR CSV
	public String toString(){
		return name + data.toString() + transactions.toString();
	}
	

	/*
	 * public String toString(){ String print = "\"" + name + "\",";
	 * 
	 * for (String i : info) print+= "\"" + i + "\",";
	 * 
	 * for (int m : transactions) print+= "\"" + m + "\",";
	 * 
	 * return print;
	 * 
	 * }
	 */

	public boolean done() {
		return data.size() == 7;
	}

}
