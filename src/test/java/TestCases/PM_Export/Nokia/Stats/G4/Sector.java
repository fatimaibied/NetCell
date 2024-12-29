package TestCases.PM_Export.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {

    PM State= new PM();

    @Test
    public void SectorStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"Hourly", "All", false);
    }
    @Test
    public void SectorStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"Daily", "All", false);
    }

    @Test
    public void SectorStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"Weekly", "All", false);
    }

    @Test
    public void SectorStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"Monthly", "All", false);
    }
    @Test
    public void SectorStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"DailyBH", "All", false);
    }

    @Test
    public void SectorStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"WeeklyBH", "All", false);
    }

    @Test
    public void SectorStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"MonthlyBH", "All", false);
    }
    @Test
    public void SectorStatsRaw4G() throws Exception {

        State.Stats("Nokia", "4G", "Sector", false,"Raw", "All", false);
    }
}
