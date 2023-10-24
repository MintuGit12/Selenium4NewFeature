import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportWithLog {

	public static void main(String[] args) {
		ExtentReports extentReports=new ExtentReports();
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("./spark.html");
		extentReports.attachReporter(sparkReporter);
		ExtentTest test1=extentReports.createTest("Test 1");
		test1.pass("passed 1");
		extentReports.createTest("Test 2").log(Status.FAIL, "Failure of 2");
		extentReports.createTest("Test 3").log(Status.SKIP, "previos is failed so skip");
		extentReports.flush();

	}

}
