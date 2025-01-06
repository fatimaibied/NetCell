package TestCases.PM_Export.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats2G() throws Exception {

        State.Stats("Mix", "2G", "Cluster", false,"Hourly", "All", true);
    }

    @Test
    public void ClusterStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cluster", true,"Hourly", "All", true);
    }

    @Test
    public void ClusterStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "Cluster", false,"Daily", "All", true);
    }
    @Test
    public void ClusterStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cluster", true,"Daily", "All", true);
    }

    @Test
    public void ClusterStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Cluster", false,"DailyBH", "All", true);
    }
    @Test
    public void ClusterStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Cluster", true,"DailyBH", "All", true);
    }


}
