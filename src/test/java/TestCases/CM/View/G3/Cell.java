package TestCases.CM.View.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Cell extends MainClass {

    CM parameters= new CM();

    @Test
    public void CellViewCell4G() throws Exception {

        parameters.view("3G", "Cell", "Cell");
    }
    @Test
    public void CellViewSite4G() throws Exception {

        parameters.view("3G", "Cell", "Site");
    }
}
