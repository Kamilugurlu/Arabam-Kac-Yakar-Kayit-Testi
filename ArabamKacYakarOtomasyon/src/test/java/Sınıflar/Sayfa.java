package Sınıflar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {
    private final WebDriver driver;

    public Sayfa(WebDriver driver) {

        this.driver = driver;
    }


    public void tuslama(String elemendId){
        driver.findElement(By.id(elemendId)).click();
    }

        public void tuslamacss(String elemendId) {
            driver.findElement(By.cssSelector(elemendId)).click();
        }
    public void tuslamaname(String elemendId) {
        driver.findElement(By.name(elemendId)).click();
    }
    public void tuslamaxphat(String elemendId) {
        driver.findElement(By.xpath(elemendId)).click();
    }
    public void beklemeSuresı(String elemendıd){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elemendıd)));
    }
    public void beklemeSuresıcss(String elemendıd){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elemendıd)));
    }
    public void beklemeSuresıxphat(String elemendıd){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elemendıd)));
    }
    public void beklemeSuresıname(String elemendıd){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name(elemendıd)));
    }
    public void alanaYazıYazcc(String elemendId, String yazıId){
        driver.findElement(By.cssSelector(elemendId)).sendKeys(yazıId);
    }
    public void alanaYazıYaz(String elemendId, String yazıId){
        driver.findElement(By.id(elemendId)).sendKeys(yazıId);
    }
    public void alanaYazıYazname(String elemendId, String yazıId){
        driver.findElement(By.name(elemendId)).sendKeys(yazıId);
    }

    public void bekleme() throws InterruptedException {
        Thread.sleep(2000);
    }

    public void Kayıthata(){
        WebElement element = driver.findElement(By.cssSelector("#register_message > div"));
        if (element.isDisplayed()) {
            System.out.println("Kayıt olurken site hata veriyor.");
        } else {
            System.out.println("Kayıt olurken site başarılı");
        }
    }

    public void sayfaKaydır(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400);");
    }

}
