package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Hourly", "All");
    }

    @Test
    public void RegionStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Hourly", "All");
    }

    @Test
    public void RegionStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Daily", "All");
    }
    @Test
    public void RegionStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Daily", "All");
    }
    @Test
    public void RegionStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Weekly", "All");
    }
    @Test
    public void RegionStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Weekly", "All");
    }

    @Test
    public void RegionStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Monthly", "All");
    }
    @Test
    public void RegionStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Monthly", "All");
    }
    @Test
    public void RegionStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"DailyBH", "All");
    }
    @Test
    public void RegionStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"DailyBH", "All");
    }

    @Test
    public void RegionStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"WeeklyBH", "All");
    }
    @Test
    public void RegionStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"WeeklyBH", "All");
    }

    @Test
    public void RegionStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"MonthlyBH", "All");
    }

    @Test
    public void RegionStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"MonthlyBH", "All");
    }
    @Test
    public void RegionStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Row", "All");
    }
}
