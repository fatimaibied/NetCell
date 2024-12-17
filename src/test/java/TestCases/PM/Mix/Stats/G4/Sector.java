package TestCases.PM.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {

    PM State= new PM();

    @Test
    public void SectorStats4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Hourly", "All");
    }

    @Test
    public void SectorStatsAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Hourly", "All");
    }

    @Test
    public void SectorStatsDaily4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Daily", "All");
    }
    @Test
    public void SectorStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Daily", "All");
    }
    @Test
    public void SectorStatsWeekly4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Weekly", "All");
    }
    @Test
    public void SectorStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Weekly", "All");
    }

    @Test
    public void SectorStatsMonthly4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Monthly", "All");
    }
    @Test
    public void SectorStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Monthly", "All");
    }
    @Test
    public void SectorStatsDailyBH4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"DailyBH", "All");
    }
    @Test
    public void SectorStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"DailyBH", "All");
    }

    @Test
    public void SectorStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"WeeklyBH", "All");
    }
    @Test
    public void SectorStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"WeeklyBH", "All");
    }

    @Test
    public void SectorStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Sector", false,"MonthlyBH", "All");
    }

    @Test
    public void SectorStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Sector", true,"MonthlyBH", "All");
    }
}
