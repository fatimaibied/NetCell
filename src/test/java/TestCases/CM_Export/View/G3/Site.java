package TestCases.CM_Export.View.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Site extends MainClass {

    CM parameters= new CM();

    @Test
    public void SiteViewCell4G() throws Exception {

        parameters.view("3G", "Site", "Cell", true);
    }

    @Test
    public void SiteViewSite4G() throws Exception {

        parameters.view("3G", "Site", "Site", true);
    }
}
