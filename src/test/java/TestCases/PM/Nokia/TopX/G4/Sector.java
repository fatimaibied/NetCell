package TestCases.PM.Nokia.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Sector extends MainClass {
    PM TopX= new PM();

    @Test
    public void SectorDailyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "Daily", false);
    }

    @Test
    public void SectorDailyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "DailyBH", false);
    }

    @Test
    public void SectorWeeklyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "Weekly", false);
    }

    @Test
    public void SectorWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "WeeklyBH", false);
    }

    @Test
    public void SectorMonthlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "Monthly", false);
    }
    @Test
    public void SectorMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "MonthlyBH", false);
    }

    @Test
    public void SectorHourlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SectorDailyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "Daily", true);
    }
    @Test
    public void SectorDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "DailyBH", true);
    }

    @Test
    public void SectorWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "Weekly", true);
    }

    @Test
    public void SectorWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "WeeklyBH", true);
    }

    @Test
    public void SectorMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "Monthly", true);
    }
    @Test
    public void SectorMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "MonthlyBH", true);
    }

    @Test
    public void SectorHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Sector", "Hourly", true);
    }
}
