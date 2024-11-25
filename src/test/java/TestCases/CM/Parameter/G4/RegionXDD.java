package TestCases.CM.Parameter.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionXDDParameter4G() throws Exception {

        parameters.Parameter("4G", "Region XDD", "Last Week");
    }
}
