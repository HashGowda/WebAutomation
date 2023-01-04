package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BasicExtentReport {

    //Basic Extent Report
    @Test
     public void extentTest() throws IOException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark= new ExtentSparkReporter("NewReport/Spark.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setReportName("Automation Report");
        spark.config().setDocumentTitle("Selenium Report");

        ExtentTest extentTest=extent.createTest("Login Test");
        ExtentTest test=extentTest.createNode("Login");
        test.pass("Login test started");
        test.info("Entered username");
        test.info("Password is entered");
        test.pass("Login test completed");

        ExtentTest test2=extentTest.createNode("Logout");
        test2.pass("Login test started");
        test2.info("Entered username");
        test2.info("Password is entered");
        test2.pass("Login test completed");

        ExtentTest test1=extent.createTest("Home page test").assignAuthor("Harish").assignCategory("Sanity").assignDevice("Firefox");
        test1.pass("Home page test started");
        test1.info("Navigated to homepage");
        test1.info("Validated homepage");
        test1.fail("Home page title failed");

        extent.flush();

        //To open report automatically by default browser
        Desktop.getDesktop().browse(new File("NewReport/Spark.html").toURI());
    }
}
