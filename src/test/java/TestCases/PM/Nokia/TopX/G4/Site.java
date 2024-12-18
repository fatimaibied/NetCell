package TestCases.PM.Nokia.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {
    PM TopX= new PM();

    @Test
    public void SiteDailyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "Daily", false);
    }

    @Test
    public void SiteDailyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "DailyBH", false);
    }

    @Test
    public void SiteWeeklyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "Weekly", false);
    }

    @Test
    public void SiteWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "WeeklyBH", false);
    }

    @Test
    public void SiteMonthlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "Monthly", false);
    }
    @Test
    public void SiteMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "MonthlyBH", false);
    }

    @Test
    public void SiteHourlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SiteDailyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "Daily", true);
    }
    @Test
    public void SiteDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "DailyBH", true);
    }

    @Test
    public void SiteWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "Weekly", true);
    }

    @Test
    public void SiteWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "WeeklyBH", true);
    }

    @Test
    public void SiteMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "Monthly", true);
    }
    @Test
    public void SiteMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "MonthlyBH", true);
    }

    @Test
    public void SiteHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Site", "Hourly", true);
    }

}
