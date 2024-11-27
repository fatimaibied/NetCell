package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"Hourly");
    }

    @Test
    public void SiteStatsAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"Hourly");
    }
    @Test
    public void SiteStatsDaily4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"Daily");
    }
    @Test
    public void SiteStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"Daily");
    }
    @Test
    public void SiteStatsWeekly4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"Weekly");
    }
    @Test
    public void SiteStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"Weekly");
    }

    @Test
    public void SiteStatsMonthly4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"Monthly");
    }
    @Test
    public void SiteStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"Monthly");
    }
    @Test
    public void SiteStatsDailyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"DailyBH");
    }
    @Test
    public void SiteStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"DailyBH");
    }

    @Test
    public void SiteStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"WeeklyBH");
    }
    @Test
    public void SiteStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"WeeklyBH");
    }

    @Test
    public void SiteStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"MonthlyBH");
    }

    @Test
    public void SiteStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"MonthlyBH");
    }

}
