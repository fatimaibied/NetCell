package TestCases.PM.Nokia.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionDailyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Daily", false);
    }

    @Test
    public void RegionDailyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "DailyBH", false);
    }

    @Test
    public void RegionWeeklyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Weekly", false);
    }

    @Test
    public void RegionWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "WeeklyBH", false);
    }

    @Test
    public void RegionMonthlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Monthly", false);
    }
    @Test
    public void RegionMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "MonthlyBH", false);
    }

    @Test
    public void RegionHourlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionDailyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Daily", true);
    }
    @Test
    public void RegionDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "DailyBH", true);
    }

    @Test
    public void RegionWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Weekly", true);
    }

    @Test
    public void RegionWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "WeeklyBH", true);
    }

    @Test
    public void RegionMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Monthly", true);
    }
    @Test
    public void RegionMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "MonthlyBH", true);
    }

    @Test
    public void RegionHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Hourly", true);
    }

}
