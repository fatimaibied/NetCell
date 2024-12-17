package TestCases.PM.Nokia.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNCarrierStats3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"Hourly", "All");
    }

    @Test
    public void PLMNCarrierStatsAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Hourly", "All");
    }

    @Test
    public void PLMNCarrierStatsDaily3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"Daily", "All");
    }
    @Test
    public void PLMNCarrierStatsDailyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Daily", "All");
    }
    @Test
    public void PLMNCarrierStatsWeekly3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"Weekly", "All");
    }
    @Test
    public void PLMNCarrierStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Weekly", "All");
    }

    @Test
    public void PLMNCarrierStatsMonthly3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"Monthly", "All");
    }
    @Test
    public void PLMNCarrierStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Monthly", "All");
    }
    @Test
    public void PLMNCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"DailyBH", "All");
    }
    @Test
    public void PLMNCarrierStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"DailyBH", "All");
    }

    @Test
    public void PLMNCarrierStatsWeeklyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"WeeklyBH", "All");
    }
    @Test
    public void PLMNCarrierStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"WeeklyBH", "All");
    }

    @Test
    public void PLMNCarrierStatsMonthlyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"MonthlyBH", "All");
    }

    @Test
    public void PLMNCarrierStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"MonthlyBH", "All");
    }
    @Test
    public void PLMNCarrierStatsRawAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Raw", "All");
    }
}
