package day38_MethodOverriding.browserTask;

public class BrowserObjects {
    public static void main(String[] args) {

        FireFox firefox = new FireFox();
        firefox.openBrowser();
        firefox.closeBrowser();


        Safari safari = new Safari();
        safari.openBrowser();
        safari.closeBrowser();

    }






}
