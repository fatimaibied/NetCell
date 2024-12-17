package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNXDDStats4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN XDD", false,"Hourly", "All");
    }
    @Test
    public void PLMNXDDStatsDaily4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN XDD", false,"Daily", "All");
    }

    @Test
    public void PLMNXDDStatsWeekly4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN XDD", false,"Weekly", "All");
    }

    @Test
    public void PLMNXDDStatsMonthly4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN XDD", false,"Monthly", "All");
    }
    @Test
    public void PLMNXDDStatsDailyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN XDD", false,"DailyBH", "All");
    }

    @Test
    public void PLMNXDDStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN XDD", false,"WeeklyBH", "All");
    }

    @Test
    public void PLMNXDDStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN XDD", false,"MonthlyBH", "All");
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void PLMNXDDSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "PLMN XDD", false,"Hourly", "Cell_non_Availability_Sys");
    }
}
