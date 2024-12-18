package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void RegionCarrierStats3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Hourly", "All", false);
    }

    @Test
    public void RegionCarrierStatsAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Hourly", "All", false);
    }
    @Test
    public void RegionCarrierStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Daily", "All", false);
    }
    @Test
    public void RegionCarrierStatsDailyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Daily", "All", false);
    }
    @Test
    public void RegionCarrierStatsWeekly3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Weekly", "All", false);
    }
    @Test
    public void RegionCarrierStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Weekly", "All", false);
    }

    @Test
    public void RegionCarrierStatsMonthly3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Monthly", "All", false);
    }
    @Test
    public void RegionCarrierStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Monthly", "All", false);
    }
    @Test
    public void RegionCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"DailyBH", "All", false);
    }
    @Test
    public void RegionCarrierStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"DailyBH", "All", false);
    }

    @Test
    public void RegionCarrierStatsWeeklyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"WeeklyBH", "All", false);
    }
    @Test
    public void RegionCarrierStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"WeeklyBH", "All", false);
    }

    @Test
    public void RegionCarrierStatsMonthlyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"MonthlyBH", "All", false);
    }

    @Test
    public void RegionCarrierStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"MonthlyBH", "All", false);
    }

    @Test
    public void RegionCarrierStatsRowAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Raw", "All", false);
    }
    @Test
    public void RegionCarrierStatsRo3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Raw", "All", false);
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void RegionCarrierSearchForKPI3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Hourly", "PS_RAB_Establ_Att", false);
    }
}
