package TestCases.PM.Nokia.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {
    PM TopX= new PM();

    @Test
    public void CellDailyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "Daily", "Cell", false);
    }

    @Test
    public void CellDailyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "DailyBH", "Cell", false);
    }

    @Test
    public void CellWeeklyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "Weekly", "Cell", false);
    }

    @Test
    public void CellWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "WeeklyBH", "Cell", false);
    }

    @Test
    public void CellMonthlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "Monthly", "Cell", false);
    }
    @Test
    public void CellMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "MonthlyBH", "Cell", false);
    }

    @Test
    public void CellHourlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void CellDailyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "Daily", "Cell", true);
    }
    @Test
    public void CellDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "DailyBH", "Cell", true);
    }

    @Test
    public void CellWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "Weekly", "Cell", true);
    }

    @Test
    public void CellWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "WeeklyBH", "Cell", true);
    }

    @Test
    public void CellMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "Monthly", "Cell", true);
    }
    @Test
    public void CellMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "MonthlyBH", "Cell", true);
    }

    @Test
    public void CellHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cell", "Hourly", "Cell", true);
    }

}
