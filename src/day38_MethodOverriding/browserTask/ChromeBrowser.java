package day38_MethodOverriding.browserTask;

public class ChromeBrowser extends Browser{

    public ChromeBrowser() {
        super();
    }

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("opening chrome browser");
    }
}
