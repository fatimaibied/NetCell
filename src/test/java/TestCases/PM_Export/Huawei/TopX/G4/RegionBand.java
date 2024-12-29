package TestCases.PM_Export.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionBandDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Daily", false);
    }

    @Test
    public void RegionBandDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "DailyBH", false);
    }

    @Test
    public void RegionBandWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Weekly", false);
    }

    @Test
    public void RegionBandWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "WeeklyBH", false);
    }

    @Test
    public void RegionBandMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Monthly", false);
    }
    @Test
    public void RegionBandMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "MonthlyBH", false);
    }

    @Test
    public void RegionBandHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionBandDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Daily", true);
    }
    @Test
    public void RegionBandDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "DailyBH", true);
    }

    @Test
    public void RegionBandWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Weekly", true);
    }

    @Test
    public void RegionBandWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "WeeklyBH", true);
    }

    @Test
    public void RegionBandMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Monthly", true);
    }
    @Test
    public void RegionBandMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "MonthlyBH", true);
    }

    @Test
    public void RegionBandHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Hourly", true);
    }

}
