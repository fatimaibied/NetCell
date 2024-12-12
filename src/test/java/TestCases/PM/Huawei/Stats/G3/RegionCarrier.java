package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void RegionCarrierStats3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Hourly");
    }

    @Test
    public void RegionCarrierStatsAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Hourly");
    }
    @Test
    public void RegionCarrierStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Daily");
    }
    @Test
    public void RegionCarrierStatsDailyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Daily");
    }
    @Test
    public void RegionCarrierStatsWeekly3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Weekly");
    }
    @Test
    public void RegionCarrierStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Weekly");
    }

    @Test
    public void RegionCarrierStatsMonthly3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Monthly");
    }
    @Test
    public void RegionCarrierStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Monthly");
    }
    @Test
    public void RegionCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"DailyBH");
    }
    @Test
    public void RegionCarrierStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"DailyBH");
    }

    @Test
    public void RegionCarrierStatsWeeklyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"WeeklyBH");
    }
    @Test
    public void RegionCarrierStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"WeeklyBH");
    }

    @Test
    public void RegionCarrierStatsMonthlyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"MonthlyBH");
    }

    @Test
    public void RegionCarrierStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"MonthlyBH");
    }

    @Test
    public void RegionCarrierStatsRowAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", true,"Raw");
    }
    @Test
    public void RegionCarrierStatsRo3G() throws Exception {

        State.Stats("Huawei", "3G", "Region Carrier", false,"Raw");
    }
}
