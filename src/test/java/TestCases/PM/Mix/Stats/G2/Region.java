package TestCases.PM.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"Hourly", "All", false);
    }

    @Test
    public void RegionStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"Hourly", "All", false);
    }

    @Test
    public void RegionStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"Daily", "All", false);
    }
    @Test
    public void RegionStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"Daily", "All", false);
    }
    @Test
    public void RegionStatsWeekly2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"Weekly", "All", false);
    }
    @Test
    public void RegionStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"Weekly", "All", false);
    }

    @Test
    public void RegionStatsMonthly2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"Monthly", "All", false);
    }
    @Test
    public void RegionStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"Monthly", "All", false);
    }
    @Test
    public void RegionStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"DailyBH", "All", false);
    }
    @Test
    public void RegionStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"DailyBH", "All", false);
    }

    @Test
    public void RegionStatsWeeklyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"WeeklyBH", "All", false);
    }
    @Test
    public void RegionStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"WeeklyBH", "All", false);
    }

    @Test
    public void RegionStatsMonthlyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Region", false,"MonthlyBH", "All", false);
    }

    @Test
    public void RegionStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Region", true,"MonthlyBH", "All", false);
    }
}
