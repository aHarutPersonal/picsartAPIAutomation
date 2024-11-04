import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {

    @BeforeSuite
    @Parameters({"url"})
    public void setup(String url) {
        RestAssured.baseURI = url;
    }
}
