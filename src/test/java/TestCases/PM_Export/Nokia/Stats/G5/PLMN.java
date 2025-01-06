package TestCases.PM_Export.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Hourly", "All", true);
    }
    @Test
    public void PLMNStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"Daily", "All", true);
    }


    @Test
    public void PLMNStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "PLMN", false,"DailyBH", "All", true);
    }


}
