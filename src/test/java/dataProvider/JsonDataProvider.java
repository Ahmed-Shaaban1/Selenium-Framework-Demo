package dataProvider;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDataProvider {
	 @DataProvider(name = "loginData")
	    public Object[][] loginDataProvider() throws Exception {
	    	String jsonFile = System.getProperty("user.dir")+"\\src\\test\\java\\data\\data.json";

	        ObjectMapper mapper = new ObjectMapper();
	        JsonNode root = mapper.readTree(new File(jsonFile));

	        List<Object[]> data = new ArrayList<>();

	        Iterator<JsonNode> elements = root.elements();
	        while (elements.hasNext()) {
	            JsonNode user = elements.next();
	            String username = user.get("username").asText();
	            String password = user.get("password").asText();
	            data.add(new Object[]{ username, password });
	        }

	        return data.toArray(new Object[0][]);
	    }
}
