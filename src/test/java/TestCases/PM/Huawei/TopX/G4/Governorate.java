package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Daily", "Cell", false);
    }

    @Test
    public void GovernorateDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "DailyBH", "Cell", false);
    }

    @Test
    public void GovernorateWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Weekly", "Cell", false);
    }

    @Test
    public void GovernorateWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "WeeklyBH", "Cell", false);
    }

    @Test
    public void GovernorateMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Monthly", "Cell", false);
    }
    @Test
    public void GovernorateMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "MonthlyBH", "Cell", false);
    }

    @Test
    public void GovernorateHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Daily", "Cell", true);
    }
    @Test
    public void GovernorateDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "DailyBH", "Cell", true);
    }

    @Test
    public void GovernorateWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Weekly", "Cell", true);
    }

    @Test
    public void GovernorateWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "WeeklyBH", "Cell", true);
    }

    @Test
    public void GovernorateMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Monthly", "Cell", true);
    }
    @Test
    public void GovernorateMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "MonthlyBH", "Cell", true);
    }

    @Test
    public void GovernorateHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate", "Hourly", "Cell", true);
    }
}
