package TestCases.CM.Parameter.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNXDDParameter4G() throws Exception {

        parameters.Parameter("4G", "PLMN XDD", "Last Week");
    }
}
