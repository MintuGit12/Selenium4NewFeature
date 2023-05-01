package Practice;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ser.std.SerializableSerializer;
import org.codehaus.jackson.map.ser.std.SerializableWithTypeSerializer;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JSONParser implements Serializable{
	double sal;
	int[] num;
	String name;
	String email;
	String gender;
	public JSONParser(double sal,int[] num,String name,String email,String gender)
	{
		this.sal=sal;
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
int[] ph= {7654989,9234797};
	JSONParser x=new JSONParser(234567,ph,"sumit","sumit123@gmail.com","male");
	ObjectMapper obm=new ObjectMapper();
	obm.writeValue(new File("./empJson.json"), x);
}
}
