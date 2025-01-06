package TestCases.PM_Export.Mix.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN", false,"Hourly", "All", true);
    }
    @Test
    public void PLMNStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN", false,"Daily", "All", true);
    }


    @Test
    public void PLMNStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN", false,"DailyBH", "All", true);
    }



}
