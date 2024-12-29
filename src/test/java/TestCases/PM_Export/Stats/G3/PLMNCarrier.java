package TestCases.PM_Export.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {

    PM State= new PM();

    @Test
    public void PLMNCarrierStats4G() throws Exception {

        State.Stats("Mix", "3G", "PLMN Carrier", false,"Hourly", "All", false);
    }
    @Test
    public void PLMNCarrierStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN Carrier", false,"Daily", "All", false);
    }

    @Test
    public void PLMNCarrierStatsWeekly3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN Carrier", false,"Weekly", "All", false);
    }

    @Test
    public void PLMNCarrierStatsMonthly3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN Carrier", false,"Monthly", "All", false);
    }
    @Test
    public void PLMNCarrierStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN Carrier", false,"DailyBH", "All", false);
    }

    @Test
    public void PLMNCarrierStatsWeeklyBH3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN Carrier", false,"WeeklyBH", "All", false);
    }

    @Test
    public void PLMNCarrierStatsMonthlyBH3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN Carrier", false,"MonthlyBH", "All", false);
    }

    @Test
    public void PLMNCarrierStatsRawBH3G() throws Exception {

        State.Stats("Mix", "3G", "PLMN Carrier", false,"Raw", "All", false);
    }


}
