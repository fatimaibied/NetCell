package TestCases.PM.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNXDDStats4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Hourly", "All");
    }

    @Test
    public void PLMNXDDStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Hourly", "All");
    }

    @Test
    public void PLMNXDDStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Daily", "All");
    }
    @Test
    public void PLMNXDDStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Daily", "All");
    }
    @Test
    public void PLMNXDDStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Weekly", "All");
    }
    @Test
    public void PLMNXDDStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Weekly", "All");
    }

    @Test
    public void PLMNXDDStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Monthly", "All");
    }
    @Test
    public void PLMNXDDStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Monthly", "All");
    }
    @Test
    public void PLMNXDDStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"DailyBH", "All");
    }
    @Test
    public void PLMNXDDStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"DailyBH", "All");
    }

    @Test
    public void PLMNXDDStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"WeeklyBH", "All");
    }
    @Test
    public void PLMNXDDStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"WeeklyBH", "All");
    }

    @Test
    public void PLMNXDDStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"MonthlyBH", "All");
    }

    @Test
    public void PLMNXDDStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"MonthlyBH", "All");
    }
    @Test
    public void PLMNXDDStatsRowAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Row", "All");
    }
}
