package TestCases.PM_Export.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ClusterBand extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterBandStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"Hourly", "All", false);
    }

    @Test
    public void ClusterBandStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"Hourly", "All", false);
    }

    @Test
    public void ClusterBandStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"Daily", "All", false);
    }
    @Test
    public void ClusterBandStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"Daily", "All", false);
    }
    @Test
    public void ClusterBandStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"Weekly", "All", false);
    }
    @Test
    public void ClusterBandStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"Weekly", "All", false);
    }

    @Test
    public void ClusterBandStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"Monthly", "All", false);
    }
    @Test
    public void ClusterBandStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"Monthly", "All", false);
    }
    @Test
    public void ClusterBandStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"DailyBH", "All", false);
    }
    @Test
    public void ClusterBandStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"DailyBH", "All", false);
    }

    @Test
    public void ClusterBandStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"WeeklyBH", "All", false);
    }
    @Test
    public void ClusterBandStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"WeeklyBH", "All", false);
    }

    @Test
    public void ClusterBandStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", false,"MonthlyBH", "All", false);
    }

    @Test
    public void ClusterBandStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"MonthlyBH", "All", false);
    }
    @Test
    public void ClusterBandStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster Band", true,"Row", "All", false);
    }
}
