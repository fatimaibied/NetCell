package TestCases.PM_Export.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {
    PM TopX= new PM();

    @Test
    public void SectorDailyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Daily", false);
    }

    @Test
    public void SectorDailyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "DailyBH", false);
    }

    @Test
    public void SectorWeeklyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Weekly", false);
    }

    @Test
    public void SectorWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "WeeklyBH", false);
    }

    @Test
    public void SectorMonthlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Monthly", false);
    }
    @Test
    public void SectorMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "MonthlyBH", false);
    }

    @Test
    public void SectorHourlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SectorDailyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Daily", true);
    }
    @Test
    public void SectorDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "DailyBH", true);
    }

    @Test
    public void SectorWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Weekly", true);
    }

    @Test
    public void SectorWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "WeeklyBH", true);
    }

    @Test
    public void SectorMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Monthly", true);
    }
    @Test
    public void SectorMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "MonthlyBH", true);
    }

    @Test
    public void SectorHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Sector", "Hourly", true);
    }

}
