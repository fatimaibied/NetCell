package TestCases.PM_Export.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "Daily", false);
    }

    @Test
    public void PLMNDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "DailyBH", false);
    }

    @Test
    public void PLMNWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "Weekly", false);
    }

    @Test
    public void PLMNWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "WeeklyBH", false);
    }

    @Test
    public void PLMNMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "Monthly", false);
    }
    @Test
    public void PLMNMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "MonthlyBH", false);
    }

    @Test
    public void PLMNHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "Daily", true);
    }
    @Test
    public void PLMNDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "DailyBH", true);
    }

    @Test
    public void PLMNWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "Weekly", true);
    }

    @Test
    public void PLMNWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "WeeklyBH", true);
    }

    @Test
    public void PLMNMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "Monthly", true);
    }
    @Test
    public void PLMNMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "MonthlyBH", true);
    }

    @Test
    public void PLMNHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN", "Hourly", true);
    }

}
