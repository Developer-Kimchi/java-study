package apiTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class MessageTest {
	public static void main(String[] args) {
	      String api_key = "NCSMTLJRG0LWQFCJ";
	       String api_secret = "BU4UWYTLMB8KMBU32UTUFJTNRZ9VCYSF";
	       Message coolsms = new Message(api_key, api_secret);

	       // 4 params(to, from, type, text) are mandatory. must be filled
	       HashMap<String, String> params = new HashMap<String, String>();
	       
	       params.put("to", "01022862248");
	       params.put("from", "01051288921");
	       params.put("type", "SMS");
	       params.put("text", "´©³ª ¾È³ç");
	       params.put("app_version", "test app 1.2"); // application name and version

	       try {
	         JSONObject obj = (JSONObject) coolsms.send(params);
	         System.out.println(obj.toString());
	       } catch (CoolsmsException e) {
	         System.out.println(e.getMessage());
	         System.out.println(e.getCode());
	       }
	}

}
