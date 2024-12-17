package TestCases.PM.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStatsHourly2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"Hourly", "All");
    }

    @Test
    public void SiteStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"Hourly", "All");
    }

    @Test
    public void SiteStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"Daily", "All");
    }
    @Test
    public void SiteStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"Daily", "All");
    }
    @Test
    public void SiteStatsWeekly2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"Weekly", "All");
    }
    @Test
    public void SiteStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"Weekly", "All");
    }

    @Test
    public void SiteStatsMonthly2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"Monthly", "All");
    }
    @Test
    public void SiteStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"Monthly", "All");
    }
    @Test
    public void SiteStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"DailyBH", "All");
    }
    @Test
    public void SiteStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"DailyBH", "All");
    }

    @Test
    public void SiteStatsWeeklyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"WeeklyBH", "All");
    }
    @Test
    public void SiteStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"WeeklyBH", "All");
    }

    @Test
    public void SiteStatsMonthlyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"MonthlyBH", "All");
    }

    @Test
    public void SiteStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"MonthlyBH", "All");
    }
}
