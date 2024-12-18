package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"Hourly", "All", false);
    }

    @Test
    public void SiteStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"Hourly", "All", false);
    }

    @Test
    public void SiteStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"Daily", "All", false);
    }
    @Test
    public void SiteStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"Daily", "All", false);
    }
    @Test
    public void SiteStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"Weekly", "All", false);
    }
    @Test
    public void SiteStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"Weekly", "All", false);
    }

    @Test
    public void SiteStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"Monthly", "All", false);
    }
    @Test
    public void SiteStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"Monthly", "All", false);
    }
    @Test
    public void SiteStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"DailyBH", "All", false);
    }
    @Test
    public void SiteStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"DailyBH", "All", false);
    }

    @Test
    public void SiteStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"WeeklyBH", "All", false);
    }
    @Test
    public void SiteStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"WeeklyBH", "All", false);
    }

    @Test
    public void SiteStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", false,"MonthlyBH", "All", false);
    }

    @Test
    public void SiteStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"MonthlyBH", "All", false);
    }
    @Test
    public void SiteStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Site", true,"Row", "All", false);
    }
}
