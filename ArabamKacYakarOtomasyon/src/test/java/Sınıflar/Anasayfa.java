package Sınıflar;

import org.openqa.selenium.WebDriver;

public class Anasayfa extends Sayfa {

    public Anasayfa(WebDriver driver) {
        super(driver);
    }

    public final String kayıtButonu = "//div[@class='user-login-panel logged-in-user hidden-xs']/a[.='Kayıt Ol']";
}
