package generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {
public String readPropertyData(String key) throws IOException
{
	FileInputStream fis=new FileInputStream(iPathConstant.PROPERTY_FILE);
	Properties p=new Properties();
	p.load(fis);
	return p.getProperty(key);
	
}

}
