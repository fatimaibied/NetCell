package TestCases.CM.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionXDDView4G() throws Exception {

        parameters.view("4G", "RegionXDD", "Cell","Hourly");
    }
}
