package json1;

import javax.json.JsonObject;
//import javax.json.JsonValue;

public class Json {
	public static void main(String[] args) {
		JsonObject obj= javax.json.Json.createObjectBuilder()
				.add("name","movit")
				.add("id",2)
				.add("male", true)
				.add("lang","java")
				.build();
		//JsonValue fn=obj.get("name");
		//JsonValue id=obj.get("name");
		//JsonValue ml=obj.get("male");
		//JsonValue lang=obj.get("lang");
		
		/*String mv=fn.toString();
		String male=ml.toString();
		String lan=lang.toString();*/
		
		/*System.out.println(mv);
		System.out.println(male);
		System.out.println(lan);*/
		System.out.println(obj);
		
	}

}
