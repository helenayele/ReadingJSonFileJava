package read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ReadJsonFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String filePath = System.getProperty("user.dir")+"//src//main//resources//myjson.json";
		System.out.println("The file path is " + filePath);
		Reader reader = new FileReader(filePath);
		Gson gson = new Gson();
		Type type = new TypeToken<HashMap<String, ArrayList<HashMap>>>(){}.getType();
	        
	    HashMap<String, ArrayList<HashMap>> testData = gson.fromJson(reader, type);
	    ArrayList<HashMap> testDataList = testData.get("students");
	    System.out.println("size of json list is" + testDataList.size());
	    for(HashMap<String,String> s : testDataList) {
	    	System.out.println(s.get("name") + " " + s.get("age") + "  " + s.get("city"));
	    }
	    
	    System.out.println("Hello this is the last line");
		
	}

}
