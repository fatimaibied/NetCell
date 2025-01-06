package TestCases.PM_Export.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster", false,"Hourly", "All", true);
    }

    @Test
    public void ClusterStatsAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster", true,"Hourly", "All", true);
    }
    @Test
    public void ClusterStatsDaily4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster", false,"Daily", "All", true);
    }
    @Test
    public void ClusterStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster", true,"Daily", "All", true);
    }

    @Test
    public void ClusterStatsDailyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster", false,"DailyBH", "All", true);
    }
    @Test
    public void ClusterStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Cluster", true,"DailyBH", "All", true);
    }


}
