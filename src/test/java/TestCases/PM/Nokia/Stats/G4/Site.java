package TestCases.PM.Nokia.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", false,"Hourly", "All", false);
    }

    @Test
    public void SiteStatsAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", true,"Hourly", "All", false);
    }

    @Test
    public void SiteStatsDaily4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", false,"Daily", "All", false);
    }
    @Test
    public void SiteStatsDailyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", true,"Daily", "All", false);
    }
    @Test
    public void SiteStatsWeekly4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", false,"Weekly", "All", false);
    }
    @Test
    public void SiteStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", true,"Weekly", "All", false);
    }

    @Test
    public void SiteStatsMonthly4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", false,"Monthly", "All", false);
    }
    @Test
    public void SiteStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", true,"Monthly", "All", false);
    }
    @Test
    public void SiteStatsDailyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", false,"DailyBH", "All", false);
    }
    @Test
    public void SiteStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", true,"DailyBH", "All", false);
    }

    @Test
    public void SiteStatsWeeklyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", false,"WeeklyBH", "All", false);
    }
    @Test
    public void SiteStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", true,"WeeklyBH", "All", false);
    }

    @Test
    public void SiteStatsMonthlyBH4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", false,"MonthlyBH", "All", false);
    }

    @Test
    public void SiteStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", true,"MonthlyBH", "All", false);
    }
    @Test
    public void SiteStatsRowAggregation4G() throws Exception {

        State.Stats("Nokia", "4G", "Site", true,"Row", "All", false);
    }
}
