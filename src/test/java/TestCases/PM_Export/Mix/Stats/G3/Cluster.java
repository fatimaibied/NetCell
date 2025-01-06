package TestCases.PM_Export.Mix.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", false,"Hourly", "All", true);
    }

    @Test
    public void ClusterStatsAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", true,"Hourly", "All", true);
    }
    @Test
    public void ClusterStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", false,"Daily", "All", true);
    }
    @Test
    public void ClusterStatsDailyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", true,"Daily", "All", true);
    }

    @Test
    public void ClusterStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", false,"DailyBH", "All", true);
    }
    @Test
    public void ClusterStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Cluster", true,"DailyBH", "All", true);
    }


}
