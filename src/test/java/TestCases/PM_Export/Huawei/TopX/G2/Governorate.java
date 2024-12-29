package TestCases.PM_Export.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateDailyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Daily", false);
    }

    @Test
    public void GovernorateDailyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "DailyBH", false);
    }

    @Test
    public void GovernorateWeeklyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Weekly", false);
    }

    @Test
    public void GovernorateWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "WeeklyBH", false);
    }

    @Test
    public void GovernorateMonthlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Monthly", false);
    }
    @Test
    public void GovernorateMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "MonthlyBH", false);
    }

    @Test
    public void GovernorateHourlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateDailyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Daily", true);
    }
    @Test
    public void GovernorateDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "DailyBH", true);
    }

    @Test
    public void GovernorateWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Weekly", true);
    }

    @Test
    public void GovernorateWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "WeeklyBH", true);
    }

    @Test
    public void GovernorateMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Monthly", true);
    }
    @Test
    public void GovernorateMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "MonthlyBH", true);
    }

    @Test
    public void GovernorateHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Hourly", true);
    }

}
