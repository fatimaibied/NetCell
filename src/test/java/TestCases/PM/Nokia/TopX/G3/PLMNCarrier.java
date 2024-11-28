package TestCases.PM.Nokia.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNCarrierDailyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "Daily", "Cell", false);
    }

    @Test
    public void PLMNCarrierDailyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "DailyBH", "Cell", false);
    }

    @Test
    public void PLMNCarrierWeeklyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "Weekly", "Cell", false);
    }

    @Test
    public void PLMNCarrierWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "WeeklyBH", "Cell", false);
    }

    @Test
    public void PLMNCarrierMonthlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "Monthly", "Cell", false);
    }
    @Test
    public void PLMNCarrierMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "MonthlyBH", "Cell", false);
    }

    @Test
    public void PLMNCarrierHourlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNCarrierDailyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "Daily", "Cell", true);
    }
    @Test
    public void PLMNCarrierDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "DailyBH", "Cell", true);
    }

    @Test
    public void PLMNCarrierWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "Weekly", "Cell", true);
    }

    @Test
    public void PLMNCarrierWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "WeeklyBH", "Cell", true);
    }

    @Test
    public void PLMNCarrierMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "Monthly", "Cell", true);
    }
    @Test
    public void PLMNCarrierMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "MonthlyBH", "Cell", true);
    }

    @Test
    public void PLMNCarrierHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN Carrier", "Hourly", "Cell", true);
    }

}
