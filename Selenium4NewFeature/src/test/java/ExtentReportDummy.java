import java.awt.Desktop;
import java.io.File;
import java.net.URI;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDummy {

	public static void main(String[] args) {
		//Engine for report
	ExtentReports extentReports=new ExtentReports();
	//ExtentSparkReporter is a reporter under ExtentReports
	ExtentSparkReporter sparkReporter=new ExtentSparkReporter("./spark.html");
	//add reporter to engine
	extentReports.attachReporter(sparkReporter);
	//at last flush the engine
	extentReports.flush();
	//automatically open the reports after execution
	}

}
