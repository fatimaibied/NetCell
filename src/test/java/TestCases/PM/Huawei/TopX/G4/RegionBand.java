package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RegionBand extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionBandDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Daily", "Cell", false);
    }

    @Test
    public void RegionBandDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "DailyBH", "Cell", false);
    }

    @Test
    public void RegionBandWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Weekly", "Cell", false);
    }

    @Test
    public void RegionBandWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "WeeklyBH", "Cell", false);
    }

    @Test
    public void RegionBandMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Monthly", "Cell", false);
    }
    @Test
    public void RegionBandMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "MonthlyBH", "Cell", false);
    }

    @Test
    public void RegionBandHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionBandDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Daily", "Cell", true);
    }
    @Test
    public void RegionBandDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "DailyBH", "Cell", true);
    }

    @Test
    public void RegionBandWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Weekly", "Cell", true);
    }

    @Test
    public void RegionBandWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "WeeklyBH", "Cell", true);
    }

    @Test
    public void RegionBandMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Monthly", "Cell", true);
    }
    @Test
    public void RegionBandMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "MonthlyBH", "Cell", true);
    }

    @Test
    public void RegionBandHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Region Band", "Hourly", "Cell", true);
    }

}
