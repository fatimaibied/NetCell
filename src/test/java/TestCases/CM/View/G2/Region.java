package TestCases.CM.View.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Region extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionViewCell2G() throws Exception {

        parameters.view("2G", "Region", "Cell");
    }

    @Test
    public void RegionViewSite2G() throws Exception {

        parameters.view("2G", "Region", "Site");
    }
}
