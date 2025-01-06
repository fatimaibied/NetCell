package TestCases.PM_Export.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats2G() throws Exception {

        State.Stats("Mix", "2G", "PLMN", false,"Hourly", "All", true);
    }
    @Test
    public void PLMNStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "PLMN", false,"Daily", "All", true);
    }


    @Test
    public void PLMNStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "PLMN", false,"DailyBH", "All", true);
    }


}
