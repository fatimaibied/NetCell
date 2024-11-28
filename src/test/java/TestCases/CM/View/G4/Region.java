package TestCases.CM.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Region extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionViewCell4G() throws Exception {

        parameters.view("4G", "Region", "Cell","Hourly");
    }

    @Test
    public void RegionViewSite4G() throws Exception {

        parameters.view("4G", "Region", "Site","Hourly");
    }
}
