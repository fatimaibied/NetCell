package TestCases.PM.Nokia.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", false,"Hourly");
    }

    @Test
    public void RegionStatsAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", true,"Hourly");
    }

    @Test
    public void RegionStatsDaily2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", false,"Daily");
    }
    @Test
    public void RegionStatsDailyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", true,"Daily");
    }
    @Test
    public void RegionStatsWeekly2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", false,"Weekly");
    }
    @Test
    public void RegionStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", true,"Weekly");
    }

    @Test
    public void RegionStatsMonthly2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", false,"Monthly");
    }
    @Test
    public void RegionStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", true,"Monthly");
    }
    @Test
    public void RegionStatsDailyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", false,"DailyBH");
    }
    @Test
    public void RegionStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", true,"DailyBH");
    }

    @Test
    public void RegionStatsWeeklyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", false,"WeeklyBH");
    }
    @Test
    public void RegionStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", true,"WeeklyBH");
    }

    @Test
    public void RegionStatsMonthlyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", false,"MonthlyBH");
    }

    @Test
    public void RegionStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", true,"MonthlyBH");
    }
    @Test
    public void RegionStatsRawAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Region", true,"Raw");
    }
}
