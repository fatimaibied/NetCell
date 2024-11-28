package TestCases.PM.Nokia.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNDailyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "Daily", "Cell", false);
    }

    @Test
    public void PLMNDailyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "DailyBH", "Cell", false);
    }

    @Test
    public void PLMNWeeklyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "Weekly", "Cell", false);
    }

    @Test
    public void PLMNWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "WeeklyBH", "Cell", false);
    }

    @Test
    public void PLMNMonthlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "Monthly", "Cell", false);
    }
    @Test
    public void PLMNMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "MonthlyBH", "Cell", false);
    }

    @Test
    public void PLMNHourlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNDailyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "Daily", "Cell", true);
    }
    @Test
    public void PLMNDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "DailyBH", "Cell", true);
    }

    @Test
    public void PLMNWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "Weekly", "Cell", true);
    }

    @Test
    public void PLMNWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "WeeklyBH", "Cell", true);
    }

    @Test
    public void PLMNMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "Monthly", "Cell", true);
    }
    @Test
    public void PLMNMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "MonthlyBH", "Cell", true);
    }

    @Test
    public void PLMNHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN", "Hourly", "Cell", true);
    }

}
