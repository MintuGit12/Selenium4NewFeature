package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTYTest {

		@DataProvider
		public static Object[][] exTest()
		{
			Object[][] ob= {{"ram","shayam"},{"test1","test2"}};
		
			return ob;
		}

@Test(dataProvider = "exTest")
	private static void data_provider(String name,String pwd) {
		System.out.println(name+"-->>>"+pwd);
		
	}

}
