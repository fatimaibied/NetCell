package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Hourly", "All");
    }

    @Test
    public void ClusterStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Hourly", "All");
    }

    @Test
    public void ClusterStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Daily", "All");
    }
    @Test
    public void ClusterStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Daily", "All");
    }
    @Test
    public void ClusterStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Weekly", "All");
    }
    @Test
    public void ClusterStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Weekly", "All");
    }

    @Test
    public void ClusterStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Monthly", "All");
    }
    @Test
    public void ClusterStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Monthly", "All");
    }
    @Test
    public void ClusterStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"DailyBH", "All");
    }
    @Test
    public void ClusterStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"DailyBH", "All");
    }

    @Test
    public void ClusterStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"WeeklyBH", "All");
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"WeeklyBH", "All");
    }

    @Test
    public void ClusterStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"MonthlyBH", "All");
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"MonthlyBH", "All");
    }
    @Test
    public void ClusterStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Row", "All");
    }
}
