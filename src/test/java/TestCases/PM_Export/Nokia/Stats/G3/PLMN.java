package TestCases.PM_Export.Nokia.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN", false,"Hourly", "All", false);
    }
    @Test
    public void PLMNStatsDaily3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN", false,"Daily", "All", false);
    }

    @Test
    public void PLMNStatsWeekly3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN", false,"Weekly", "All", false);
    }

    @Test
    public void PLMNStatsMonthly3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN", false,"Monthly", "All", false);
    }
    @Test
    public void PLMNStatsDailyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN", false,"DailyBH", "All", false);
    }

    @Test
    public void PLMNStatsWeeklyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN", false,"WeeklyBH", "All", false);
    }

    @Test
    public void PLMNStatsMonthlyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN", false,"MonthlyBH", "All", false);
    }
    @Test
    public void PLMNStatsRaw3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN", false,"Raw", "All", false);
    }
}
