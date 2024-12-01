package TestCases.CM.Compare.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Site extends MainClass {

    CM compare= new CM();
    @Test
    public void SiteCompare4G() throws Exception {

        compare.compare("4G", "Site", "");
    }

}
