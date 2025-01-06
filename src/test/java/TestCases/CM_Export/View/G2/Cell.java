package TestCases.CM_Export.View.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    CM parameters= new CM();

    @Test
    public void CellViewCell2G() throws Exception {

        parameters.view("2G", "Cell", "Cell", true);
    }
    @Test
    public void CellViewSite2G() throws Exception {

        parameters.view("2G", "Cell", "Site", true);
    }
}
