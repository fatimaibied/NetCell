package TestCases.PM.Mix.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"Hourly");
    }

    @Test
    public void SiteStatsAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Hourly");
    }
    @Test
    public void SiteStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"Daily");
    }
    @Test
    public void SiteStatsDailyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Daily");
    }
    @Test
    public void SiteStatsWeekly3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"Weekly");
    }
    @Test
    public void SiteStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Weekly");
    }

    @Test
    public void SiteStatsMonthly3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"Monthly");
    }
    @Test
    public void SiteStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Monthly");
    }
    @Test
    public void SiteStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"DailyBH");
    }
    @Test
    public void SiteStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"DailyBH");
    }

    @Test
    public void SiteStatsWeeklyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"WeeklyBH");
    }
    @Test
    public void SiteStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"WeeklyBH");
    }

    @Test
    public void SiteStatsMonthlyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Site", false,"MonthlyBH");
    }

    @Test
    public void SiteStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"MonthlyBH");
    }

    @Test
    public void SiteStatsRawAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Raw");
    }
    @Test
    public void SiteStatsRaw3G() throws Exception {

        State.Stats("Mix", "3G", "Site", true,"Raw");
    }
}
