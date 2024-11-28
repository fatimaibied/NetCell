package TestCases.PM.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateDailyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Daily", "Cell", false);
    }

    @Test
    public void GovernorateDailyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "DailyBH", "Cell", false);
    }

    @Test
    public void GovernorateWeeklyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Weekly", "Cell", false);
    }

    @Test
    public void GovernorateWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "WeeklyBH", "Cell", false);
    }

    @Test
    public void GovernorateMonthlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Monthly", "Cell", false);
    }
    @Test
    public void GovernorateMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "MonthlyBH", "Cell", false);
    }

    @Test
    public void GovernorateHourlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateDailyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Daily", "Cell", true);
    }
    @Test
    public void GovernorateDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "DailyBH", "Cell", true);
    }

    @Test
    public void GovernorateWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Weekly", "Cell", true);
    }

    @Test
    public void GovernorateWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "WeeklyBH", "Cell", true);
    }

    @Test
    public void GovernorateMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Monthly", "Cell", true);
    }
    @Test
    public void GovernorateMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "MonthlyBH", "Cell", true);
    }

    @Test
    public void GovernorateHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Governorate", "Hourly", "Cell", true);
    }

}
