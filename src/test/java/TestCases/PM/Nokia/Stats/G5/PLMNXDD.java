package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNXDDStats5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Hourly");
    }

    @Test
    public void PLMNXDDStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Hourly");
    }

    @Test
    public void PLMNXDDStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Daily");
    }
    @Test
    public void PLMNXDDStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Daily");
    }
    @Test
    public void PLMNXDDStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Weekly");
    }
    @Test
    public void PLMNXDDStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Weekly");
    }

    @Test
    public void PLMNXDDStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Monthly");
    }
    @Test
    public void PLMNXDDStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Monthly");
    }
    @Test
    public void PLMNXDDStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"DailyBH");
    }
    @Test
    public void PLMNXDDStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"DailyBH");
    }

    @Test
    public void PLMNXDDStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"WeeklyBH");
    }
    @Test
    public void PLMNXDDStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"WeeklyBH");
    }

    @Test
    public void PLMNXDDStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"MonthlyBH");
    }

    @Test
    public void PLMNXDDStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"MonthlyBH");
    }
    @Test
    public void PLMNXDDStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Row");
    }
}
