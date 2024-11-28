package TestCases.PM.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {
    PM TopX= new PM();

    @Test
    public void SiteDailyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "Daily", "Cell", false);
    }

    @Test
    public void SiteDailyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "DailyBH", "Cell", false);
    }

    @Test
    public void SiteWeeklyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "Weekly", "Cell", false);
    }

    @Test
    public void SiteWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "WeeklyBH", "Cell", false);
    }

    @Test
    public void SiteMonthlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "Monthly", "Cell", false);
    }
    @Test
    public void SiteMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "MonthlyBH", "Cell", false);
    }

    @Test
    public void SiteHourlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void SiteDailyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "Daily", "Cell", true);
    }
    @Test
    public void SiteDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "DailyBH", "Cell", true);
    }

    @Test
    public void SiteWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "Weekly", "Cell", true);
    }

    @Test
    public void SiteWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "WeeklyBH", "Cell", true);
    }

    @Test
    public void SiteMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "Monthly", "Cell", true);
    }
    @Test
    public void SiteMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "MonthlyBH", "Cell", true);
    }

    @Test
    public void SiteHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Site", "Hourly", "Cell", true);
    }

}
