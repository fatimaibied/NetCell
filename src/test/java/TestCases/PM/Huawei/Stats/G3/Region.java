package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"Hourly", "All");
    }

    @Test
    public void RegionStatsAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", true,"Hourly", "All");
    }
    @Test
    public void RegionStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"Daily", "All");
    }
    @Test
    public void RegionStatsDailyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", true,"Daily", "All");
    }
    @Test
    public void RegionStatsWeekly3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"Weekly", "All");
    }
    @Test
    public void RegionStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", true,"Weekly", "All");
    }

    @Test
    public void RegionStatsMonthly3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"Monthly", "All");
    }
    @Test
    public void RegionStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", true,"Monthly", "All");
    }
    @Test
    public void RegionStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"DailyBH", "All");
    }
    @Test
    public void RegionStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", true,"DailyBH", "All");
    }

    @Test
    public void RegionStatsWeeklyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"WeeklyBH", "All");
    }
    @Test
    public void RegionStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", true,"WeeklyBH", "All");
    }

    @Test
    public void RegionStatsMonthlyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"MonthlyBH", "All");
    }

    @Test
    public void RegionStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", true,"MonthlyBH", "All");
    }

    @Test
    public void RegionStatsRowAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", true,"Raw", "All");
    }
    @Test
    public void RegionStatsRow3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"Raw", "All");
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void RegionSearchForKPI3G() throws Exception {

        State.Stats("Huawei", "3G", "Region", false,"Hourly", "Total_AMR_Cell_Erlang_Hours");
    }
}
