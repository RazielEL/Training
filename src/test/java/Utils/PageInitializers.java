package Utils;

import Pages.AlterNetPage;
import Pages.GooglePage;
import Pages.IkeaPage;
import Pages.SelectorHubPage;

public class PageInitializers {

    public static SelectorHubPage selectorHubPage;
    public static GooglePage google;
    public static AlterNetPage alterNetPage;
    public static IkeaPage ikeaPage;



    public static void initializePageObjects(){
        selectorHubPage = new SelectorHubPage();
        google = new GooglePage();
        alterNetPage = new AlterNetPage();
        ikeaPage = new IkeaPage();
    }

}
