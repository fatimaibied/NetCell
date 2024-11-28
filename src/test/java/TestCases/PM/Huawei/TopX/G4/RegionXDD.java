package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionXDD extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionXDDDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "Daily", "Cell", false);
    }

    @Test
    public void RegionXDDDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "DailyBH", "Cell", false);
    }

    @Test
    public void RegionXDDWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "Weekly", "Cell", false);
    }

    @Test
    public void RegionXDDWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "WeeklyBH", "Cell", false);
    }

    @Test
    public void RegionXDDMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "Monthly", "Cell", false);
    }
    @Test
    public void RegionXDDMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "MonthlyBH", "Cell", false);
    }

    @Test
    public void RegionXDDHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionXDDDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "Daily", "Cell", true);
    }
    @Test
    public void RegionXDDDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "DailyBH", "Cell", true);
    }

    @Test
    public void RegionXDDWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "Weekly", "Cell", true);
    }

    @Test
    public void RegionXDDWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "WeeklyBH", "Cell", true);
    }

    @Test
    public void RegionXDDMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "Monthly", "Cell", true);
    }
    @Test
    public void RegionXDDMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "MonthlyBH", "Cell", true);
    }

    @Test
    public void RegionXDDHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region XDD", "Hourly", "Cell", true);
    }
}
