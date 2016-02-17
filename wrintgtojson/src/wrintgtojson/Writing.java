package wrintgtojson;

import java.io.FileWriter;
import java.io.IOException;

import javax.json.JsonObject;

public class Writing {
	public static void main(String[] args) {
		System.out.println("hello");
		FileWriter file=null;
		
		JsonObject personObject = javax.json.Json.createObjectBuilder()
                .add("name", "Jack")
                .add("age", 13)
                .add("isMarried", false)
                .add("address", 
                javax.json.Json.createObjectBuilder().add("street", "Main Street")
                                               .add("city", "New York")
                                               .add("zipCode", "11111")
                                               .build()
                    )
                .add("phoneNumber", 
                		javax.json.Json.createArrayBuilder().add("00-000-0000")
                                              .add("11-111-1111")
                                              .add("11-111-1112")
                                              .build()
                    )
                .build();
		
		try 
		{
			file = new FileWriter("/home/movit/movit/testjava/json1/fromEtoJSN");
			file.write(personObject.toString());
			System.out.println("Successfully Copied JSON Object to File...");
			//System.out.println("\nJSON Object: " + personObject);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
