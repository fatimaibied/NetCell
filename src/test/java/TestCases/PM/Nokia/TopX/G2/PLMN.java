package TestCases.PM.Nokia.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNDailyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Daily", "Cell", false);
    }

    @Test
    public void PLMNDailyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "DailyBH", "Cell", false);
    }

    @Test
    public void PLMNWeeklyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Weekly", "Cell", false);
    }

    @Test
    public void PLMNWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "WeeklyBH", "Cell", false);
    }

    @Test
    public void PLMNMonthlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Monthly", "Cell", false);
    }
    @Test
    public void PLMNMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "MonthlyBH", "Cell", false);
    }

    @Test
    public void PLMNHourlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNDailyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Daily", "Cell", true);
    }
    @Test
    public void PLMNDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "DailyBH", "Cell", true);
    }

    @Test
    public void PLMNWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Weekly", "Cell", true);
    }

    @Test
    public void PLMNWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "WeeklyBH", "Cell", true);
    }

    @Test
    public void PLMNMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Monthly", "Cell", true);
    }
    @Test
    public void PLMNMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "MonthlyBH", "Cell", true);
    }

    @Test
    public void PLMNHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Hourly", "Cell", true);
    }

}
