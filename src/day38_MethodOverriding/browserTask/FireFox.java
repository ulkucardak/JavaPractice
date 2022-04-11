package day38_MethodOverriding.browserTask;

public class FireFox extends Browser{

    public FireFox() {
        super();
    }

    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing firefox browser");
    }
}
