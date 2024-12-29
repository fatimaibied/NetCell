package TestCases.PM_Export.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNXDDStats4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Hourly", "All", false);
    }

    @Test
    public void PLMNXDDStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Hourly", "All", false);
    }

    @Test
    public void PLMNXDDStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Daily", "All", false);
    }
    @Test
    public void PLMNXDDStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Daily", "All", false);
    }
    @Test
    public void PLMNXDDStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Weekly", "All", false);
    }
    @Test
    public void PLMNXDDStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Weekly", "All", false);
    }

    @Test
    public void PLMNXDDStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Monthly", "All", false);
    }
    @Test
    public void PLMNXDDStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Monthly", "All", false);
    }
    @Test
    public void PLMNXDDStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"DailyBH", "All", false);
    }
    @Test
    public void PLMNXDDStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"DailyBH", "All", false);
    }

    @Test
    public void PLMNXDDStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"WeeklyBH", "All", false);
    }
    @Test
    public void PLMNXDDStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"WeeklyBH", "All", false);
    }

    @Test
    public void PLMNXDDStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"MonthlyBH", "All", false);
    }

    @Test
    public void PLMNXDDStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"MonthlyBH", "All", false);
    }
    @Test
    public void PLMNXDDStatsRowAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Row", "All", false);
    }
}
