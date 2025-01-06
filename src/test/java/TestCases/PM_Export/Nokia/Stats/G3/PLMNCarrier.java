package TestCases.PM_Export.Nokia.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNCarrierStats3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"Hourly", "All", true);
    }

    @Test
    public void PLMNCarrierStatsAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Hourly", "All", true);
    }

    @Test
    public void PLMNCarrierStatsDaily3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"Daily", "All", true);
    }
    @Test
    public void PLMNCarrierStatsDailyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"Daily", "All", true);
    }

    @Test
    public void PLMNCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", false,"DailyBH", "All", true);
    }
    @Test
    public void PLMNCarrierStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "PLMN Carrier", true,"DailyBH", "All", true);
    }


}
