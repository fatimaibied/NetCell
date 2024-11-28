package TestCases.PM.Nokia.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionCarrier extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionCarrierDailyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Daily", "Cell", false);
    }

    @Test
    public void RegionCarrierDailyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "DailyBH", "Cell", false);
    }

    @Test
    public void RegionCarrierWeeklyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Weekly", "Cell", false);
    }

    @Test
    public void RegionCarrierWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "WeeklyBH", "Cell", false);
    }

    @Test
    public void RegionCarrierMonthlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Monthly", "Cell", false);
    }
    @Test
    public void RegionCarrierMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "MonthlyBH", "Cell", false);
    }

    @Test
    public void RegionCarrierHourlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionCarrierDailyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Daily", "Cell", true);
    }
    @Test
    public void RegionCarrierDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "DailyBH", "Cell", true);
    }

    @Test
    public void RegionCarrierWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Weekly", "Cell", true);
    }

    @Test
    public void RegionCarrierWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "WeeklyBH", "Cell", true);
    }

    @Test
    public void RegionCarrierMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Monthly", "Cell", true);
    }
    @Test
    public void RegionCarrierMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "MonthlyBH", "Cell", true);
    }

    @Test
    public void RegionCarrierHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region Carrier", "Hourly", "Cell", true);
    }
}
