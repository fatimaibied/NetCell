package TestCases.CM_Export.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    CM parameters= new CM();

    @Test
    public void CellViewCell4G() throws Exception {

        parameters.view("4G", "Cell", "Cell", true);
    }

    @Test
    public void CellViewSite4G() throws Exception {

        parameters.view("4G", "Cell", "Site", true);
    }
}
