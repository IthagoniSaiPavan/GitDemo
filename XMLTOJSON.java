package jsontoxml;

import org.json.JSONObject;
import org.json.XML;
 
public class XMLTOJSON {
	public static String convertXmlTOJson(String xmlString) {
		JSONObject jsonObject=XML.toJSONObject(xmlString);
		return jsonObject.toString(4);
		
	}
 
	public static void main(String[] args) {
		String XmlInput="<person><name>Sai Pavan</name><age>22</age><city>Tenali</city></person>";
	
		String jsonOutput=convertXmlTOJson(XmlInput);
		System.out.println("Converted JSON:");
		System.out.println(jsonOutput);
	}
		
		
}
 
