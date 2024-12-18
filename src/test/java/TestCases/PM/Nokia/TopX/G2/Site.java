package TestCases.PM.Nokia.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {
    PM TopX= new PM();

    @Test
    public void SiteDailyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "Daily", false);
    }

    @Test
    public void SiteDailyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "DailyBH", false);
    }

    @Test
    public void SiteWeeklyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "Weekly", false);
    }

    @Test
    public void SiteWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "WeeklyBH", false);
    }

    @Test
    public void SiteMonthlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "Monthly", false);
    }
    @Test
    public void SiteMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "MonthlyBH", false);
    }

    @Test
    public void SiteHourlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SiteDailyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "Daily", true);
    }
    @Test
    public void SiteDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "DailyBH", true);
    }

    @Test
    public void SiteWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "Weekly", true);
    }

    @Test
    public void SiteWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "WeeklyBH", true);
    }

    @Test
    public void SiteMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "Monthly", true);
    }
    @Test
    public void SiteMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "MonthlyBH", true);
    }

    @Test
    public void SiteHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Site", "Hourly", true);
    }

}
