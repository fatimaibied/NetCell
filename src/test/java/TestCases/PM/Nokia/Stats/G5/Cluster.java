package TestCases.PM.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Hourly");
    }

    @Test
    public void ClusterStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Hourly");
    }

    @Test
    public void ClusterStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Daily");
    }
    @Test
    public void ClusterStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Daily");
    }
    @Test
    public void ClusterStatsWeekly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Weekly");
    }
    @Test
    public void ClusterStatsWeeklyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Weekly");
    }

    @Test
    public void ClusterStatsMonthly5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Monthly");
    }
    @Test
    public void ClusterStatsMonthlyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Monthly");
    }
    @Test
    public void ClusterStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"DailyBH");
    }
    @Test
    public void ClusterStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"DailyBH");
    }

    @Test
    public void ClusterStatsWeeklyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"WeeklyBH");
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"WeeklyBH");
    }

    @Test
    public void ClusterStatsMonthlyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"MonthlyBH");
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"MonthlyBH");
    }
    @Test
    public void ClusterStatsRowAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Row");
    }
}
