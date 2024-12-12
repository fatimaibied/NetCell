package TestCases.CM.Parameter.G2;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Region extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionParameter2G() throws Exception {

        parameters.Parameter("2G", "Region", "LastWeek");
    }

    @Test
    public void RegionParameterWeekends2G() throws Exception {

        parameters.Parameter("2G", "Region", "Weekends");
    }

    @Test
    public void RegionParameterYesterday2G() throws Exception {

        parameters.Parameter("2G", "Region", "Yesterday");
    }

    @Test
    public void RegionParameterCustom2G() throws Exception {

        parameters.Parameter("2G", "Region", "Custom");
    }
}
