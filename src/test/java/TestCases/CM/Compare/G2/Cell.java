package TestCases.CM.Compare.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    CM compare= new CM();
    @Test
    public void CellCompare2G() throws Exception {

        compare.compare("2G", "Cell", "");
    }

}
