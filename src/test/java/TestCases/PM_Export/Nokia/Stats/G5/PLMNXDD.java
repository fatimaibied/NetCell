package TestCases.PM_Export.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNXDDStats5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Hourly", "All", true);
    }

    @Test
    public void PLMNXDDStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Hourly", "All", true);
    }

    @Test
    public void PLMNXDDStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"Daily", "All", true);
    }
    @Test
    public void PLMNXDDStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"Daily", "All", true);
    }

    @Test
    public void PLMNXDDStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", false,"DailyBH", "All", true);
    }
    @Test
    public void PLMNXDDStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN XDD", true,"DailyBH", "All", true);
    }


}
