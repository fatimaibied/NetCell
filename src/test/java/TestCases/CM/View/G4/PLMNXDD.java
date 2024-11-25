package TestCases.CM.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNXDDView4G() throws Exception {

        parameters.view("4G", "PLMNXDD", "Cell","Hourly");
    }
}
