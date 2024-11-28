package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {
    PM TopX= new PM();

    @Test
    public void CellDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "Daily", "Cell", false);
    }

    @Test
    public void CellDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "DailyBH", "Cell", false);
    }

    @Test
    public void CellWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "Weekly", "Cell", false);
    }

    @Test
    public void CellWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "WeeklyBH", "Cell", false);
    }

    @Test
    public void CellMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "Monthly", "Cell", false);
    }
    @Test
    public void CellMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "MonthlyBH", "Cell", false);
    }

    @Test
    public void CellHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void CellDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "Daily", "Cell", true);
    }
    @Test
    public void CellDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "DailyBH", "Cell", true);
    }

    @Test
    public void CellWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "Weekly", "Cell", true);
    }

    @Test
    public void CellWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "WeeklyBH", "Cell", true);
    }

    @Test
    public void CellMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "Monthly", "Cell", true);
    }
    @Test
    public void CellMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "MonthlyBH", "Cell", true);
    }

    @Test
    public void CellHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cell", "Hourly", "Cell", true);
    }

}
