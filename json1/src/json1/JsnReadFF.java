package json1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.json.stream.JsonParser;

public class JsnReadFF {

	public static void main(String[] args) {
		
		try {
			FileInputStream in = new FileInputStream("/home/movit/movit/testjava/json1/testjson.json");
			
			//JsonParser parser = Json.createParser(reader);
		/*	System.out.println(parser.getInt());
			System.out.println(parser.getString());*/
			 JsonParser jr = Json.createParser(in);
			
			System.out.println(jr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}
