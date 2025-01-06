package TestCases.PM_Export.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNStats4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN", false,"Hourly", "All", true);
    }
    @Test
    public void PLMNStatsDaily4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN", false,"Daily", "All", true);
    }


    @Test
    public void PLMNStatsDailyBH4G() throws Exception {

        State.Stats("Mix", "4G", "PLMN", false,"DailyBH", "All", true);
    }


}
