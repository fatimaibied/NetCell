package TestCases.CM.Parameter.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Site extends MainClass {

    CM parameters= new CM();

    @Test
    public void SiteParameter4G() throws Exception {

        parameters.Parameter("4G", "Site", "Last Week");
    }
}
