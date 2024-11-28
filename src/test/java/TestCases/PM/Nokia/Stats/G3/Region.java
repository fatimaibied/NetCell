package TestCases.PM.Nokia.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", false,"Hourly");
    }

    @Test
    public void RegionStatsAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", true,"Hourly");
    }

    @Test
    public void RegionStatsDaily3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", false,"Daily");
    }
    @Test
    public void RegionStatsDailyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", true,"Daily");
    }
    @Test
    public void RegionStatsWeekly3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", false,"Weekly");
    }
    @Test
    public void RegionStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", true,"Weekly");
    }

    @Test
    public void RegionStatsMonthly3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", false,"Monthly");
    }
    @Test
    public void RegionStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", true,"Monthly");
    }
    @Test
    public void RegionStatsDailyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", false,"DailyBH");
    }
    @Test
    public void RegionStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", true,"DailyBH");
    }

    @Test
    public void RegionStatsWeeklyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", false,"WeeklyBH");
    }
    @Test
    public void RegionStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", true,"WeeklyBH");
    }

    @Test
    public void RegionStatsMonthlyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", false,"MonthlyBH");
    }

    @Test
    public void RegionStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", true,"MonthlyBH");
    }
    @Test
    public void RegionStatsRowAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Region", true,"Row");
    }
}
