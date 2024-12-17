package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    PM State= new PM();

    @Test
    public void RegionXDDStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Hourly", "All");
    }

    @Test
    public void RegionXDDStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Hourly", "All");
    }

    @Test
    public void RegionXDDStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Daily", "All");
    }
    @Test
    public void RegionXDDStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Daily", "All");
    }
    @Test
    public void RegionXDDStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Weekly", "All");
    }
    @Test
    public void RegionXDDStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Weekly", "All");
    }

    @Test
    public void RegionXDDStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Monthly", "All");
    }
    @Test
    public void RegionXDDStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Monthly", "All");
    }
    @Test
    public void RegionXDDStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"DailyBH", "All");
    }
    @Test
    public void RegionXDDStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"DailyBH", "All");
    }

    @Test
    public void RegionXDDStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"WeeklyBH", "All");
    }
    @Test
    public void RegionXDDStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"WeeklyBH", "All");
    }

    @Test
    public void RegionXDDStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"MonthlyBH", "All");
    }

    @Test
    public void RegionXDDStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"MonthlyBH", "All");
    }
    @Test
    public void RegionXDDStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Row", "All");
    }
}
