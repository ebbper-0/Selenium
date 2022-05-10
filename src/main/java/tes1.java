import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tes1 {
    public static void main(String[] args){
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("ebbper-0@student.ltu.se");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }
}