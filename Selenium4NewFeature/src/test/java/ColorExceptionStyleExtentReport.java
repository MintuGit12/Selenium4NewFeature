import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ColorExceptionStyleExtentReport {

	public static void main(String[] args) {
		ExtentReports extentReports=new ExtentReports();
		File f=new File("reportsAll.html"); 
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(f);
		String xml="<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n"
				+ "<xliff version=\"1.2\">\r\n"
				+ "  <file original=\"filename.txt\" source-language=\"en\" target-language=\"fr\">\r\n"
				+ "    <header />\r\n"
				+ "    <body>\r\n"
				+ "      <trans-unit id=\"red\">\r\n"
				+ "        <source>Red</source>\r\n"
				+ "        <target>Rouge</target>\r\n"
				+ "      </trans-unit>\r\n"
				+ "      <trans-unit id=\"blue\">\r\n"
				+ "        <source>Blue</source>\r\n"
				+ "        <target>Bleu</target>\r\n"
				+ "      </trans-unit>\r\n"
				+ "    </body>\r\n"
				+ "  </file>\r\n"
				+ "</xliff>";
		String json="{\r\n"
				+ "    \"fruit\": \"Apple\",\r\n"
				+ "    \"size\": \"Large\",\r\n"
				+ "    \"color\": \"Red\"\r\n"
				+ "}";
		try {
			extentReports.createTest("<b><i>All in one xml,json</i></b>")
			.info(MarkupHelper.createCodeBlock(xml,CodeLanguage.XML))
			.info(MarkupHelper.createCodeBlock(json,CodeLanguage.JSON));
			List<String> list=new ArrayList<String>();
			list.add("mohan");
			list.add("Sohan");
			list.add("Rohan");
			Map<Integer,String> map=new HashMap<Integer,String>();
			map.put(10, "physics");
			map.put(20, "Chemistry");
			map.put(30, "biology");
			Set<Integer> set=map.keySet();
			extentReports.createTest("<b><i>List,Set,Queue</i></b>")
			.info(MarkupHelper.createOrderedList(list))
			.info(MarkupHelper.createUnorderedList(set))
			.info(MarkupHelper.createOrderedList(map));
			extentReports.createTest("<b>Highlight</b>")
			.info(MarkupHelper.createLabel("Just highlight the lebel with Red", ExtentColor.RED));
			int i=10/0;
		} catch (Exception e) {
			extentReports.createTest("<i>Just Log Exception in catch block for Reports</i>")
			.info(MarkupHelper.createLabel(e.toString(), ExtentColor.RED));
		}
		extentReports.flush();
	}

}
