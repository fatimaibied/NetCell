package TestCases.PM_Export.Nokia.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats2G() throws Exception {

        State.Stats("Nokia", "2G", "PLMN", false,"Hourly", "All", false);
    }
    @Test
    public void PLMNStatsDaily2G() throws Exception {

        State.Stats("Nokia", "2G", "PLMN", false,"Daily", "All", false);
    }

    @Test
    public void PLMNStatsWeekly2G() throws Exception {

        State.Stats("Nokia", "2G", "PLMN", false,"Weekly", "All", false);
    }

    @Test
    public void PLMNStatsMonthly2G() throws Exception {

        State.Stats("Nokia", "2G", "PLMN", false,"Monthly", "All", false);
    }
    @Test
    public void PLMNStatsDailyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "PLMN", false,"DailyBH", "All", false);
    }

    @Test
    public void PLMNStatsWeeklyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "PLMN", false,"WeeklyBH", "All", false);
    }

    @Test
    public void PLMNStatsMonthlyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "PLMN", false,"MonthlyBH", "All", false);
    }
    @Test
    public void PLMNStatsRaw2G() throws Exception {

        State.Stats("Nokia", "2G", "PLMN", false,"Raw", "All", false);
    }
}
