package TestCases.CM.View.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    CM parameters= new CM();

    @Test
    public void PLMNViewCell4G() throws Exception {

        parameters.view("3G", "PLMN", "Cell");
    }

    @Test
    public void PLMNViewSite4G() throws Exception {

        parameters.view("3G", "PLMN", "Site");
    }
}
