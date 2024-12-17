package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Site extends MainClass {

    PM State= new PM();

    @Test
    public void SiteStats4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"Hourly", "All");
    }

    @Test
    public void SiteStatsAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"Hourly", "All");
    }
    @Test
    public void SiteStatsDaily4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"Daily", "All");
    }
    @Test
    public void SiteStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"Daily", "All");
    }
    @Test
    public void SiteStatsWeekly4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"Weekly", "All");
    }
    @Test
    public void SiteStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"Weekly", "All");
    }

    @Test
    public void SiteStatsMonthly4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"Monthly", "All");
    }
    @Test
    public void SiteStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"Monthly", "All");
    }
    @Test
    public void SiteStatsDailyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"DailyBH", "All");
    }
    @Test
    public void SiteStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"DailyBH", "All");
    }

    @Test
    public void SiteStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"WeeklyBH", "All");
    }
    @Test
    public void SiteStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"WeeklyBH", "All");
    }

    @Test
    public void SiteStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei","4G", "Site", false,"MonthlyBH", "All");
    }

    @Test
    public void SiteStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei","4G", "Site", true,"MonthlyBH", "All");
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void SiteSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "Site", false,"Hourly", "DL_Traffic_GB");
    }

}
