package TestCases.PM_Export.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNCarrierStats4G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Hourly", "All", true);
    }
    @Test
    public void PLMNCarrierAggregationStats4G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", true,"Hourly", "All", true);
    }
    @Test
    public void PLMNCarrierStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Daily", "All", true);
    }

    @Test
    public void PLMNCarrierAggregationStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", true,"Daily", "All", true);
    }
    @Test
    public void PLMNCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"DailyBH", "All", true);
    }

    @Test
    public void PLMNCarrierAggregationStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", true,"DailyBH", "All", true);
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void PLMNCarrierSearchForKPI3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Hourly", "CSPS_SHO_Success_Ratio", true);
    }

}
