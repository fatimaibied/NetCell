package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {
    PM TopX= new PM();

    @Test
    public void SectorDailyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Daily", "Cell", false);
    }

    @Test
    public void SectorDailyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "DailyBH", "Cell", false);
    }

    @Test
    public void SectorWeeklyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Weekly", "Cell", false);
    }

    @Test
    public void SectorWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "WeeklyBH", "Cell", false);
    }

    @Test
    public void SectorMonthlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Monthly", "Cell", false);
    }
    @Test
    public void SectorMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "MonthlyBH", "Cell", false);
    }

    @Test
    public void SectorHourlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SectorDailyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Daily", "Cell", true);
    }
    @Test
    public void SectorDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "DailyBH", "Cell", true);
    }

    @Test
    public void SectorWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Weekly", "Cell", true);
    }

    @Test
    public void SectorWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "WeeklyBH", "Cell", true);
    }

    @Test
    public void SectorMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Monthly", "Cell", true);
    }
    @Test
    public void SectorMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "MonthlyBH", "Cell", true);
    }

    @Test
    public void SectorHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Hourly", "Cell", true);
    }

}
