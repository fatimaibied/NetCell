package TestCases.CM.Parameter.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    CM parameters= new CM();

    @Test
    public void CellParameter4G() throws Exception {

        parameters.Parameter("4G", "Cell", "Last Week");
    }
    @Test
    public void CellParameter4G2() throws Exception {

        parameters.Parameter("4G", "Cell", "Last Week");
    }
}
