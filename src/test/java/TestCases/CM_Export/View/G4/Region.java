package TestCases.CM_Export.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Region extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionViewCell4G() throws Exception {

        parameters.view("4G", "Region", "Cell", true);
    }

    @Test
    public void RegionViewSite4G() throws Exception {

        parameters.view("4G", "Region", "Site", true);
    }
}
