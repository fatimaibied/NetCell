package TestCases.PM.Nokia.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionXDDDailyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "Daily", false);
    }

    @Test
    public void RegionXDDDailyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "DailyBH", false);
    }

    @Test
    public void RegionXDDWeeklyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "Weekly", false);
    }

    @Test
    public void RegionXDDWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "WeeklyBH", false);
    }

    @Test
    public void RegionXDDMonthlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "Monthly", false);
    }
    @Test
    public void RegionXDDMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "MonthlyBH", false);
    }

    @Test
    public void RegionXDDHourlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionXDDDailyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "Daily", true);
    }
    @Test
    public void RegionXDDDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "DailyBH", true);
    }

    @Test
    public void RegionXDDWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "Weekly", true);
    }

    @Test
    public void RegionXDDWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "WeeklyBH", true);
    }

    @Test
    public void RegionXDDMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "Monthly", true);
    }
    @Test
    public void RegionXDDMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "MonthlyBH", true);
    }

    @Test
    public void RegionXDDHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Region XDD", "Hourly", true);
    }
}
