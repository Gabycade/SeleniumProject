import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//
public class ChromeTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org");
        driver.manage().window().maximize();
        driver.quit();
    }
}

// Just set up Jenkins dashboard CMD command C:\Users\Gabriel\Downloads>"C:\Users\Gabriel\.jdks\openjdk-25.0.2\bin\java.exe" -jar jenkins.war