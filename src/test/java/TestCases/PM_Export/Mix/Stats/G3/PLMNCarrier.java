package TestCases.PM_Export.Mix.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNCarrierStats4G() throws Exception {

        State.Stats("Mix", "3G", "PLMN Carrier", false,"Hourly", "All", true);
    }
    @Test
    public void PLMNCarrierStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN Carrier", false,"Daily", "All", true);
    }

    @Test
    public void PLMNCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN Carrier", false,"DailyBH", "All", true);
    }

}
