package TestCases.PM.Nokia.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionDailyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "Daily", "Cell", false);
    }

    @Test
    public void RegionDailyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "DailyBH", "Cell", false);
    }

    @Test
    public void RegionWeeklyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "Weekly", "Cell", false);
    }

    @Test
    public void RegionWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "WeeklyBH", "Cell", false);
    }

    @Test
    public void RegionMonthlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "Monthly", "Cell", false);
    }
    @Test
    public void RegionMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "MonthlyBH", "Cell", false);
    }

    @Test
    public void RegionHourlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionDailyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "Daily", "Cell", true);
    }
    @Test
    public void RegionDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "DailyBH", "Cell", true);
    }

    @Test
    public void RegionWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "Weekly", "Cell", true);
    }

    @Test
    public void RegionWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "WeeklyBH", "Cell", true);
    }

    @Test
    public void RegionMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "Monthly", "Cell", true);
    }
    @Test
    public void RegionMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "MonthlyBH", "Cell", true);
    }

    @Test
    public void RegionHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region", "Hourly", "Cell", true);
    }

}
