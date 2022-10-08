package com.nirajgurjar.LightningVPN.Helper;

import com.anchorfree.partner.api.data.Country;
import com.anjlab.android.iab.v3.BillingProcessor;

import java.util.Arrays;
import java.util.List;

public class Config {

    //Don't change
    //hydra SKD keys
    public static int countStart = 0;


    public static final String appSecretCode = "854df6289er6787sdf58sdr5wer6897sr587asdf858"; //Please contact me in what's app: +8801792064472

    public static final String carrierID = "Cod_lightningvpn2";//Please contact me in what's app: +8801792064472
    public static final String baseURL = "https://backend.northghost.com/";

    //LICENSE KEY FROM GOOGLE PLAY CONSOLE
    public static final String lisence_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApKYXEYdjy7AJcq33lkeNTwxDY+ul1w9xuyYDYxvRok2b+KNhSJAP3a1hmlGqOlnGYgYxoylkhkMPhk114FQbO5hCl1YO7/M678DqprNTfDPUQn+/CiXNlmSvk4knqh+YL8eg5h78jKeg+u0D7tsbSB1z40i22yfYldCeqNH1GqPFTTnW7v4vzAs8lTdBpYr+4BwfAmeTLcYwuqiHMWuuEnyMoBaUFgMXKc5RM1ELCDWfSEp7n+kbV8v9PyEciDjCSopYquj0TSlRda+Tu6DcBhcsCRQjfZ+w7gb1dRLEaE7mdm48InTYmubQU2Em7VAVflli1sl7/fyfSB8Z/G5zjQIDAQAB";

    //Remove Ads subscription id
    public static final String remove_ads_one_month = "remove_ads_one_month";
    public static final String remove_ads_six_month = "remove_ads_six_month";
    public static final String remove_ads_one_year = "remove_ads_one_year";

    //country list

    public static List<Country> regions =  Arrays.asList(
            new Country("ca"),
            new Country("us"),
            new Country("gb"),
            new Country("sg"),
            new Country("in"),
            new Country("id"),
            new Country("de"),
            new Country("no"),
            new Country("hk"),
            new Country("ru"),
            new Country("jp"),
            new Country("dk"),
            new Country("ua"),
            new Country("fr"),
            new Country("br"),
            new Country("se"),
            new Country("ie"),
            new Country("ch"),
            new Country("it"),
            new Country("mx"),
            new Country("es"),
            new Country("ar"),
            new Country("au"),
            new Country("cz"),
            new Country("ro"),
            new Country("tr"),
            new Country("nl")
    );



    /*settings parameters (don't change them these are auto controlled by application flow)*/
    public static boolean ads_subscription = false;

    /*google IAP*/
    public static BillingProcessor bp;
    public static boolean isBPavailable = false;
}
