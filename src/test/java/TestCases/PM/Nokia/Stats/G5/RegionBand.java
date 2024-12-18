package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {

    PM State= new PM();

    @Test
    public void RegionBandStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Hourly", "All", false);
    }

    @Test
    public void RegionBandStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Hourly", "All", false);
    }

    @Test
    public void RegionBandStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Daily", "All", false);
    }
    @Test
    public void RegionBandStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Daily", "All", false);
    }
    @Test
    public void RegionBandStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Weekly", "All", false);
    }
    @Test
    public void RegionBandStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Weekly", "All", false);
    }

    @Test
    public void RegionBandStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Monthly", "All", false);
    }
    @Test
    public void RegionBandStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Monthly", "All", false);
    }
    @Test
    public void RegionBandStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"DailyBH", "All", false);
    }
    @Test
    public void RegionBandStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"DailyBH", "All", false);
    }

    @Test
    public void RegionBandStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"WeeklyBH", "All", false);
    }
    @Test
    public void RegionBandStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"WeeklyBH", "All", false);
    }

    @Test
    public void RegionBandStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"MonthlyBH", "All", false);
    }

    @Test
    public void RegionBandStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"MonthlyBH", "All", false);
    }
    @Test
    public void RegionBandStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Row", "All", false);
    }
}
