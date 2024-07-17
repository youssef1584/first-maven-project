package selenium.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath { public static void main (String args[]){

    WebDriver driver = new ChromeDriver();
    driver.get("https://retail.tekschool-students.com/");
    driver.manage().window().maximize();


        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://retail.tekschool-students.com/");
            driver.manage().window().maximize();

            driver.findElement(By.xpath("//p[text()='Video Games']")).click();
            driver.findElement(By.xpath("//p[text()='PlayStation 5 Console']")).click();
            driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();

        }



}
}
