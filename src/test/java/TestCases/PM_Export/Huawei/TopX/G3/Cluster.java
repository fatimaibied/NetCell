package TestCases.PM_Export.Huawei.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterDailyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "Daily", false);
    }

    @Test
    public void ClusterDailyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "DailyBH", false);
    }
    @Test
    public void ClusterWeeklyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "Weekly", false);
    }

    @Test
    public void ClusterWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "WeeklyBH", false);
    }

    @Test
    public void ClusterMonthlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "Monthly", false);
    }
    @Test
    public void ClusterMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "MonthlyBH", false);
    }

    @Test
    public void ClusterHourlyTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterDailyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "Daily", true);
    }
    @Test
    public void ClusterDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "DailyBH", true);
    }

    @Test
    public void ClusterWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "Weekly", true);
    }

    @Test
    public void ClusterWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "WeeklyBH", true);
    }

    @Test
    public void ClusterMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "Monthly", true);
    }
    @Test
    public void ClusterMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "MonthlyBH", true);
    }

    @Test
    public void ClusterHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Huawei", "3G", "Cluster", "Hourly", true);
    }
}
