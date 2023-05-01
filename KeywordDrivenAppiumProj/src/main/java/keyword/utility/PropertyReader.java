package keyword.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {


public String propFileRead(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./src/main/java/keyword/config/config.properties");
	Properties p=new Properties();
	p.load(fis);
	String val = p.getProperty(key);
	return val;
}
}
