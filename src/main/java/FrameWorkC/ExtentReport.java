package FrameWorkC;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class ExtentReport  extends BaseClass {

    @Test
    void generateReport() throws IOException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("ORMReport/Report.html");
        extent.attachReporter(spark);
        spark.config().setReportName("ORM Login Report");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("My Reports");

        ExtentTest test = extent.createTest("LoginTest");
        ExtentTest login = test.createNode("Login");
        login.pass("Login test started");
        login.info("Username is entering...");
        login.info("Password is entering...");
        login.info("Login button is clicking...");
        login.pass("Login is completed");

        ExtentTest admin = test.createNode("Admin Tab");
        admin.pass("Admin tab clicking started");
        admin.info("Navigated to admin tab");

        ExtentTest testAdmin = extent.createTest("Admin page test").assignAuthor("Harish").assignCategory("Sanity").assignDevice("Chrome");
        testAdmin.pass("Entering the details");
        testAdmin.info("Searching a particular users");
        testAdmin.info("Search completed");
        testAdmin.fail("No records found");

        extent.flush();

        //To open the report automatically by default browser
        Desktop.getDesktop().browse(new File("ORMReport/Report.html").toURI());
    }
}
