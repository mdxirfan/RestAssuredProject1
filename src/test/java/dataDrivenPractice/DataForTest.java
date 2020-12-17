package dataDrivenPractice;

import org.testng.annotations.DataProvider;

public class DataForTest {
	
	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost() {
		/*Object[][] data = new Object[2][3];
		
		data[0][0] = "Albert";
		data[0][1] = "Enistine";
		data[0][2] = 2;
		
		data[1][0] = "Mohit";
		data[1][1] = "Rahul";
		data[1][2] = 1;
		
		return data;*/
	
	   return new Object[][] {
		   {"Nawaz", "Ahamad", 1},
		   {"Rashid", "Khan", 2},
		   {"Rohit", "Anand", 1}
	   };
	   
	   	
	}	
	@DataProvider (name =  "dataForDel")
	public Object[] dataForDelete() {
		
		return new Object[] {
				4,5
		};
   }
	

}
