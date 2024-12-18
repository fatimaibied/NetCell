package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RNC extends MainClass {
    PM TopX= new PM();

    @Test
    public void RNCDailyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Daily", false);
    }

    @Test
    public void RNCDailyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "DailyBH", false);
    }

    @Test
    public void RNCWeeklyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Weekly", false);
    }

    @Test
    public void RNCWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "WeeklyBH", false);
    }

    @Test
    public void RNCMonthlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Monthly", false);
    }
    @Test
    public void RNCMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "MonthlyBH", false);
    }

    @Test
    public void RNCHourlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RNCDailyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Daily", true);
    }
    @Test
    public void RNCDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "DailyBH", true);
    }

    @Test
    public void RNCWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Weekly", true);
    }

    @Test
    public void RNCWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "WeeklyBH", true);
    }

    @Test
    public void RNCMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Monthly", true);
    }
    @Test
    public void RNCMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "MonthlyBH", true);
    }

    @Test
    public void RNCHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Hourly", true);
    }

}
