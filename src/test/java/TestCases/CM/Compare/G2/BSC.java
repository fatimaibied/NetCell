package TestCases.CM.Compare.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class BSC extends MainClass {
    CM compare= new CM();


    //-------Monitoring Target Type  : Cell -------------------------------------
    @Test
    public void BSCCompareCell2G() throws Exception {

        compare.compare("2G", "BSC", "Cell");
    }
//-------Monitoring Target Type  : Site -------------------------------------
    @Test
    public void BSCCompareSite2G() throws Exception {

        compare.compare("2G", "BSC", "Site");
    }
}
