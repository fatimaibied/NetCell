package TestCases.PM_Export.Nokia.Stats.G5;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Hourly", "All", true);
    }

    @Test
    public void ClusterStatsAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Hourly", "All", true);
    }

    @Test
    public void ClusterStatsDaily5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"Daily", "All", true);
    }
    @Test
    public void ClusterStatsDailyAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"Daily", "All", true);
    }

    @Test
    public void ClusterStatsDailyBH5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", false,"DailyBH", "All", true);
    }
    @Test
    public void ClusterStatsDailyBHAggregation5G() throws Exception {

        State.Stats("Nokia", "5G", "Cluster", true,"DailyBH", "All", true);
    }


}
