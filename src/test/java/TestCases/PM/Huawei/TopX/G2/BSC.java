package TestCases.PM.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class BSC extends MainClass {
    PM TopX= new PM();

    @Test
    public void BSCDailyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Daily", "Cell", false);
    }

    @Test
    public void BSCDailyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "DailyBH", "Cell", false);
    }
    @Test
    public void BSCWeeklyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Weekly", "Cell", false);
    }

    @Test
    public void BSCWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "WeeklyBH", "Cell", false);
    }

    @Test
    public void BSCMonthlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Monthly", "Cell", false);
    }
    @Test
    public void BSCMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "MonthlyBH", "Cell", false);
    }

    @Test
    public void BSCHourlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void BSCDailyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Daily", "Cell", true);
    }
    @Test
    public void BSCDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "DailyBH", "Cell", true);
    }

    @Test
    public void BSCWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Weekly", "Cell", true);
    }

    @Test
    public void BSCWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "WeeklyBH", "Cell", true);
    }

    @Test
    public void BSCMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Monthly", "Cell", true);
    }
    @Test
    public void BSCMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "MonthlyBH", "Cell", true);
    }

    @Test
    public void BSCHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Hourly", "Cell", true);
    }

}
