import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeSet;

/*
 * Rahul Shah
 * 4/16/2016
 * 
 * V 1.0 
 * 
 * Merges 2 Excel files into a text file 
 * Separated by quotes and commas
 * 
 * Format: Full name, company, transaction 1, transaction 2, ..., total spent, email, fax, phone
 */


public class LynnProDataConcat {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		//open files
		
		LynnProDataConcat obj = new LynnProDataConcat();
		
		obj.read1();
		

	}
	
	public void read1(){
		String file1 = "Customer Phone List Expanded 3-18-16 10-30 AM.csv";
		BufferedReader br = null;
		String line = "";
		String split = ",";
		TreeSet t = new TreeSet();
		try{
			br = new BufferedReader(new FileReader(file1));
			while((line = br.readLine()) != null){
				
				if(line.contains(",")){
					String company = line.substring(0, line.indexOf(","));
					
					//create DataElements
					DataElement e = new DataElement(company);
					
					int commaIndex = line.indexOf(",");
					while(!e.done()){
						if(line.indexOf(",", commaIndex+1) <=0)
							break;
						String data = line.substring(commaIndex+1, line.indexOf(",", commaIndex+1));
						e.add(data);
						commaIndex = line.indexOf(",", commaIndex+1);
					}
					System.out.println(e);
					
				}
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(br != null){
				try{
					br.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		System.out.println(t);
		System.out.println("Done");
	}//end of read


}//end of program
