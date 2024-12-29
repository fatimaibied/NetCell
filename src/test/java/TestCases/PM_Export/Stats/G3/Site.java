package TestCases.PM_Export.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"Hourly", "All", false);
    }

    @Test
    public void SiteStatsAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Hourly", "All", false);
    }
    @Test
    public void SiteStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"Daily", "All", false);
    }
    @Test
    public void SiteStatsDailyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Daily", "All", false);
    }
    @Test
    public void SiteStatsWeekly3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"Weekly", "All", false);
    }
    @Test
    public void SiteStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Weekly", "All", false);
    }

    @Test
    public void SiteStatsMonthly3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"Monthly", "All", false);
    }
    @Test
    public void SiteStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Monthly", "All", false);
    }
    @Test
    public void SiteStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"DailyBH", "All", false);
    }
    @Test
    public void SiteStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"DailyBH", "All", false);
    }

    @Test
    public void SiteStatsWeeklyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"WeeklyBH", "All", false);
    }
    @Test
    public void SiteStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"WeeklyBH", "All", false);
    }

    @Test
    public void SiteStatsMonthlyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"MonthlyBH", "All", false);
    }

    @Test
    public void SiteStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"MonthlyBH", "All", false);
    }

    @Test
    public void SiteStatsRawAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Raw", "All", false);
    }
    @Test
    public void SiteStatsRaw3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Raw", "All", false);
    }
}
