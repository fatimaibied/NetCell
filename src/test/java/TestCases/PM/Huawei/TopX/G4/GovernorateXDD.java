package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class GovernorateXDD extends MainClass {
    PM TopX= new PM();

    @Test
    public void GovernorateXDDDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "Daily", "Cell", false);
    }

    @Test
    public void GovernorateXDDDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "DailyBH", "Cell", false);
    }

    @Test
    public void GovernorateXDDWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "Weekly", "Cell", false);
    }

    @Test
    public void GovernorateXDDWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "WeeklyBH", "Cell", false);
    }

    @Test
    public void GovernorateXDDMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "Monthly", "Cell", false);
    }
    @Test
    public void GovernorateXDDMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "MonthlyBH", "Cell", false);
    }

    @Test
    public void GovernorateXDDHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void GovernorateXDDDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "Daily", "Cell", true);
    }
    @Test
    public void GovernorateXDDDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "DailyBH", "Cell", true);
    }

    @Test
    public void GovernorateXDDWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "Weekly", "Cell", true);
    }

    @Test
    public void GovernorateXDDWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "WeeklyBH", "Cell", true);
    }

    @Test
    public void GovernorateXDDMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "Monthly", "Cell", true);
    }
    @Test
    public void GovernorateXDDMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "MonthlyBH", "Cell", true);
    }

    @Test
    public void GovernorateXDDHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Governorate XDD", "Hourly", "Cell", true);
    }
}
