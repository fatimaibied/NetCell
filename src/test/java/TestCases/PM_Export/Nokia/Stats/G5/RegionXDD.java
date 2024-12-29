package TestCases.PM_Export.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    PM State= new PM();

    @Test
    public void RegionXDDStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Hourly", "All", false);
    }

    @Test
    public void RegionXDDStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Hourly", "All", false);
    }

    @Test
    public void RegionXDDStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Daily", "All", false);
    }
    @Test
    public void RegionXDDStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Daily", "All", false);
    }
    @Test
    public void RegionXDDStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Weekly", "All", false);
    }
    @Test
    public void RegionXDDStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Weekly", "All", false);
    }

    @Test
    public void RegionXDDStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Monthly", "All", false);
    }
    @Test
    public void RegionXDDStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Monthly", "All", false);
    }
    @Test
    public void RegionXDDStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"DailyBH", "All", false);
    }
    @Test
    public void RegionXDDStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"DailyBH", "All", false);
    }

    @Test
    public void RegionXDDStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"WeeklyBH", "All", false);
    }
    @Test
    public void RegionXDDStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"WeeklyBH", "All", false);
    }

    @Test
    public void RegionXDDStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"MonthlyBH", "All", false);
    }

    @Test
    public void RegionXDDStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"MonthlyBH", "All", false);
    }
    @Test
    public void RegionXDDStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Row", "All", false);
    }
}
