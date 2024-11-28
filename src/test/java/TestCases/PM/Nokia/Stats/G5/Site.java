package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"Hourly");
    }

    @Test
    public void SiteStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"Hourly");
    }

    @Test
    public void SiteStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"Daily");
    }
    @Test
    public void SiteStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"Daily");
    }
    @Test
    public void SiteStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"Weekly");
    }
    @Test
    public void SiteStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"Weekly");
    }

    @Test
    public void SiteStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"Monthly");
    }
    @Test
    public void SiteStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"Monthly");
    }
    @Test
    public void SiteStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"DailyBH");
    }
    @Test
    public void SiteStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"DailyBH");
    }

    @Test
    public void SiteStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"WeeklyBH");
    }
    @Test
    public void SiteStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"WeeklyBH");
    }

    @Test
    public void SiteStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"MonthlyBH");
    }

    @Test
    public void SiteStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"MonthlyBH");
    }
    @Test
    public void SiteStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"Row");
    }
}
