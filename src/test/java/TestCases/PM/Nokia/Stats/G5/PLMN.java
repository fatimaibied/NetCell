package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Hourly", "All", false);
    }
    @Test
    public void PLMNStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Daily", "All", false);
    }

    @Test
    public void PLMNStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Weekly", "All", false);
    }

    @Test
    public void PLMNStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Monthly", "All", false);
    }
    @Test
    public void PLMNStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"DailyBH", "All", false);
    }

    @Test
    public void PLMNStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"WeeklyBH", "All", false);
    }

    @Test
    public void PLMNStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"MonthlyBH", "All", false);
    }
    @Test
    public void PLMNStatsRaw5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Raw", "All", false);
    }
}
