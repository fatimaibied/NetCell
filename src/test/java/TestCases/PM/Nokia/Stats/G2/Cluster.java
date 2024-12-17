package TestCases.PM.Nokia.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"Hourly", "All");
    }

    @Test
    public void ClusterStatsAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"Hourly", "All");
    }

    @Test
    public void ClusterStatsDaily2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"Daily", "All");
    }
    @Test
    public void ClusterStatsDailyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"Daily", "All");
    }
    @Test
    public void ClusterStatsWeekly2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"Weekly", "All");
    }
    @Test
    public void ClusterStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"Weekly", "All");
    }

    @Test
    public void ClusterStatsMonthly2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"Monthly", "All");
    }
    @Test
    public void ClusterStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"Monthly", "All");
    }
    @Test
    public void ClusterStatsDailyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"DailyBH", "All");
    }
    @Test
    public void ClusterStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"DailyBH", "All");
    }

    @Test
    public void ClusterStatsWeeklyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"WeeklyBH", "All");
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"WeeklyBH", "All");
    }

    @Test
    public void ClusterStatsMonthlyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"MonthlyBH", "All");
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"MonthlyBH", "All");
    }
    @Test
    public void ClusterStatsRowAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"Raw", "All");
    }
}
