package TestCases.PM.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterDailyTopX2G() throws Exception {

        TopX.TopX("2G", "Cluster", false,"Daily",false);
    }

    @Test
    public void ClusterDailyBHTopX2G() throws Exception {

        TopX.TopX("2G", "Cluster", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterDailyLowXTopX2G() throws Exception {

        TopX.TopX("2G", "Cluster", false,"DailyBH",true);
    }
}
