package TestCases.CM.Parameter.G4;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionXDDParameter4G() throws Exception {

        parameters.Parameter("4G", "Region XDD", "LastWeek");
    }

    @Test
    public void RegionXDDParameterWeekends4G() throws Exception {

        parameters.Parameter("4G", "Region XDD", "Weekends");
    }

    @Test
    public void RegionXDDParameterYesterday4G() throws Exception {

        parameters.Parameter("4G", "Region XDD", "Yesterday");
    }

    @Test
    public void RegionXDDParameterCustom4G() throws Exception {

        parameters.Parameter("4G", "Region XDD", "Custom");
    }
}
