package TestCases.CM.Compare.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    CM compare= new CM();
    @Test
    public void CellCompare3G() throws Exception {

        compare.compare("3G", "Cell", "");
    }

}
