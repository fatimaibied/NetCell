package TestCases.PM.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNXDDStats4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN XDD", false,"Hourly");
    }
    @Test
    public void PLMNXDDStatsDaily4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN XDD", false,"Daily");
    }

    @Test
    public void PLMNXDDStatsWeekly4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN XDD", false,"Weekly");
    }

    @Test
    public void PLMNXDDStatsMonthly4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN XDD", false,"Monthly");
    }
    @Test
    public void PLMNXDDStatsDailyBH4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN XDD", false,"DailyBH");
    }

    @Test
    public void PLMNXDDStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN XDD", false,"WeeklyBH");
    }

    @Test
    public void PLMNXDDStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN XDD", false,"MonthlyBH");
    }
}
