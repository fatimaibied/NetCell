package TestCases.CM.Compare.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Site extends MainClass {

    CM compare= new CM();
    @Test
    public void SiteCompare3G() throws Exception {

        compare.compare("3G", "Site", "");
    }

}
