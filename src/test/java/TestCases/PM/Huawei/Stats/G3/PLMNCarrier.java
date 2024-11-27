package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNCarrierStats4G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Hourly");
    }
    @Test
    public void PLMNCarrierStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Daily");
    }

    @Test
    public void PLMNCarrierStatsWeekly3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Weekly");
    }

    @Test
    public void PLMNCarrierStatsMonthly3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Monthly");
    }
    @Test
    public void PLMNCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"DailyBH");
    }

    @Test
    public void PLMNCarrierStatsWeeklyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"WeeklyBH");
    }

    @Test
    public void PLMNCarrierStatsMonthlyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"MonthlyBH");
    }

    @Test
    public void PLMNCarrierStatsRawBH3G() throws Exception {

        State.Stats("Huawei", "3G", "PLMN Carrier", false,"Raw");
    }


}
