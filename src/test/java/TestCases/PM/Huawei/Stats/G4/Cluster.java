package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {

    PM State= new PM();

    @Test
    public void ClusterStats4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", false,"Hourly");
    }

    @Test
    public void ClusterStatsAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", true,"Hourly");
    }
    @Test
    public void ClusterStatsDaily4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", false,"Daily");
    }
    @Test
    public void ClusterStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", true,"Daily");
    }
    @Test
    public void ClusterStatsWeekly4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", false,"Weekly");
    }
    @Test
    public void ClusterStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", true,"Weekly");
    }

    @Test
    public void ClusterStatsMonthly4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", false,"Monthly");
    }
    @Test
    public void ClusterStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", true,"Monthly");
    }
    @Test
    public void ClusterStatsDailyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", false,"DailyBH");
    }
    @Test
    public void ClusterStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", true,"DailyBH");
    }

    @Test
    public void ClusterStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", false,"WeeklyBH");
    }
    @Test
    public void ClusterStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", true,"WeeklyBH");
    }

    @Test
    public void ClusterStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", false,"MonthlyBH");
    }

    @Test
    public void ClusterStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Cluster", true,"MonthlyBH");
    }

}
