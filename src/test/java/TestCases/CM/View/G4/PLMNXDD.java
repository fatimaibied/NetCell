package TestCases.CM.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNXDDViewCell4G() throws Exception {

        parameters.view("4G", "PLMNXDD", "Cell","Hourly");
    }
    @Test
    public void PLMNXDDViewSite4G() throws Exception {

        parameters.view("4G", "PLMNXDD", "Site","Hourly");
    }
}
