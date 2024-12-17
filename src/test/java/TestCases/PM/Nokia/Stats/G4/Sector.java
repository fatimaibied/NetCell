package TestCases.PM.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {

    PM State= new PM();

    @Test
    public void SectorStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"Hourly", "All");
    }
    @Test
    public void SectorStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"Daily", "All");
    }

    @Test
    public void SectorStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"Weekly", "All");
    }

    @Test
    public void SectorStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"Monthly", "All");
    }
    @Test
    public void SectorStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"DailyBH", "All");
    }

    @Test
    public void SectorStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"WeeklyBH", "All");
    }

    @Test
    public void SectorStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"MonthlyBH", "All");
    }
    @Test
    public void SectorStatsRaw4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"Raw", "All");
    }
}
