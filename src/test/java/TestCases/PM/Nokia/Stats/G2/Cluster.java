package TestCases.PM.Nokia.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"Hourly");
    }

    @Test
    public void ClusterStatsAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"Hourly");
    }

    @Test
    public void ClusterStatsDaily2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"Daily");
    }
    @Test
    public void ClusterStatsDailyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"Daily");
    }
    @Test
    public void ClusterStatsWeekly2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"Weekly");
    }
    @Test
    public void ClusterStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"Weekly");
    }

    @Test
    public void ClusterStatsMonthly2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"Monthly");
    }
    @Test
    public void ClusterStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"Monthly");
    }
    @Test
    public void ClusterStatsDailyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"DailyBH");
    }
    @Test
    public void ClusterStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"DailyBH");
    }

    @Test
    public void ClusterStatsWeeklyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"WeeklyBH");
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"WeeklyBH");
    }

    @Test
    public void ClusterStatsMonthlyBH2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", false,"MonthlyBH");
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"MonthlyBH");
    }
    @Test
    public void ClusterStatsRowAggregation2G() throws Exception {

        State.Stats("Nokia", "2G", "Cluster", true,"Raw");
    }
}
