package TestCases.CM.View.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Region extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionViewCell4G() throws Exception {

        parameters.view("3G", "Region", "Cell");
    }

    @Test
    public void RegionViewSite4G() throws Exception {

        parameters.view("3G", "Region", "Site");
    }
}
