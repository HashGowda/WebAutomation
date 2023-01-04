package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

public class SampleExtentReport {

    @Test
    void generateReport(){
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark= new ExtentSparkReporter("NewReport/SampleReport.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("MyReports");
        spark.config().setReportName("Selenium Report");

        ExtentTest test= extent.createTest("FirstTest");
        ExtentTest node1=test.createNode("Node1");
        node1.info("Username is entering...");
        node1.info("Password is entering...");
        node1.info("Login Button is clicking...");

        ExtentTest node2=test.createNode("Node2");
        node2.info("Username is entered");
        node2.info("Password id entered");
        node2.info("Login Button is clicked");

        extent.flush();
    }
}
