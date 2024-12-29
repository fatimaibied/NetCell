package TestCases.PM_Export.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class PLMNXDD extends MainClass {
    PM TopX= new PM();

    @Test
    public void PLMNXDDDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "Daily", false);
    }

    @Test
    public void PLMNXDDDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "DailyBH", false);
    }

    @Test
    public void PLMNXDDWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "Weekly", false);
    }

    @Test
    public void PLMNXDDWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "WeeklyBH", false);
    }

    @Test
    public void PLMNXDDMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "Monthly", false);
    }
    @Test
    public void PLMNXDDMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "MonthlyBH", false);
    }

    @Test
    public void PLMNXDDHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void PLMNXDDDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "Daily", true);
    }
    @Test
    public void PLMNXDDDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "DailyBH", true);
    }

    @Test
    public void PLMNXDDWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "Weekly", true);
    }

    @Test
    public void PLMNXDDWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "WeeklyBH", true);
    }

    @Test
    public void PLMNXDDMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "Monthly", true);
    }
    @Test
    public void PLMNXDDMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "MonthlyBH", true);
    }

    @Test
    public void PLMNXDDHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "PLMN XDD", "Hourly", true);
    }

}
