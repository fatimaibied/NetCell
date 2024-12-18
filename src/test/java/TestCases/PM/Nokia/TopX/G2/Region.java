package TestCases.PM.Nokia.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionDailyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "Daily", false);
    }

    @Test
    public void RegionDailyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "DailyBH", false);
    }

    @Test
    public void RegionWeeklyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "Weekly", false);
    }

    @Test
    public void RegionWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "WeeklyBH", false);
    }

    @Test
    public void RegionMonthlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "Monthly", false);
    }
    @Test
    public void RegionMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "MonthlyBH", false);
    }

    @Test
    public void RegionHourlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionDailyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "Daily", true);
    }
    @Test
    public void RegionDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "DailyBH", true);
    }

    @Test
    public void RegionWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "Weekly", true);
    }

    @Test
    public void RegionWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "WeeklyBH", true);
    }

    @Test
    public void RegionMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "Monthly", true);
    }
    @Test
    public void RegionMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "MonthlyBH", true);
    }

    @Test
    public void RegionHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Region", "Hourly", true);
    }

}
