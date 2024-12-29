package TestCases.PM_Export.Nokia.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", false,"Hourly", "All", false);
    }

    @Test
    public void SiteStatsAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", true,"Hourly", "All", false);
    }

    @Test
    public void SiteStatsDaily2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", false,"Daily", "All", false);
    }
    @Test
    public void SiteStatsDailyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", true,"Daily", "All", false);
    }
    @Test
    public void SiteStatsWeekly2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", false,"Weekly", "All", false);
    }
    @Test
    public void SiteStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", true,"Weekly", "All", false);
    }

    @Test
    public void SiteStatsMonthly2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", false,"Monthly", "All", false);
    }
    @Test
    public void SiteStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", true,"Monthly", "All", false);
    }
    @Test
    public void SiteStatsDailyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", false,"DailyBH", "All", false);
    }
    @Test
    public void SiteStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", true,"DailyBH", "All", false);
    }

    @Test
    public void SiteStatsWeeklyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", false,"WeeklyBH", "All", false);
    }
    @Test
    public void SiteStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", true,"WeeklyBH", "All", false);
    }

    @Test
    public void SiteStatsMonthlyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", false,"MonthlyBH", "All", false);
    }

    @Test
    public void SiteStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", true,"MonthlyBH", "All", false);
    }
    @Test
    public void SiteStatsRawAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Site", true,"Raw", "All", false);
    }
}
