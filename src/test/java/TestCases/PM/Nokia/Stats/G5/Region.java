package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Hourly", "All", false);
    }

    @Test
    public void RegionStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Hourly", "All", false);
    }

    @Test
    public void RegionStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Daily", "All", false);
    }
    @Test
    public void RegionStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Daily", "All", false);
    }
    @Test
    public void RegionStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Weekly", "All", false);
    }
    @Test
    public void RegionStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Weekly", "All", false);
    }

    @Test
    public void RegionStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Monthly", "All", false);
    }
    @Test
    public void RegionStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Monthly", "All", false);
    }
    @Test
    public void RegionStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"DailyBH", "All", false);
    }
    @Test
    public void RegionStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"DailyBH", "All", false);
    }

    @Test
    public void RegionStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"WeeklyBH", "All", false);
    }
    @Test
    public void RegionStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"WeeklyBH", "All", false);
    }

    @Test
    public void RegionStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"MonthlyBH", "All", false);
    }

    @Test
    public void RegionStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"MonthlyBH", "All", false);
    }
    @Test
    public void RegionStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Row", "All", false);
    }
}
