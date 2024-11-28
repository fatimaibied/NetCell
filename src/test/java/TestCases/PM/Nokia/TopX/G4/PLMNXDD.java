package TestCases.PM.Nokia.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNXDDDailyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "Daily", "Cell", false);
    }

    @Test
    public void PLMNXDDDailyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "DailyBH", "Cell", false);
    }

    @Test
    public void PLMNXDDWeeklyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "Weekly", "Cell", false);
    }

    @Test
    public void PLMNXDDWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "WeeklyBH", "Cell", false);
    }

    @Test
    public void PLMNXDDMonthlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "Monthly", "Cell", false);
    }
    @Test
    public void PLMNXDDMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "MonthlyBH", "Cell", false);
    }

    @Test
    public void PLMNXDDHourlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNXDDDailyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "Daily", "Cell", true);
    }
    @Test
    public void PLMNXDDDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "DailyBH", "Cell", true);
    }

    @Test
    public void PLMNXDDWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "Weekly", "Cell", true);
    }

    @Test
    public void PLMNXDDWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "WeeklyBH", "Cell", true);
    }

    @Test
    public void PLMNXDDMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "Monthly", "Cell", true);
    }
    @Test
    public void PLMNXDDMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "MonthlyBH", "Cell", true);
    }

    @Test
    public void PLMNXDDHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "PLMN XDD", "Hourly", "Cell", true);
    }

}
