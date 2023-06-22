package Testler;

import Sınıflar.Anasayfa;
import Sınıflar.MailSayfası;
import Sınıflar.Sayfa;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTeest {
    WebDriver driver;
    private Sayfa sayfa;
    private Anasayfa anasayfa;
    private MailSayfası mailSayfası;

    @BeforeTest
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        sayfa = new Sayfa(driver);
        anasayfa = new Anasayfa(driver);
        mailSayfası = new MailSayfası(driver);

    }

    @Test void Login() throws InterruptedException {

        driver.get("http://arabamkacyakar.com/");

        sayfa.beklemeSuresıxphat(anasayfa.kayıtButonu);
        sayfa.tuslamaxphat(anasayfa.kayıtButonu);

        sayfa.beklemeSuresı(mailSayfası.Mail);
        sayfa.tuslama(mailSayfası.Mail);
        sayfa.alanaYazıYaz(mailSayfası.Mail, "kamilugrl28@gmail.com");


        sayfa.tuslama(mailSayfası.KullanıcıAdı);
        sayfa.alanaYazıYaz(mailSayfası.KullanıcıAdı, "kamilugrl");


        sayfa.tuslama(mailSayfası.Sifre);
        sayfa.alanaYazıYaz(mailSayfası.Sifre, "249048");


        sayfa.tuslama(mailSayfası.SifreTekrar);
        sayfa.alanaYazıYaz(mailSayfası.SifreTekrar, "249048");

        sayfa.sayfaKaydır();

        sayfa.tuslama(mailSayfası.YasadıgınSehir);
        sayfa.tuslamacss(mailSayfası.İstanbul);

        sayfa.beklemeSuresıcss(mailSayfası.Yasadıgınızİlce);
        sayfa.tuslamacss(mailSayfası.Yasadıgınızİlce);

        sayfa.beklemeSuresıcss(mailSayfası.yasadıgınilcegir);
        sayfa.tuslamacss(mailSayfası.yasadıgınilcegir);

        sayfa.tuslamacss(mailSayfası.FavoriYakit);
        sayfa.tuslamacss(mailSayfası.YakıtGir);
        sayfa.tuslamacss(mailSayfası.AylıkMasraf);
        sayfa.tuslamacss(mailSayfası.MasrafTutar);

        sayfa.sayfaKaydır();

        sayfa.tuslamacss(mailSayfası.KendiAracım);
        sayfa.tuslamacss(mailSayfası.KendiMarkam);

        sayfa.beklemeSuresıcss(mailSayfası.Model);
        sayfa.tuslamacss(mailSayfası.Model);
        sayfa.beklemeSuresıcss(mailSayfası.Bentagya);
        sayfa.tuslamacss(mailSayfası.Bentagya);

        sayfa.beklemeSuresıcss(mailSayfası.KasaTipi);
        sayfa.tuslamacss(mailSayfası.KasaTipi);
        sayfa.tuslamacss(mailSayfası.KataTipiSecimi);

        sayfa.beklemeSuresıcss(mailSayfası.MotorTipi);
        sayfa.tuslamacss(mailSayfası.MotorTipi);
        sayfa.tuslamacss(mailSayfası.MotorTipiSecimi);

        sayfa.beklemeSuresıcss(mailSayfası.BMgucu);
        sayfa.tuslamacss(mailSayfası.BMgucu);
        sayfa.tuslamacss(mailSayfası.Dizel);

        sayfa.beklemeSuresıcss(mailSayfası.Hayır);
        sayfa.tuslamacss(mailSayfası.Hayır);
        sayfa.tuslamacss(mailSayfası.KayıtOlButonu);

        sayfa.sayfaKaydır();

        sayfa.bekleme();
        sayfa.Kayıthata();







    }
}
