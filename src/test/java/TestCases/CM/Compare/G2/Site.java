package TestCases.CM.Compare.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Site extends MainClass {

    CM compare= new CM();
    @Test
    public void SiteCompare2G() throws Exception {

        compare.compare("2G", "Site", "");
    }

}
