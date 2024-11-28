package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ClusterBand extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterBandStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"Hourly");
    }

    @Test
    public void ClusterBandStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"Hourly");
    }

    @Test
    public void ClusterBandStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"Daily");
    }
    @Test
    public void ClusterBandStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"Daily");
    }
    @Test
    public void ClusterBandStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"Weekly");
    }
    @Test
    public void ClusterBandStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"Weekly");
    }

    @Test
    public void ClusterBandStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"Monthly");
    }
    @Test
    public void ClusterBandStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"Monthly");
    }
    @Test
    public void ClusterBandStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"DailyBH");
    }
    @Test
    public void ClusterBandStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"DailyBH");
    }

    @Test
    public void ClusterBandStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"WeeklyBH");
    }
    @Test
    public void ClusterBandStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"WeeklyBH");
    }

    @Test
    public void ClusterBandStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"MonthlyBH");
    }

    @Test
    public void ClusterBandStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"MonthlyBH");
    }
    @Test
    public void ClusterBandStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"Row");
    }
}
