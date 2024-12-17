package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNCarrierStats4G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Hourly", "All");
    }
    @Test
    public void PLMNCarrierStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Daily", "All");
    }

    @Test
    public void PLMNCarrierStatsWeekly3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Weekly", "All");
    }

    @Test
    public void PLMNCarrierStatsMonthly3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Monthly", "All");
    }
    @Test
    public void PLMNCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"DailyBH", "All");
    }

    @Test
    public void PLMNCarrierStatsWeeklyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"WeeklyBH", "All");
    }

    @Test
    public void PLMNCarrierStatsMonthlyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"MonthlyBH", "All");
    }

    @Test
    public void PLMNCarrierStatsRawBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Raw", "All");
    }
    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void PLMNCarrierSearchForKPI3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Hourly", "CSPS_SHO_Success_Ratio");
    }

}
