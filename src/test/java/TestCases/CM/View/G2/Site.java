package TestCases.CM.View.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Site extends MainClass {

    CM parameters= new CM();

    @Test
    public void SiteViewCell2G() throws Exception {

        parameters.view("2G", "Site", "Cell", false);
    }

    @Test
    public void SiteViewSite2G() throws Exception {

        parameters.view("2G", "Site", "Site", false);
    }
}
