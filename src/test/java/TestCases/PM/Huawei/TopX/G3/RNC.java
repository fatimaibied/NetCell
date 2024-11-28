package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RNC extends MainClass {
    PM TopX= new PM();

    @Test
    public void RNCDailyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Daily", "Cell", false);
    }

    @Test
    public void RNCDailyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "DailyBH", "Cell", false);
    }

    @Test
    public void RNCWeeklyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Weekly", "Cell", false);
    }

    @Test
    public void RNCWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "WeeklyBH", "Cell", false);
    }

    @Test
    public void RNCMonthlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Monthly", "Cell", false);
    }
    @Test
    public void RNCMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "MonthlyBH", "Cell", false);
    }

    @Test
    public void RNCHourlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RNCDailyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Daily", "Cell", true);
    }
    @Test
    public void RNCDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "DailyBH", "Cell", true);
    }

    @Test
    public void RNCWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Weekly", "Cell", true);
    }

    @Test
    public void RNCWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "WeeklyBH", "Cell", true);
    }

    @Test
    public void RNCMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Monthly", "Cell", true);
    }
    @Test
    public void RNCMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "MonthlyBH", "Cell", true);
    }

    @Test
    public void RNCHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "RNC", "Hourly", "Cell", true);
    }

}
