package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class GovernorateBand extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateBandDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "Daily", false);
    }

    @Test
    public void GovernorateBandDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "DailyBH", false);
    }

    @Test
    public void GovernorateBandWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "Weekly", false);
    }

    @Test
    public void GovernorateBandWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "WeeklyBH", false);
    }

    @Test
    public void GovernorateBandMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "Monthly", false);
    }
    @Test
    public void GovernorateBandMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "MonthlyBH", false);
    }

    @Test
    public void GovernorateBandHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateBandDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "Daily", true);
    }
    @Test
    public void GovernorateBandDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "DailyBH", true);
    }

    @Test
    public void GovernorateBandWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "Weekly", true);
    }

    @Test
    public void GovernorateBandWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "WeeklyBH", true);
    }

    @Test
    public void GovernorateBandMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "Monthly", true);
    }
    @Test
    public void GovernorateBandMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "MonthlyBH", true);
    }

    @Test
    public void GovernorateBandHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate Band", "Hourly", true);
    }
}
