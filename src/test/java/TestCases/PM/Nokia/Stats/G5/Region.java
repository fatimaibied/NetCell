package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Hourly");
    }

    @Test
    public void RegionStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Hourly");
    }

    @Test
    public void RegionStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Daily");
    }
    @Test
    public void RegionStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Daily");
    }
    @Test
    public void RegionStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Weekly");
    }
    @Test
    public void RegionStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Weekly");
    }

    @Test
    public void RegionStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"Monthly");
    }
    @Test
    public void RegionStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Monthly");
    }
    @Test
    public void RegionStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"DailyBH");
    }
    @Test
    public void RegionStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"DailyBH");
    }

    @Test
    public void RegionStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"WeeklyBH");
    }
    @Test
    public void RegionStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"WeeklyBH");
    }

    @Test
    public void RegionStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", false,"MonthlyBH");
    }

    @Test
    public void RegionStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"MonthlyBH");
    }
    @Test
    public void RegionStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region", true,"Row");
    }
}
