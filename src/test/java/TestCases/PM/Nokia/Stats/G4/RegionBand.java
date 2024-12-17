package TestCases.PM.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {

    PM State= new PM();

    @Test
    public void RegionBandStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", false,"Hourly", "All");
    }

    @Test
    public void RegionBandStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", true,"Hourly", "All");
    }

    @Test
    public void RegionBandStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", false,"Daily", "All");
    }
    @Test
    public void RegionBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", true,"Daily", "All");
    }
    @Test
    public void RegionBandStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", false,"Weekly", "All");
    }
    @Test
    public void RegionBandStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", true,"Weekly", "All");
    }

    @Test
    public void RegionBandStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", false,"Monthly", "All");
    }
    @Test
    public void RegionBandStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", true,"Monthly", "All");
    }
    @Test
    public void RegionBandStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", false,"DailyBH", "All");
    }
    @Test
    public void RegionBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", true,"DailyBH", "All");
    }

    @Test
    public void RegionBandStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", false,"WeeklyBH", "All");
    }
    @Test
    public void RegionBandStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", true,"WeeklyBH", "All");
    }

    @Test
    public void RegionBandStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", false,"MonthlyBH", "All");
    }

    @Test
    public void RegionBandStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", true,"MonthlyBH", "All");
    }
    @Test
    public void RegionBandStatsRowAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region Band", true,"Row", "All");
    }
}
