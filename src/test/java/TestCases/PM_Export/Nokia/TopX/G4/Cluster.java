package TestCases.PM_Export.Nokia.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterDailyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Daily", false);
    }

    @Test
    public void ClusterDailyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "DailyBH", false);
    }

    @Test
    public void ClusterWeeklyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Weekly", false);
    }

    @Test
    public void ClusterWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "WeeklyBH", false);
    }

    @Test
    public void ClusterMonthlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Monthly", false);
    }
    @Test
    public void ClusterMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "MonthlyBH", false);
    }

    @Test
    public void ClusterHourlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterDailyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Daily", true);
    }
    @Test
    public void ClusterDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "DailyBH", true);
    }

    @Test
    public void ClusterWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Weekly", true);
    }

    @Test
    public void ClusterWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "WeeklyBH", true);
    }

    @Test
    public void ClusterMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Monthly", true);
    }
    @Test
    public void ClusterMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "MonthlyBH", true);
    }

    @Test
    public void ClusterHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Hourly", true);
    }

}
