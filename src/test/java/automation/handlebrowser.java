package automation;
import org.openqa.selenium.chrome.ChromeDriver;
public class handlebrowser {
    public static void main (String [] args){

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        chromeDriver.manage().window().maximize();
        String title = chromeDriver.getTitle();
        System.out.print(title);
        chromeDriver.get("https://www.amazon.com/");
        chromeDriver.quit();




    }
}
