package simplejson;

import java.io.StringWriter;

import javax.json.JsonObject;



public class simplejson {

	public static void main(String[] args) {
		
		  
		  JsonObject obj=Json.createObjectBuilder().add("firstname","john").build();
		 // obj.put("name","foo");
		 // obj.put("num",new Integer(100));
		 // obj.put("balance",new Double(1000.21));
		 // obj.put("is_vip",new Boolean(true));
		 // obj.put("nickname",null);
		 // StringWriter out = new StringWriter();
		 // obj.writeJSONString(out);
		  String jsonText = out.toString();
		  System.out.print(jsonText);

	}

}
