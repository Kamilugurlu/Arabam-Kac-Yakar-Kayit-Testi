package Sınıflar;

import org.openqa.selenium.WebDriver;

public class MailSayfası extends Sayfa{
    public MailSayfası(WebDriver driver) {
        super(driver);
    }

    public final String Mail = "email";
    public final String KullanıcıAdı = "username";
    public final String Sifre = "password";
    public final String SifreTekrar = "repassword";

    public final String YasadıgınSehir = "yasadiginizsehir";

    public final String İstanbul = "#yasadiginizsehir > [value='34']";

    public final String Yasadıgınızİlce = "#mytown > select";
    public final String yasadıgınilcegir = "[value='423']";
    public final String FavoriYakit = "div:nth-child(7) > div > select";

    public final String YakıtGir = "div:nth-child(7) > div > select > option:nth-child(4)";
    public final String AylıkMasraf= "div:nth-child(8) > div > select";
    public final String MasrafTutar= "div:nth-child(8) > div > select > option:nth-child(3)";

    public final String KendiAracım = "div:nth-child(9) > div > select";
    public final String KendiMarkam= "div:nth-child(9) > div > select > option:nth-child(5)";
    public final String Model = "#login_seriallist > select";
    public final String Bentagya = "#login_seriallist > select > option:nth-child(2)";
    public final String KasaTipi = "#login_safelist > select";
    public final String KataTipiSecimi ="#login_safelist > select > option:nth-child(2)";
    public final String MotorTipi = "#login_typelist > select";
    public final String MotorTipiSecimi = "#login_typelist > select > option:nth-child(2)";
    public final String BMgucu= "#login_modellist > select";
    public final String Dizel ="#login_modellist > select > option:nth-child(3)";

    public final String Hayır = "div:nth-child(11) > div > label:nth-child(4) > input[type=radio]";

    public final String KayıtOlButonu= "#formsubmit";


}
