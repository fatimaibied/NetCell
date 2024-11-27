package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN", false,"Hourly");
    }
    @Test
    public void PLMNStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN", false,"Daily");
    }

    @Test
    public void PLMNStatsWeekly3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN", false,"Weekly");
    }

    @Test
    public void PLMNStatsMonthly3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN", false,"Monthly");
    }
    @Test
    public void PLMNStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN", false,"DailyBH");
    }

    @Test
    public void PLMNStatsWeeklyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN", false,"WeeklyBH");
    }

    @Test
    public void PLMNStatsMonthlyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN", false,"MonthlyBH");
    }

    @Test
    public void PLMNStatsRawBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN", false,"Raw");
    }

}
