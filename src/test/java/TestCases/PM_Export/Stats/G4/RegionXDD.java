package TestCases.PM_Export.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {

    PM State= new PM();

    @Test
    public void RegionXDDStats4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", false,"Hourly", "All", false);
    }

    @Test
    public void RegionXDDStatsAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", true,"Hourly", "All", false);
    }
    @Test
    public void RegionXDDStatsDaily4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", false,"Daily", "All", false);
    }
    @Test
    public void RegionXDDStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", true,"Daily", "All", false);
    }
    @Test
    public void RegionXDDStatsWeekly4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", false,"Weekly", "All", false);
    }
    @Test
    public void RegionXDDStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", true,"Weekly", "All", false);
    }

    @Test
    public void RegionXDDStatsMonthly4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", false,"Monthly", "All", false);
    }
    @Test
    public void RegionXDDStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", true,"Monthly", "All", false);
    }
    @Test
    public void RegionXDDStatsDailyBH4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", false,"DailyBH", "All", false);
    }
    @Test
    public void RegionXDDStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", true,"DailyBH", "All", false);
    }

    @Test
    public void RegionXDDStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", false,"WeeklyBH", "All", false);
    }
    @Test
    public void RegionXDDStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", true,"WeeklyBH", "All", false);
    }

    @Test
    public void RegionXDDStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", false,"MonthlyBH", "All", false);
    }

    @Test
    public void RegionXDDStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Region XDD", true,"MonthlyBH", "All", false);
    }

}
