package TestCases.PM.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {

    PM State= new PM();

    @Test
    public void SectorStats4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Hourly", "All", false);
    }

    @Test
    public void SectorStatsAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Hourly", "All", false);
    }

    @Test
    public void SectorStatsDaily4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Daily", "All", false);
    }
    @Test
    public void SectorStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Daily", "All", false);
    }
    @Test
    public void SectorStatsWeekly4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Weekly", "All", false);
    }
    @Test
    public void SectorStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Weekly", "All", false);
    }

    @Test
    public void SectorStatsMonthly4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Monthly", "All", false);
    }
    @Test
    public void SectorStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Monthly", "All", false);
    }
    @Test
    public void SectorStatsDailyBH4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"DailyBH", "All", false);
    }
    @Test
    public void SectorStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"DailyBH", "All", false);
    }

    @Test
    public void SectorStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"WeeklyBH", "All", false);
    }
    @Test
    public void SectorStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"WeeklyBH", "All", false);
    }

    @Test
    public void SectorStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Sector", false,"MonthlyBH", "All", false);
    }

    @Test
    public void SectorStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Sector", true,"MonthlyBH", "All", false);
    }
}
