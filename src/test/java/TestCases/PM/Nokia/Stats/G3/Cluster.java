package TestCases.PM.Nokia.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"Hourly", "All");
    }

    @Test
    public void ClusterStatsAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"Hourly", "All");
    }

    @Test
    public void ClusterStatsDaily3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"Daily", "All");
    }
    @Test
    public void ClusterStatsDailyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"Daily", "All");
    }
    @Test
    public void ClusterStatsWeekly3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"Weekly", "All");
    }
    @Test
    public void ClusterStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"Weekly", "All");
    }

    @Test
    public void ClusterStatsMonthly3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"Monthly", "All");
    }
    @Test
    public void ClusterStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"Monthly", "All");
    }
    @Test
    public void ClusterStatsDailyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"DailyBH", "All");
    }
    @Test
    public void ClusterStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"DailyBH", "All");
    }

    @Test
    public void ClusterStatsWeeklyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"WeeklyBH", "All");
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"WeeklyBH", "All");
    }

    @Test
    public void ClusterStatsMonthlyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"MonthlyBH", "All");
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"MonthlyBH", "All");
    }
    @Test
    public void ClusterStatsRowAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"Row", "All");
    }
}
