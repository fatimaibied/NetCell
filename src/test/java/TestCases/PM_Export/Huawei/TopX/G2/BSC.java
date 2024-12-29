package TestCases.PM_Export.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class BSC extends MainClass {
    PM TopX= new PM();

    @Test
    public void BSCDailyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Daily", false);
    }

    @Test
    public void BSCDailyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "DailyBH", false);
    }
    @Test
    public void BSCWeeklyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Weekly", false);
    }

    @Test
    public void BSCWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "WeeklyBH", false);
    }

    @Test
    public void BSCMonthlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Monthly", false);
    }
    @Test
    public void BSCMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "MonthlyBH", false);
    }

    @Test
    public void BSCHourlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void BSCDailyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Daily", true);
    }
    @Test
    public void BSCDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "DailyBH", true);
    }

    @Test
    public void BSCWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Weekly", true);
    }

    @Test
    public void BSCWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "WeeklyBH", true);
    }

    @Test
    public void BSCMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Monthly", true);
    }
    @Test
    public void BSCMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "MonthlyBH", true);
    }

    @Test
    public void BSCHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "BSC", "Hourly", true);
    }

}
