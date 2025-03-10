package jsontoxml;

import org.json.JSONObject;
import org.json.XML;
 
public class JSONTOXML {
	public static String convertJsonToXml(String jsonString) {
		JSONObject jsonObject=new JSONObject(jsonString);
		return XML.toString(jsonObject);
		
	}
 
	public static void main(String[] args) {
		String jsonInput="{\"name\":\"Sai Pavan\",\"age\":22,\"city\":\"Hyd\"}";
	
		String xmlOutput=convertJsonToXml(jsonInput);
		System.out.println("Converted Xml:");
		System.out.println(xmlOutput);
		
		
		
}
}
 
