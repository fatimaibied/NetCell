package TestCases.CM.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    CM parameters= new CM();

    @Test
    public void CellView4G() throws Exception {

        parameters.view("4G", "Cell", "Cell","Hourly");
    }
}
