package TestCases.PM.Nokia.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", false,"Hourly", "All");
    }

    @Test
    public void SiteStatsAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", true,"Hourly", "All");
    }

    @Test
    public void SiteStatsDaily3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", false,"Daily", "All");
    }
    @Test
    public void SiteStatsDailyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", true,"Daily", "All");
    }
    @Test
    public void SiteStatsWeekly3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", false,"Weekly", "All");
    }
    @Test
    public void SiteStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", true,"Weekly", "All");
    }

    @Test
    public void SiteStatsMonthly3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", false,"Monthly", "All");
    }
    @Test
    public void SiteStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", true,"Monthly", "All");
    }
    @Test
    public void SiteStatsDailyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", false,"DailyBH", "All");
    }
    @Test
    public void SiteStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", true,"DailyBH", "All");
    }

    @Test
    public void SiteStatsWeeklyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", false,"WeeklyBH", "All");
    }
    @Test
    public void SiteStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", true,"WeeklyBH", "All");
    }

    @Test
    public void SiteStatsMonthlyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", false,"MonthlyBH", "All");
    }

    @Test
    public void SiteStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", true,"MonthlyBH", "All");
    }
    @Test
    public void SiteStatsRowAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Site", true,"Row", "All");
    }
}
