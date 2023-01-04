package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomizeExtentReport {

    //Customize extent report
    @Test
    public void extentReport() throws IOException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark=new ExtentSparkReporter("NewReport/Spark3.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setReportName("Automation Report");
        spark.config().setDocumentTitle("Selenium Report");

        ExtentTest test= extent.createTest("Login Test").assignAuthor("Harish").assignCategory("Regression").assignDevice("Chrome");
        test.pass("Login test started");
        test.info("Entered username");
        test.info("Entered password");
        List<String> list= new ArrayList<String>();
        list.add("Apple");
        list.add("Ball");
        list.add("Camel");
        test.pass(MarkupHelper.createOrderedList(list));

        Map<String, String > map=new HashMap<>();
        map.put("Name","Harish");
        map.put("Place","Bengaluru");
        map.put("Gender","Male");
        test.pass(MarkupHelper.createOrderedList(map).getMarkup());
        test.pass("Login test completed");
        test.pass(MarkupHelper.createLabel("Login test completed", ExtentColor.GREEN));

        ExtentTest test1= extent.createTest("Home page title").assignAuthor("Harish").assignCategory("Sanity").assignDevice("Chrome");
        test1.pass("Home page test started");
        test1.info("Navigated to homepage");
        test1.info("Validated homepage");
        test1.fail("Home page test failed");
        test1.fail(MarkupHelper.createLabel("Home page test failed", ExtentColor.RED));

        extent.flush();

        //To open the report automatically by default browser
        Desktop.getDesktop().browse(new File("NewReport/Spark3.html").toURI());
    }
}
