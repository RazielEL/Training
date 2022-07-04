package Utils;

import Pages.AlterNetPage;
import Pages.GooglePage;
import Pages.SelectorHubPagePage;

public class PageInitializers {

    public static SelectorHubPagePage selectorHubPage;
    public static GooglePage google;
    public static AlterNetPage alterNetPage;



    public static void initializePageObjects(){
        selectorHubPage = new SelectorHubPagePage();
        google = new GooglePage();
        alterNetPage = new AlterNetPage();
    }

}
