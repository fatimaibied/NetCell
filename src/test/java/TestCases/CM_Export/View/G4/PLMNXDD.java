package TestCases.CM_Export.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNXDDViewCell4G() throws Exception {

        parameters.view("4G", "PLMN XDD", "Cell", true);
    }
    @Test
    public void PLMNXDDViewSite4G() throws Exception {

        parameters.view("4G", "PLMN XDD", "Site", true);
    }
}
