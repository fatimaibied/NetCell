package TestCases.CM.Parameter.G4;

import Main.MainClass;
import Main.CM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNParameter4G() throws Exception {

        parameters.Parameter("4G", "PLMN", "Last Week");
    }
}
