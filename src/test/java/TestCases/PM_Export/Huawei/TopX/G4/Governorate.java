package TestCases.PM_Export.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Daily", false);
    }

    @Test
    public void GovernorateDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "DailyBH", false);
    }

    @Test
    public void GovernorateWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Weekly", false);
    }

    @Test
    public void GovernorateWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "WeeklyBH", false);
    }

    @Test
    public void GovernorateMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Monthly", false);
    }
    @Test
    public void GovernorateMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "MonthlyBH", false);
    }

    @Test
    public void GovernorateHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Daily", true);
    }
    @Test
    public void GovernorateDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "DailyBH", true);
    }

    @Test
    public void GovernorateWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Weekly", true);
    }

    @Test
    public void GovernorateWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "WeeklyBH", true);
    }

    @Test
    public void GovernorateMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Monthly", true);
    }
    @Test
    public void GovernorateMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "MonthlyBH", true);
    }

    @Test
    public void GovernorateHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Hourly", true);
    }
}
