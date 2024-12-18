package TestCases.PM.Nokia.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {
    PM TopX= new PM();

    @Test
    public void CellDailyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "Daily", false);
    }

    @Test
    public void CellDailyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "DailyBH", false);
    }

    @Test
    public void CellWeeklyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "Weekly", false);
    }

    @Test
    public void CellWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "WeeklyBH", false);
    }

    @Test
    public void CellMonthlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "Monthly", false);
    }
    @Test
    public void CellMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "MonthlyBH", false);
    }

    @Test
    public void CellHourlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void CellDailyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "Daily", true);
    }
    @Test
    public void CellDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "DailyBH", true);
    }

    @Test
    public void CellWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "Weekly", true);
    }

    @Test
    public void CellWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "WeeklyBH", true);
    }

    @Test
    public void CellMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "Monthly", true);
    }
    @Test
    public void CellMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "MonthlyBH", true);
    }

    @Test
    public void CellHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cell", "Hourly", true);
    }

}
