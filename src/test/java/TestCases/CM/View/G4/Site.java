package TestCases.CM.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Site extends MainClass {

    CM parameters= new CM();

    @Test
    public void SiteView4G() throws Exception {

        parameters.view("4G", "Site", "Cell","Hourly");
    }
}
