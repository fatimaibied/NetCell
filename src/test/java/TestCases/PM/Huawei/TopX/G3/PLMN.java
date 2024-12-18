package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNDailyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "Daily", false);
    }

    @Test
    public void PLMNDailyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "DailyBH", false);
    }

    @Test
    public void PLMNWeeklyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "Weekly", false);
    }

    @Test
    public void PLMNWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "WeeklyBH", false);
    }

    @Test
    public void PLMNMonthlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "Monthly", false);
    }
    @Test
    public void PLMNMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "MonthlyBH", false);
    }

    @Test
    public void PLMNHourlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNDailyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "Daily", true);
    }
    @Test
    public void PLMNDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "DailyBH", true);
    }

    @Test
    public void PLMNWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "Weekly", true);
    }

    @Test
    public void PLMNWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "WeeklyBH", true);
    }

    @Test
    public void PLMNMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "Monthly", true);
    }
    @Test
    public void PLMNMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "MonthlyBH", true);
    }

    @Test
    public void PLMNHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "PLMN", "Hourly", true);
    }

}
