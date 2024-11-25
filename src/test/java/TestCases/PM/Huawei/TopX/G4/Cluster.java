package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterDailyTopX4G() throws Exception {

        TopX.TopX("4G", "Cluster", false,"Daily",false);
    }

    @Test
    public void ClusterDailyBHTopX4G() throws Exception {

        TopX.TopX("4G", "Cluster", false,"DailyBH",false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterDailyLowXTopX4G() throws Exception {

        TopX.TopX("4G", "Cluster", false,"DailyBH",true);
    }
}
