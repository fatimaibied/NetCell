package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats3G() throws Exception {

        State.Stats("3G", "Region", false,"Hourly");
    }

    @Test
    public void RegionStatsAggregation3G() throws Exception {

        State.Stats("3G", "Region", true,"Hourly");
    }

}
