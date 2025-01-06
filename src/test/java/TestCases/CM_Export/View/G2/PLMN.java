package TestCases.CM_Export.View.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNViewCell2G() throws Exception {

        parameters.view("2G", "PLMN", "Cell", true);
    }
    @Test
    public void PLMNViewSite2G() throws Exception {

        parameters.view("2G", "PLMN", "Site", true);
    }

}
