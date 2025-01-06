package TestCases.CM.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionXDDViewCell4G() throws Exception {

        parameters.view("4G", "Region XDD", "Cell", false);
    }
    @Test
    public void RegionXDDViewSite4G() throws Exception {

        parameters.view("4G", "Region XDD", "Site", false);
    }
}
