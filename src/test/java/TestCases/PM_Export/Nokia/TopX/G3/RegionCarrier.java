package TestCases.PM_Export.Nokia.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionCarrier extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionCarrierDailyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Daily", false);
    }

    @Test
    public void RegionCarrierDailyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "DailyBH", false);
    }

    @Test
    public void RegionCarrierWeeklyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Weekly", false);
    }

    @Test
    public void RegionCarrierWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "WeeklyBH", false);
    }

    @Test
    public void RegionCarrierMonthlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Monthly", false);
    }
    @Test
    public void RegionCarrierMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "MonthlyBH", false);
    }

    @Test
    public void RegionCarrierHourlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionCarrierDailyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Daily", true);
    }
    @Test
    public void RegionCarrierDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "DailyBH", true);
    }

    @Test
    public void RegionCarrierWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Weekly", true);
    }

    @Test
    public void RegionCarrierWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "WeeklyBH", true);
    }

    @Test
    public void RegionCarrierMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Monthly", true);
    }
    @Test
    public void RegionCarrierMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "MonthlyBH", true);
    }

    @Test
    public void RegionCarrierHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Hourly", true);
    }
}
