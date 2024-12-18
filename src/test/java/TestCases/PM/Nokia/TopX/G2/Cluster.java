package TestCases.PM.Nokia.TopX.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterDailyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "Daily", false);
    }

    @Test
    public void ClusterDailyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "DailyBH", false);
    }

    @Test
    public void ClusterWeeklyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "Weekly", false);
    }

    @Test
    public void ClusterWeeklyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "WeeklyBH", false);
    }

    @Test
    public void ClusterMonthlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "Monthly", false);
    }
    @Test
    public void ClusterMonthlyBHTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "MonthlyBH", false);
    }

    @Test
    public void ClusterHourlyTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterDailyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "Daily", true);
    }
    @Test
    public void ClusterDailyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "DailyBH", true);
    }

    @Test
    public void ClusterWeeklyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "Weekly", true);
    }

    @Test
    public void ClusterWeeklyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "WeeklyBH", true);
    }

    @Test
    public void ClusterMonthlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "Monthly", true);
    }
    @Test
    public void ClusterMonthlyBHLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "MonthlyBH", true);
    }

    @Test
    public void ClusterHourlyLowXTopX2G() throws Exception {

        TopX.TopX("Nokia", "2G", "Cluster", "Hourly", true);
    }

}
