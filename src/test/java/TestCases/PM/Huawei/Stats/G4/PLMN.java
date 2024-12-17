package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class
PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStatsHourly4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN", false,"Hourly", "All");
    }

    @Test
    public void PLMNStatsDaily4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN", false,"Daily", "All");
    }

    @Test
    public void PLMNStatsWeekly4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN", false,"Weekly", "All");
    }

    @Test
    public void PLMNStatsMonthly4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN", false,"Monthly", "All");
    }
    @Test
    public void PLMNStatsDailyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN", false,"DailyBH", "All");
    }

    @Test
    public void PLMNStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN", false,"WeeklyBH", "All");
    }

    @Test
    public void PLMNStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN", false,"MonthlyBH", "All");
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void PLMNSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN", false,"Hourly", "RRC_ConnReq_Att_Emc");
    }
}
