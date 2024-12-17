package TestCases.PM.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"Hourly", "All");
    }

    @Test
    public void RegionStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"Hourly", "All");
    }

    @Test
    public void RegionStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"Daily", "All");
    }
    @Test
    public void RegionStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"Daily", "All");
    }
    @Test
    public void RegionStatsWeekly2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"Weekly", "All");
    }
    @Test
    public void RegionStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"Weekly", "All");
    }

    @Test
    public void RegionStatsMonthly2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"Monthly", "All");
    }
    @Test
    public void RegionStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"Monthly", "All");
    }
    @Test
    public void RegionStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"DailyBH", "All");
    }
    @Test
    public void RegionStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"DailyBH", "All");
    }

    @Test
    public void RegionStatsWeeklyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"WeeklyBH", "All");
    }
    @Test
    public void RegionStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"WeeklyBH", "All");
    }

    @Test
    public void RegionStatsMonthlyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"MonthlyBH", "All");
    }

    @Test
    public void RegionStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"MonthlyBH", "All");
    }
}
