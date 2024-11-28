package TestCases.PM.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNXDDStats4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Hourly");
    }

    @Test
    public void PLMNXDDStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Hourly");
    }

    @Test
    public void PLMNXDDStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Daily");
    }
    @Test
    public void PLMNXDDStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Daily");
    }
    @Test
    public void PLMNXDDStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Weekly");
    }
    @Test
    public void PLMNXDDStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Weekly");
    }

    @Test
    public void PLMNXDDStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Monthly");
    }
    @Test
    public void PLMNXDDStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Monthly");
    }
    @Test
    public void PLMNXDDStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"DailyBH");
    }
    @Test
    public void PLMNXDDStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"DailyBH");
    }

    @Test
    public void PLMNXDDStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"WeeklyBH");
    }
    @Test
    public void PLMNXDDStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"WeeklyBH");
    }

    @Test
    public void PLMNXDDStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"MonthlyBH");
    }

    @Test
    public void PLMNXDDStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"MonthlyBH");
    }
    @Test
    public void PLMNXDDStatsRowAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Row");
    }
}
