package TestCases.PM_Export.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void RegionCarrierStats3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Hourly", "All", true);
    }

    @Test
    public void RegionCarrierStatsAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Hourly", "All", true);
    }
    @Test
    public void RegionCarrierStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Daily", "All", true);
    }
    @Test
    public void RegionCarrierStatsDailyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Daily", "All", true);
    }

    @Test
    public void RegionCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"DailyBH", "All", true);
    }
    @Test
    public void RegionCarrierStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"DailyBH", "All", true);
    }



    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void RegionCarrierSearchForKPI3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Hourly", "PS_RAB_Establ_Att", true);
    }
}
