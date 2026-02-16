import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

@Listeners(TestListener.class)
public class TestSuite1 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void bbtest() {
        tg.openBrowser();
        tg.click("ele_DealoftheDaylink27102831994258", 1);
        tg.wait("ele_Addtocart120102953278507", ComparisonType.IS_VISIBLE);
        tg.click("ele_Addtocart120102953278507", 1);
        tg.click("ele_Cart31103439573326", 1);
        tg.close();
    }
}
