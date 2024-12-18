package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {
    PM TopX= new PM();

    @Test
    public void CellDailyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "Daily", false);
    }

    @Test
    public void CellDailyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "DailyBH", false);
    }

    @Test
    public void CellWeeklyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "Weekly", false);
    }

    @Test
    public void CellWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "WeeklyBH", false);
    }

    @Test
    public void CellMonthlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "Monthly", false);
    }
    @Test
    public void CellMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "MonthlyBH", false);
    }

    @Test
    public void CellHourlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void CellDailyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "Daily", true);
    }
    @Test
    public void CellDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "DailyBH", true);
    }

    @Test
    public void CellWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "Weekly", true);
    }

    @Test
    public void CellWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "WeeklyBH", true);
    }

    @Test
    public void CellMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "Monthly", true);
    }
    @Test
    public void CellMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "MonthlyBH", true);
    }

    @Test
    public void CellHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cell", "Hourly", true);
    }

}
