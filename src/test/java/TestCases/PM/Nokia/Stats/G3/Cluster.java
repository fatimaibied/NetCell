package TestCases.PM.Nokia.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"Hourly");
    }

    @Test
    public void ClusterStatsAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"Hourly");
    }

    @Test
    public void ClusterStatsDaily3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"Daily");
    }
    @Test
    public void ClusterStatsDailyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"Daily");
    }
    @Test
    public void ClusterStatsWeekly3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"Weekly");
    }
    @Test
    public void ClusterStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"Weekly");
    }

    @Test
    public void ClusterStatsMonthly3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"Monthly");
    }
    @Test
    public void ClusterStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"Monthly");
    }
    @Test
    public void ClusterStatsDailyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"DailyBH");
    }
    @Test
    public void ClusterStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"DailyBH");
    }

    @Test
    public void ClusterStatsWeeklyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"WeeklyBH");
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"WeeklyBH");
    }

    @Test
    public void ClusterStatsMonthlyBH3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", false,"MonthlyBH");
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"MonthlyBH");
    }
    @Test
    public void ClusterStatsRowAggregation3G() throws Exception {

        State.Stats("Nokia", "3G", "Cluster", true,"Row");
    }
}
