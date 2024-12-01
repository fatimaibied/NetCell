package TestCases.CM.Compare.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class RNC extends MainClass {
    CM compare= new CM();


    //-------Monitoring Target Type  : Cell -------------------------------------
    @Test
    public void RNCCompareCell3G() throws Exception {

        compare.compare("3G", "RNC", "Cell");
    }
//-------Monitoring Target Type  : Site -------------------------------------
    @Test
    public void RNCCompareSite3G() throws Exception {

        compare.compare("3G", "RNC", "Site");
    }
}
