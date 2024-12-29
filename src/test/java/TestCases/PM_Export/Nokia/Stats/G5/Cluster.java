package TestCases.PM_Export.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Hourly", "All", false);
    }

    @Test
    public void ClusterStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Hourly", "All", false);
    }

    @Test
    public void ClusterStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Daily", "All", false);
    }
    @Test
    public void ClusterStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Daily", "All", false);
    }
    @Test
    public void ClusterStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Weekly", "All", false);
    }
    @Test
    public void ClusterStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Weekly", "All", false);
    }

    @Test
    public void ClusterStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Monthly", "All", false);
    }
    @Test
    public void ClusterStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Monthly", "All", false);
    }
    @Test
    public void ClusterStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"DailyBH", "All", false);
    }
    @Test
    public void ClusterStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"DailyBH", "All", false);
    }

    @Test
    public void ClusterStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"WeeklyBH", "All", false);
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"WeeklyBH", "All", false);
    }

    @Test
    public void ClusterStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"MonthlyBH", "All", false);
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"MonthlyBH", "All", false);
    }
    @Test
    public void ClusterStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Row", "All", false);
    }
}
