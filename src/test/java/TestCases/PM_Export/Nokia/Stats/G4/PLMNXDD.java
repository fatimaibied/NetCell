package TestCases.PM_Export.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNXDDStats4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Hourly", "All", true);
    }

    @Test
    public void PLMNXDDStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Hourly", "All", true);
    }

    @Test
    public void PLMNXDDStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"Daily", "All", true);
    }
    @Test
    public void PLMNXDDStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"Daily", "All", true);
    }


    @Test
    public void PLMNXDDStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", false,"DailyBH", "All", true);
    }
    @Test
    public void PLMNXDDStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "PLMN XDD", true,"DailyBH", "All", true);
    }


}
