package TestCases.PM.Nokia.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNCarrierStats3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"Hourly");
    }

    @Test
    public void PLMNCarrierStatsAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Hourly");
    }

    @Test
    public void PLMNCarrierStatsDaily3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"Daily");
    }
    @Test
    public void PLMNCarrierStatsDailyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Daily");
    }
    @Test
    public void PLMNCarrierStatsWeekly3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"Weekly");
    }
    @Test
    public void PLMNCarrierStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Weekly");
    }

    @Test
    public void PLMNCarrierStatsMonthly3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"Monthly");
    }
    @Test
    public void PLMNCarrierStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Monthly");
    }
    @Test
    public void PLMNCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"DailyBH");
    }
    @Test
    public void PLMNCarrierStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"DailyBH");
    }

    @Test
    public void PLMNCarrierStatsWeeklyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"WeeklyBH");
    }
    @Test
    public void PLMNCarrierStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"WeeklyBH");
    }

    @Test
    public void PLMNCarrierStatsMonthlyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"MonthlyBH");
    }

    @Test
    public void PLMNCarrierStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"MonthlyBH");
    }
    @Test
    public void PLMNCarrierStatsRowAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Row");
    }
}
