package TestCases.CM_Export.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNViewCell4G() throws Exception {

        parameters.view("4G", "PLMN", "Cell", true);
    }

    @Test
    public void PLMNViewSite4G() throws Exception {

        parameters.view("4G", "PLMN", "Site", true);
    }
}
