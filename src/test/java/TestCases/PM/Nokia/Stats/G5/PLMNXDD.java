package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNXDDStats5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Hourly", "All");
    }

    @Test
    public void PLMNXDDStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Hourly", "All");
    }

    @Test
    public void PLMNXDDStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Daily", "All");
    }
    @Test
    public void PLMNXDDStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Daily", "All");
    }
    @Test
    public void PLMNXDDStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Weekly", "All");
    }
    @Test
    public void PLMNXDDStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Weekly", "All");
    }

    @Test
    public void PLMNXDDStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Monthly", "All");
    }
    @Test
    public void PLMNXDDStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Monthly", "All");
    }
    @Test
    public void PLMNXDDStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"DailyBH", "All");
    }
    @Test
    public void PLMNXDDStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"DailyBH", "All");
    }

    @Test
    public void PLMNXDDStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"WeeklyBH", "All");
    }
    @Test
    public void PLMNXDDStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"WeeklyBH", "All");
    }

    @Test
    public void PLMNXDDStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"MonthlyBH", "All");
    }

    @Test
    public void PLMNXDDStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"MonthlyBH", "All");
    }
    @Test
    public void PLMNXDDStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Row", "All");
    }
}
