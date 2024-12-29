package TestCases.PM_Export.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNXDDStats5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Hourly", "All", false);
    }

    @Test
    public void PLMNXDDStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Hourly", "All", false);
    }

    @Test
    public void PLMNXDDStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Daily", "All", false);
    }
    @Test
    public void PLMNXDDStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Daily", "All", false);
    }
    @Test
    public void PLMNXDDStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Weekly", "All", false);
    }
    @Test
    public void PLMNXDDStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Weekly", "All", false);
    }

    @Test
    public void PLMNXDDStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Monthly", "All", false);
    }
    @Test
    public void PLMNXDDStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Monthly", "All", false);
    }
    @Test
    public void PLMNXDDStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"DailyBH", "All", false);
    }
    @Test
    public void PLMNXDDStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"DailyBH", "All", false);
    }

    @Test
    public void PLMNXDDStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"WeeklyBH", "All", false);
    }
    @Test
    public void PLMNXDDStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"WeeklyBH", "All", false);
    }

    @Test
    public void PLMNXDDStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"MonthlyBH", "All", false);
    }

    @Test
    public void PLMNXDDStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"MonthlyBH", "All", false);
    }
    @Test
    public void PLMNXDDStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Row", "All", false);
    }
}
