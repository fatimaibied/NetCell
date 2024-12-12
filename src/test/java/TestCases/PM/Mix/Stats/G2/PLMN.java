package TestCases.PM.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats2G() throws Exception {

        State.Stats("Mix", "2G", "PLMN", false,"Hourly");
    }
    @Test
    public void PLMNStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "PLMN", false,"Daily");
    }

    @Test
    public void PLMNStatsWeekly2G() throws Exception {

        State.Stats("Mix", "2G", "PLMN", false,"Weekly");
    }

    @Test
    public void PLMNStatsMonthly2G() throws Exception {

        State.Stats("Mix", "2G", "PLMN", false,"Monthly");
    }
    @Test
    public void PLMNStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "PLMN", false,"DailyBH");
    }

    @Test
    public void PLMNStatsWeeklyBH2G() throws Exception {

        State.Stats("Mix", "2G", "PLMN", false,"WeeklyBH");
    }

    @Test
    public void PLMNStatsMonthlyBH2G() throws Exception {

        State.Stats("Mix", "2G", "PLMN", false,"MonthlyBH");
    }
}
