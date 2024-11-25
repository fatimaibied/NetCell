package TestCases.CM.Parameter.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Region extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionParameter4G() throws Exception {

        parameters.Parameter("4G", "Region", "Last Week");
    }
}
