package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {

    PM State= new PM();

    @Test
    public void RegionBandStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Hourly");
    }

    @Test
    public void RegionBandStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Hourly");
    }

    @Test
    public void RegionBandStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Daily");
    }
    @Test
    public void RegionBandStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Daily");
    }
    @Test
    public void RegionBandStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Weekly");
    }
    @Test
    public void RegionBandStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Weekly");
    }

    @Test
    public void RegionBandStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"Monthly");
    }
    @Test
    public void RegionBandStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Monthly");
    }
    @Test
    public void RegionBandStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"DailyBH");
    }
    @Test
    public void RegionBandStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"DailyBH");
    }

    @Test
    public void RegionBandStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"WeeklyBH");
    }
    @Test
    public void RegionBandStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"WeeklyBH");
    }

    @Test
    public void RegionBandStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", false,"MonthlyBH");
    }

    @Test
    public void RegionBandStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"MonthlyBH");
    }
    @Test
    public void RegionBandStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region Band", true,"Row");
    }
}
