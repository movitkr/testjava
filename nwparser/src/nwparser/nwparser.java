package nwparser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.json.Json;
import javax.json.stream.JsonParser;

public class nwparser {
	
public static void main(String[] args) {
	
	try {
		FileInputStream json = new FileInputStream("/home/movit/movit/wrintgtojson/testjson.json");
		JsonParser jr = Json.createParser(json);
		
		while (jr.hasNext()) {
		   JsonParser.Event event = jr.next();
		   switch(event) {
		   case START_ARRAY:{
           	System.out.println("[");
               break;
           }
           
           case START_OBJECT:{
           	System.out.println("{");
           	break;
           }
           
           case END_OBJECT:{
           	System.out.println("}");
           	break;
           }
           case END_ARRAY:{
           	System.out.println("]");
           	break;
           }
           case KEY_NAME: {
               System.out.print(jr.getString());
               System.out.print(" = ");
               break;
           }
           case VALUE_FALSE: {
               System.out.println(false);
               break;
           }
           case VALUE_NULL: {
               System.out.println("null");
               break;
           }
           case VALUE_NUMBER: {
               if(jr.isIntegralNumber()) {
                   System.out.println(jr.getInt());
               } else {
                   System.out.println(jr.getBigDecimal());
               }
              break;
           }
           case VALUE_STRING: {
               System.out.println(jr.getString());
               break;
           }
           case VALUE_TRUE: {
               System.out.println(true);
               break;
           }
           default: {
           	
           }
		   }
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}
