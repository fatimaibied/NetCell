package TestCases.PM.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Region extends MainClass {
    PM TopX= new PM();

    @Test
    public void RegionDailyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "Daily", "Cell", false);
    }

    @Test
    public void RegionDailyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "DailyBH", "Cell", false);
    }

    @Test
    public void RegionWeeklyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "Weekly", "Cell", false);
    }

    @Test
    public void RegionWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "WeeklyBH", "Cell", false);
    }

    @Test
    public void RegionMonthlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "Monthly", "Cell", false);
    }
    @Test
    public void RegionMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "MonthlyBH", "Cell", false);
    }

    @Test
    public void RegionHourlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void RegionDailyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "Daily", "Cell", true);
    }
    @Test
    public void RegionDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "DailyBH", "Cell", true);
    }

    @Test
    public void RegionWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "Weekly", "Cell", true);
    }

    @Test
    public void RegionWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "WeeklyBH", "Cell", true);
    }

    @Test
    public void RegionMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "Monthly", "Cell", true);
    }
    @Test
    public void RegionMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "MonthlyBH", "Cell", true);
    }

    @Test
    public void RegionHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Region", "Hourly", "Cell", true);
    }

}
