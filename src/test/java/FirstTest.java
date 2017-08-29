import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by User on 27.08.2017.
 */


public class FirstTest {
    @BeforeTest
    public void setSettings() {
        baseURI = "https://www.metaweather.com";
    }

    @Test
    public void checkCode() {
        get("/api/location/search/?query=san").then().statusCode(equalTo(200));
    }

}
