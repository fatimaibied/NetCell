package TestCases.CM_Export.View.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Site extends MainClass {

    CM parameters= new CM();

    @Test
    public void SiteViewCell2G() throws Exception {

        parameters.view("2G", "Site", "Cell", true);
    }

    @Test
    public void SiteViewSite2G() throws Exception {

        parameters.view("2G", "Site", "Site", true);
    }
}
