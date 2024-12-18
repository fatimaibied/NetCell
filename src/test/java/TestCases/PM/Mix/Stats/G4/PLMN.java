package TestCases.PM.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class
PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStatsHourly4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN", false,"Hourly", "All", false);
    }

    @Test
    public void PLMNStatsDaily4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN", false,"Daily", "All", false);
    }

    @Test
    public void PLMNStatsWeekly4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN", false,"Weekly", "All", false);
    }

    @Test
    public void PLMNStatsMonthly4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN", false,"Monthly", "All", false);
    }
    @Test
    public void PLMNStatsDailyBH4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN", false,"DailyBH", "All", false);
    }

    @Test
    public void PLMNStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN", false,"WeeklyBH", "All", false);
    }

    @Test
    public void PLMNStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN", false,"MonthlyBH", "All", false);
    }
}
