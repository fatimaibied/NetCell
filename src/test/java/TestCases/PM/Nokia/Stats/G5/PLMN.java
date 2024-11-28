package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Hourly");
    }
    @Test
    public void PLMNStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Daily");
    }

    @Test
    public void PLMNStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Weekly");
    }

    @Test
    public void PLMNStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Monthly");
    }
    @Test
    public void PLMNStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"DailyBH");
    }

    @Test
    public void PLMNStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"WeeklyBH");
    }

    @Test
    public void PLMNStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"MonthlyBH");
    }
    @Test
    public void PLMNStatsRaw5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Raw");
    }
}
