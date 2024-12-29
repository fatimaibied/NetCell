package TestCases.PM_Export.Nokia.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMN extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNDailyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Daily", false);
    }

    @Test
    public void PLMNDailyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "DailyBH", false);
    }

    @Test
    public void PLMNWeeklyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Weekly", false);
    }

    @Test
    public void PLMNWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "WeeklyBH", false);
    }

    @Test
    public void PLMNMonthlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Monthly", false);
    }
    @Test
    public void PLMNMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "MonthlyBH", false);
    }

    @Test
    public void PLMNHourlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNDailyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Daily", true);
    }
    @Test
    public void PLMNDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "DailyBH", true);
    }

    @Test
    public void PLMNWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Weekly", true);
    }

    @Test
    public void PLMNWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "WeeklyBH", true);
    }

    @Test
    public void PLMNMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Monthly", true);
    }
    @Test
    public void PLMNMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "MonthlyBH", true);
    }

    @Test
    public void PLMNHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "PLMN", "Hourly", true);
    }

}
