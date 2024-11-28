package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    PM State= new PM();

    @Test
    public void RegionXDDStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Hourly");
    }

    @Test
    public void RegionXDDStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Hourly");
    }

    @Test
    public void RegionXDDStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Daily");
    }
    @Test
    public void RegionXDDStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Daily");
    }
    @Test
    public void RegionXDDStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Weekly");
    }
    @Test
    public void RegionXDDStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Weekly");
    }

    @Test
    public void RegionXDDStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"Monthly");
    }
    @Test
    public void RegionXDDStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Monthly");
    }
    @Test
    public void RegionXDDStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"DailyBH");
    }
    @Test
    public void RegionXDDStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"DailyBH");
    }

    @Test
    public void RegionXDDStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"WeeklyBH");
    }
    @Test
    public void RegionXDDStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"WeeklyBH");
    }

    @Test
    public void RegionXDDStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", false,"MonthlyBH");
    }

    @Test
    public void RegionXDDStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"MonthlyBH");
    }
    @Test
    public void RegionXDDStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Region XDD", true,"Row");
    }
}
