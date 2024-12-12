package TestCases.CM.Parameter.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Region extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionParameter3G() throws Exception {

        parameters.Parameter("3G", "Region", "LastWeek");
    }

    @Test
    public void RegionParameterWeekends3G() throws Exception {

        parameters.Parameter("3G", "Region", "Weekends");
    }

    @Test
    public void RegionParameterYesterday3G() throws Exception {

        parameters.Parameter("3G", "Region", "Yesterday");
    }

    @Test
    public void RegionParameterCustom3G() throws Exception {

        parameters.Parameter("3G", "Region", "Custom");
    }
}
