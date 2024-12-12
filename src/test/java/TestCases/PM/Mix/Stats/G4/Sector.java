package TestCases.PM.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {

    PM State= new PM();

    @Test
    public void SectorStats4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Hourly");
    }

    @Test
    public void SectorStatsAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Hourly");
    }

    @Test
    public void SectorStatsDaily4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Daily");
    }
    @Test
    public void SectorStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Daily");
    }
    @Test
    public void SectorStatsWeekly4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Weekly");
    }
    @Test
    public void SectorStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Weekly");
    }

    @Test
    public void SectorStatsMonthly4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"Monthly");
    }
    @Test
    public void SectorStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"Monthly");
    }
    @Test
    public void SectorStatsDailyBH4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"DailyBH");
    }
    @Test
    public void SectorStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"DailyBH");
    }

    @Test
    public void SectorStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix","4G", "Sector", false,"WeeklyBH");
    }
    @Test
    public void SectorStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Mix","4G", "Sector", true,"WeeklyBH");
    }

    @Test
    public void SectorStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Sector", false,"MonthlyBH");
    }

    @Test
    public void SectorStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Sector", true,"MonthlyBH");
    }
}
