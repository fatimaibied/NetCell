package TestCases.PM.Huawei.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats2G() throws Exception {

        State.Stats("2G", "Cluster", false,"Hourly");
    }

    @Test
    public void ClusterStatsAggregation2G() throws Exception {

        State.Stats("2G", "Cluster", true,"Hourly");
    }

    @Test
    public void ClusterDailyStats2G() throws Exception {

        State.Stats("2G", "Cluster", true,"Daily");
    }

    @Test
    public void ClusterDailyBHStats2G() throws Exception {

        State.Stats("2G", "Cluster", true,"DailyBH");
    }
}
