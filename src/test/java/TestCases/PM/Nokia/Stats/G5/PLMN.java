package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Hourly", "All");
    }
    @Test
    public void PLMNStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Daily", "All");
    }

    @Test
    public void PLMNStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Weekly", "All");
    }

    @Test
    public void PLMNStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Monthly", "All");
    }
    @Test
    public void PLMNStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"DailyBH", "All");
    }

    @Test
    public void PLMNStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"WeeklyBH", "All");
    }

    @Test
    public void PLMNStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"MonthlyBH", "All");
    }
    @Test
    public void PLMNStatsRaw5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Raw", "All");
    }
}
