package TestCases.PM_Export.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNCarrier extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNCarrierDailyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "Daily", false);
    }

    @Test
    public void PLMNCarrierDailyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "DailyBH", false);
    }

    @Test
    public void PLMNCarrierWeeklyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "Weekly", false);
    }

    @Test
    public void PLMNCarrierWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "WeeklyBH", false);
    }

    @Test
    public void PLMNCarrierMonthlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "Monthly", false);
    }
    @Test
    public void PLMNCarrierMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "MonthlyBH", false);
    }

    @Test
    public void PLMNCarrierHourlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNCarrierDailyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "Daily", true);
    }
    @Test
    public void PLMNCarrierDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "DailyBH", true);
    }

    @Test
    public void PLMNCarrierWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "Weekly", true);
    }

    @Test
    public void PLMNCarrierWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "WeeklyBH", true);
    }

    @Test
    public void PLMNCarrierMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "Monthly", true);
    }
    @Test
    public void PLMNCarrierMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "MonthlyBH", true);
    }

    @Test
    public void PLMNCarrierHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN Carrier", "Hourly", true);
    }

}
