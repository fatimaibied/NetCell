package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {

    PM State= new PM();

    @Test
    public void RegionBandStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Hourly", "All");
    }

    @Test
    public void RegionBandStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Hourly", "All");
    }

    @Test
    public void RegionBandStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Daily", "All");
    }
    @Test
    public void RegionBandStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Daily", "All");
    }
    @Test
    public void RegionBandStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Weekly", "All");
    }
    @Test
    public void RegionBandStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Weekly", "All");
    }

    @Test
    public void RegionBandStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Monthly", "All");
    }
    @Test
    public void RegionBandStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Monthly", "All");
    }
    @Test
    public void RegionBandStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"DailyBH", "All");
    }
    @Test
    public void RegionBandStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"DailyBH", "All");
    }

    @Test
    public void RegionBandStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"WeeklyBH", "All");
    }
    @Test
    public void RegionBandStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"WeeklyBH", "All");
    }

    @Test
    public void RegionBandStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"MonthlyBH", "All");
    }

    @Test
    public void RegionBandStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"MonthlyBH", "All");
    }
    @Test
    public void RegionBandStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Row", "All");
    }
}
