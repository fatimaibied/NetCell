package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void RegionCarrierStats3G() throws Exception {

        State.Stats("3G", "Region Carrier", false,"Hourly");
    }

    @Test
    public void RegionCarrierStatsAggregation3G() throws Exception {

        State.Stats("3G", "Region Carrier", true,"Hourly");
    }

}
