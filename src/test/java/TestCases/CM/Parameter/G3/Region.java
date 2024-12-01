package TestCases.CM.Parameter.G3;

import Main.CM;
import Main.MainClass;
import org.testng.annotations.Test;

public class Region extends MainClass {

    CM parameters= new CM();

    @Test
    public void RegionParameter4G() throws Exception {

        parameters.Parameter("4G", "Region", "Last Week");
    }

    @Test
    public void RegionParameterWeekends4G() throws Exception {

        parameters.Parameter("4G", "Region", "Weekends");
    }

    @Test
    public void RegionParameterYesterday4G() throws Exception {

        parameters.Parameter("4G", "Region", "Yesterday");
    }

    @Test
    public void RegionParameterCustom4G() throws Exception {

        parameters.Parameter("4G", "Region", "Custom");
    }
}
