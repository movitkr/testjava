package json1;

import javax.json.JsonArray;

public class jsonarray {
	public static void main(String[] args) {
		JsonArray value = javax.json.Json.createArrayBuilder()
			     .add(javax.json.Json.createObjectBuilder()
			         .add("type", "home")
			         .add("number", "212 555-1234"))
			     .add(javax.json.Json.createObjectBuilder()
			         .add("type", "fax")
			         .add("number", "646 555-4567"))
			     .build();
		System.out.println(value);
			 
	}
	

}
