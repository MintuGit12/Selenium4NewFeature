package junit.practice.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReader {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jp=new JSONParser();
		FileReader file=new FileReader("./JsonFiles/employee.json");
		Object obj = jp.parse(file);
		JSONObject jo=(JSONObject)obj;
		System.out.println(jo.get("address"));
		JSONArray ja=(JSONArray)jo.get("address");
		for(int i=0;i<ja.size();i++)
		{
			JSONObject job=(JSONObject)ja.get(i);
			System.out.println(job.get("place"));
			System.out.println(job.get("street"));

		}
	}

}
