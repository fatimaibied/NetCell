package TestCases.PM.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStatsHourly2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"Hourly");
    }

    @Test
    public void SiteStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"Hourly");
    }

    @Test
    public void SiteStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"Daily");
    }
    @Test
    public void SiteStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"Daily");
    }
    @Test
    public void SiteStatsWeekly2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"Weekly");
    }
    @Test
    public void SiteStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"Weekly");
    }

    @Test
    public void SiteStatsMonthly2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"Monthly");
    }
    @Test
    public void SiteStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"Monthly");
    }
    @Test
    public void SiteStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"DailyBH");
    }
    @Test
    public void SiteStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"DailyBH");
    }

    @Test
    public void SiteStatsWeeklyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"WeeklyBH");
    }
    @Test
    public void SiteStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"WeeklyBH");
    }

    @Test
    public void SiteStatsMonthlyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Site", false,"MonthlyBH");
    }

    @Test
    public void SiteStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Site", true,"MonthlyBH");
    }
}
