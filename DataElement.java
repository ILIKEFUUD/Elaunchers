
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

	public DataElement(String n) {

		name = n;

		transactions = new ArrayList<Integer>();

		data = new ArrayList<String>();

		// first name, last name, email, title, department, phone, fax
	}

	public void add(String dataEntry) {
		data.add(dataEntry);
	}

	public void addTransaction(int money) {
		transactions.add(money);
	}

	// override toString
	public String toString() {
		return "\"" + name + "\"," + "\"," + data.toString() + "\"," + "\"," + transactions.toString();
	}

	public boolean done() {
		return data.size() == 7;
	}

}
