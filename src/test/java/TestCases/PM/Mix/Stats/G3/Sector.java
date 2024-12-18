package TestCases.PM.Mix.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {

    PM State= new PM();

    @Test
    public void SectorStats3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", false,"Hourly", "All", false);
    }

    @Test
    public void SectorStatsAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", true,"Hourly", "All", false);
    }
    @Test
    public void SectorStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", false,"Daily", "All", false);
    }
    @Test
    public void SectorStatsDailyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", true,"Daily", "All", false);
    }
    @Test
    public void SectorStatsWeekly3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", false,"Weekly", "All", false);
    }
    @Test
    public void SectorStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", true,"Weekly", "All", false);
    }

    @Test
    public void SectorStatsMonthly3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", false,"Monthly", "All", false);
    }
    @Test
    public void SectorStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", true,"Monthly", "All", false);
    }
    @Test
    public void SectorStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", false,"DailyBH", "All", false);
    }
    @Test
    public void SectorStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", true,"DailyBH", "All", false);
    }

    @Test
    public void SectorStatsWeeklyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", false,"WeeklyBH", "All", false);
    }
    @Test
    public void SectorStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", true,"WeeklyBH", "All", false);
    }

    @Test
    public void SectorStatsMonthlyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", false,"MonthlyBH", "All", false);
    }

    @Test
    public void SectorStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", true,"MonthlyBH", "All", false);
    }

    @Test
    public void SectorStatsRowAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", true,"Raw", "All", false);
    }
    @Test
    public void SectorStatsRown3G() throws Exception {

        State.Stats("Mix", "3G", "Sector", false,"Raw", "All", false);
    }
}
