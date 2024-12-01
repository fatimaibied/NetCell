package TestCases.CM.Compare.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    CM compare= new CM();
    @Test
    public void CellCompare4G() throws Exception {

        compare.compare("4G", "Cell", "");
    }

}
