package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats3G() throws Exception {

        State.Stats("3G", "Cluster", false,"Hourly");
    }

    @Test
    public void ClusterStatsAggregation3G() throws Exception {

        State.Stats("3G", "Cluster", true,"Hourly");
    }

}
