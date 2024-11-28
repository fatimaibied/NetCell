package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {
    PM TopX= new PM();

    @Test
    public void SectorDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "Daily", "Cell", false);
    }

    @Test
    public void SectorDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "DailyBH", "Cell", false);
    }

    @Test
    public void SectorWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "Weekly", "Cell", false);
    }

    @Test
    public void SectorWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "WeeklyBH", "Cell", false);
    }

    @Test
    public void SectorMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "Monthly", "Cell", false);
    }
    @Test
    public void SectorMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "MonthlyBH", "Cell", false);
    }

    @Test
    public void SectorHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SectorDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "Daily", "Cell", true);
    }
    @Test
    public void SectorDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "DailyBH", "Cell", true);
    }

    @Test
    public void SectorWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "Weekly", "Cell", true);
    }

    @Test
    public void SectorWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "WeeklyBH", "Cell", true);
    }

    @Test
    public void SectorMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "Monthly", "Cell", true);
    }
    @Test
    public void SectorMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "MonthlyBH", "Cell", true);
    }

    @Test
    public void SectorHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Sector", "Hourly", "Cell", true);
    }
}
