import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsWithlog2 {

	public static void main(String[] args) {
	ExtentReports reports=new ExtentReports();
	ExtentSparkReporter sparkReports=new ExtentSparkReporter("./spark.html");
	reports.attachReporter(sparkReports);
	ExtentTest test=reports.createTest("Test 1");
	test.log(Status.PASS, "Passed report")
	.log(Status.INFO, "test 1 info")
	.log(Status.WARNING, "Further may fail but the status will be pass")
	.log(Status.FAIL, "Failes test 1")
	.log(Status.SKIP, "At last skipped");
	reports.flush();
	}

}
