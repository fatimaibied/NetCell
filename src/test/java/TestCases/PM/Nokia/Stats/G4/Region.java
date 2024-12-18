package TestCases.PM.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {

    PM State= new PM();

    @Test
    public void RegionStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", false,"Hourly", "All", false);
    }

    @Test
    public void RegionStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", true,"Hourly", "All", false);
    }

    @Test
    public void RegionStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", false,"Daily", "All", false);
    }
    @Test
    public void RegionStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", true,"Daily", "All", false);
    }
    @Test
    public void RegionStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", false,"Weekly", "All", false);
    }
    @Test
    public void RegionStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", true,"Weekly", "All", false);
    }

    @Test
    public void RegionStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", false,"Monthly", "All", false);
    }
    @Test
    public void RegionStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", true,"Monthly", "All", false);
    }
    @Test
    public void RegionStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", false,"DailyBH", "All", false);
    }
    @Test
    public void RegionStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", true,"DailyBH", "All", false);
    }

    @Test
    public void RegionStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", false,"WeeklyBH", "All", false);
    }
    @Test
    public void RegionStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", true,"WeeklyBH", "All", false);
    }

    @Test
    public void RegionStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", false,"MonthlyBH", "All", false);
    }

    @Test
    public void RegionStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", true,"MonthlyBH", "All", false);
    }
    @Test
    public void RegionStatsRowAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Region", true,"Row", "All", false);
    }
}
