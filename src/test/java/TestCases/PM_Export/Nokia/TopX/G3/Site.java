package TestCases.PM_Export.Nokia.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {
    PM TopX= new PM();

    @Test
    public void SiteDailyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "Daily", false);
    }

    @Test
    public void SiteDailyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "DailyBH", false);
    }

    @Test
    public void SiteWeeklyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "Weekly", false);
    }

    @Test
    public void SiteWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "WeeklyBH", false);
    }

    @Test
    public void SiteMonthlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "Monthly", false);
    }
    @Test
    public void SiteMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "MonthlyBH", false);
    }

    @Test
    public void SiteHourlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SiteDailyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "Daily", true);
    }
    @Test
    public void SiteDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "DailyBH", true);
    }

    @Test
    public void SiteWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "Weekly", true);
    }

    @Test
    public void SiteWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "WeeklyBH", true);
    }

    @Test
    public void SiteMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "Monthly", true);
    }
    @Test
    public void SiteMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "MonthlyBH", true);
    }

    @Test
    public void SiteHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Site", "Hourly", true);
    }

}
