package TestCases.PM.Nokia.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNDailyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "Daily", "Cell", false);
    }

    @Test
    public void PLMNDailyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "DailyBH", "Cell", false);
    }

    @Test
    public void PLMNWeeklyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "Weekly", "Cell", false);
    }

    @Test
    public void PLMNWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "WeeklyBH", "Cell", false);
    }

    @Test
    public void PLMNMonthlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "Monthly", "Cell", false);
    }
    @Test
    public void PLMNMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "MonthlyBH", "Cell", false);
    }

    @Test
    public void PLMNHourlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNDailyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "Daily", "Cell", true);
    }
    @Test
    public void PLMNDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "DailyBH", "Cell", true);
    }

    @Test
    public void PLMNWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "Weekly", "Cell", true);
    }

    @Test
    public void PLMNWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "WeeklyBH", "Cell", true);
    }

    @Test
    public void PLMNMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "Monthly", "Cell", true);
    }
    @Test
    public void PLMNMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "MonthlyBH", "Cell", true);
    }

    @Test
    public void PLMNHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "PLMN", "Hourly", "Cell", true);
    }

}
