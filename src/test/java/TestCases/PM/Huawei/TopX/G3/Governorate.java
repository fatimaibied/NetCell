package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateDailyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "Daily", false);
    }

    @Test
    public void GovernorateDailyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "DailyBH", false);
    }

    @Test
    public void GovernorateWeeklyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "Weekly", false);
    }

    @Test
    public void GovernorateWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "WeeklyBH", false);
    }

    @Test
    public void GovernorateMonthlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "Monthly", false);
    }
    @Test
    public void GovernorateMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "MonthlyBH", false);
    }

    @Test
    public void GovernorateHourlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateDailyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "Daily", true);
    }
    @Test
    public void GovernorateDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "DailyBH", true);
    }

    @Test
    public void GovernorateWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "Weekly", true);
    }

    @Test
    public void GovernorateWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "WeeklyBH", true);
    }

    @Test
    public void GovernorateMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "Monthly", true);
    }
    @Test
    public void GovernorateMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "MonthlyBH", true);
    }

    @Test
    public void GovernorateHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Governorate", "Hourly", true);
    }
}
