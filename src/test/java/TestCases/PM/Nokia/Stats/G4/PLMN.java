package TestCases.PM.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN", false,"Hourly");
    }
    @Test
    public void PLMNStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN", false,"Daily");
    }

    @Test
    public void PLMNStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN", false,"Weekly");
    }

    @Test
    public void PLMNStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN", false,"Monthly");
    }
    @Test
    public void PLMNStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN", false,"DailyBH");
    }

    @Test
    public void PLMNStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN", false,"WeeklyBH");
    }

    @Test
    public void PLMNStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN", false,"MonthlyBH");
    }
    @Test
    public void PLMNStatsRaw4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN", false,"Raw");
    }
}
