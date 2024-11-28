package TestCases.PM.Nokia.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionDailyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Daily", "Cell", false);
    }

    @Test
    public void RegionDailyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "DailyBH", "Cell", false);
    }

    @Test
    public void RegionWeeklyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Weekly", "Cell", false);
    }

    @Test
    public void RegionWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "WeeklyBH", "Cell", false);
    }

    @Test
    public void RegionMonthlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Monthly", "Cell", false);
    }
    @Test
    public void RegionMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "MonthlyBH", "Cell", false);
    }

    @Test
    public void RegionHourlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionDailyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Daily", "Cell", true);
    }
    @Test
    public void RegionDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "DailyBH", "Cell", true);
    }

    @Test
    public void RegionWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Weekly", "Cell", true);
    }

    @Test
    public void RegionWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "WeeklyBH", "Cell", true);
    }

    @Test
    public void RegionMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Monthly", "Cell", true);
    }
    @Test
    public void RegionMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "MonthlyBH", "Cell", true);
    }

    @Test
    public void RegionHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Region", "Hourly", "Cell", true);
    }

}
