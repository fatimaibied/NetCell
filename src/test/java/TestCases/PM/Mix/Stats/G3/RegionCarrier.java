package TestCases.PM.Mix.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void RegionCarrierStats3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", false,"Hourly", "All");
    }

    @Test
    public void RegionCarrierStatsAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", true,"Hourly", "All");
    }
    @Test
    public void RegionCarrierStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", false,"Daily", "All");
    }
    @Test
    public void RegionCarrierStatsDailyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", true,"Daily", "All");
    }
    @Test
    public void RegionCarrierStatsWeekly3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", false,"Weekly", "All");
    }
    @Test
    public void RegionCarrierStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", true,"Weekly", "All");
    }

    @Test
    public void RegionCarrierStatsMonthly3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", false,"Monthly", "All");
    }
    @Test
    public void RegionCarrierStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", true,"Monthly", "All");
    }
    @Test
    public void RegionCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", false,"DailyBH", "All");
    }
    @Test
    public void RegionCarrierStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", true,"DailyBH", "All");
    }

    @Test
    public void RegionCarrierStatsWeeklyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", false,"WeeklyBH", "All");
    }
    @Test
    public void RegionCarrierStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", true,"WeeklyBH", "All");
    }

    @Test
    public void RegionCarrierStatsMonthlyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", false,"MonthlyBH", "All");
    }

    @Test
    public void RegionCarrierStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", true,"MonthlyBH", "All");
    }

    @Test
    public void RegionCarrierStatsRowAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", true,"Raw", "All");
    }
    @Test
    public void RegionCarrierStatsRo3G() throws Exception {

        State.Stats("Mix", "3G", "Region Carrier", false,"Raw", "All");
    }
}
