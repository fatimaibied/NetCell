package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "Daily", false);
    }

    @Test
    public void RegionDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "DailyBH", false);
    }

    @Test
    public void RegionWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "Weekly", false);
    }

    @Test
    public void RegionWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "WeeklyBH", false);
    }

    @Test
    public void RegionMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "Monthly", false);
    }
    @Test
    public void RegionMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "MonthlyBH", false);
    }

    @Test
    public void RegionHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "Daily", true);
    }
    @Test
    public void RegionDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "DailyBH", true);
    }

    @Test
    public void RegionWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "Weekly", true);
    }

    @Test
    public void RegionWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "WeeklyBH", true);
    }

    @Test
    public void RegionMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "Monthly", true);
    }
    @Test
    public void RegionMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "MonthlyBH", true);
    }

    @Test
    public void RegionHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region", "Hourly", true);
    }

}
