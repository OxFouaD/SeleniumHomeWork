package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement createNewAcc=driver.findElement(By.linkText("Create new account"));
        createNewAcc.click();

        Thread.sleep(2000);

        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Fouad");

        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("Aslloun");

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("fouad.asllountest@gmail.com");

        WebElement reEnterEmail=driver.findElement(By.name("reg_email_confirmation__"));
        reEnterEmail.sendKeys("fouad.asllountest@gmail.com");

        WebElement passWord=driver.findElement(By.id("password_step_input"));
        passWord.sendKeys("TestTest2024");
    }
}
