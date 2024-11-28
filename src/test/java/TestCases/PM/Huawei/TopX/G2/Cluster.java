package TestCases.PM.Huawei.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterDailyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "Daily", "Cell", false);
    }

    @Test
    public void ClusterDailyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "DailyBH", "Cell", false);
    }

    @Test
    public void ClusterWeeklyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "Weekly", "Cell", false);
    }

    @Test
    public void ClusterWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "WeeklyBH", "Cell", false);
    }

    @Test
    public void ClusterMonthlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "Monthly", "Cell", false);
    }
    @Test
    public void ClusterMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "MonthlyBH", "Cell", false);
    }

    @Test
    public void ClusterHourlyTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterDailyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "Daily", "Cell", true);
    }
    @Test
    public void ClusterDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "DailyBH", "Cell", true);
    }

    @Test
    public void ClusterWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "Weekly", "Cell", true);
    }

    @Test
    public void ClusterWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "WeeklyBH", "Cell", true);
    }

    @Test
    public void ClusterMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "Monthly", "Cell", true);
    }
    @Test
    public void ClusterMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "MonthlyBH", "Cell", true);
    }

    @Test
    public void ClusterHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Huawei", "2G", "Cluster", "Hourly", "Cell", true);
    }

}
