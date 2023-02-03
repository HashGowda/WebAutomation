package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PrintingJson {

    //Printing json
    @Test
    public void extentReport() throws IOException {
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark= new ExtentSparkReporter("NewReport/Spark2.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.DARK);
        spark.config().setReportName("Automation Report");
        spark.config().setDocumentTitle("Selenium Report");

        ExtentTest test= extent.createTest("Login Test").assignAuthor("Harish").assignCategory("Smoke").assignDevice("Chrome");
        test.pass("Login test started");
        test.info("Entered username");
        test.info("Entered password");
        test.pass("Login test completed");

        String json= "{\n" +
                "  \"theme\": \"STANDARD\",\n" +
                "  \"encoding\": \"utf-8\",\n" +
                "  \"protocol\": \"HTTPS\",\n" +
                "  \"timelineEnabled\": false,\n" +
                "  \"offlineMode\": true,\n" +
                "  \"thumbnailForBase64\": false,\n" +
                "  \"documentTitle\": \"ExtentReports\",\n" +
                "  \"reportName\": \"ExtentReports\",\n" +
                "  \"timeStampFormat\": \"MMM dd, yyyy HH:mm:ss a\",\n" +
                "  \"js\": \"\",\n" +
                "  \"css\": \"\"\n" +
                "}";
        test.info(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));
        String xml= " <dependency>\n" +
                "            <groupId>org.seleniumhq.selenium</groupId>\n" +
                "            <artifactId>selenium-java</artifactId>\n" +
                "            <version>3.141.59</version>\n" +
                "        </dependency>";
        test.info(MarkupHelper.createCodeBlock(xml, CodeLanguage.XML));
        extent.flush();

        //To open the report automatically by default browser
        Desktop.getDesktop().browse(new File("NewReport/Spark2.html").toURI());
    }
}
