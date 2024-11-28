package TestCases.PM.Nokia.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cell extends MainClass {
    PM TopX= new PM();

    @Test
    public void CellDailyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "Daily", "Cell", false);
    }

    @Test
    public void CellDailyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "DailyBH", "Cell", false);
    }

    @Test
    public void CellWeeklyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "Weekly", "Cell", false);
    }

    @Test
    public void CellWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "WeeklyBH", "Cell", false);
    }

    @Test
    public void CellMonthlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "Monthly", "Cell", false);
    }
    @Test
    public void CellMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "MonthlyBH", "Cell", false);
    }

    @Test
    public void CellHourlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void CellDailyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "Daily", "Cell", true);
    }
    @Test
    public void CellDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "DailyBH", "Cell", true);
    }

    @Test
    public void CellWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "Weekly", "Cell", true);
    }

    @Test
    public void CellWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "WeeklyBH", "Cell", true);
    }

    @Test
    public void CellMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "Monthly", "Cell", true);
    }
    @Test
    public void CellMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "MonthlyBH", "Cell", true);
    }

    @Test
    public void CellHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cell", "Hourly", "Cell", true);
    }

}
