package TestCases.CM.View.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Region extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionView4G() throws Exception {

        parameters.view("4G", "Region", "Cell","Hourly");
    }
}