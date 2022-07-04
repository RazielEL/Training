package Steps;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

 public class Hooks extends CommonMethods {

    @Before
    public void start(){
        openBrowserAndLanuchApplication();
    }


    @After
    public void end (Scenario scenario){
        byte[] pic;
        if (scenario.isFailed()){
            pic = takeScreenShot("failed/" + scenario.getName());
        } else {
            pic = takeScreenShot("succes/" + scenario.getName());
        }

        scenario.attach(pic, "image/png", scenario.getName());

        System.out.println("Browser will be closed");
        tearDown();
    }

}
