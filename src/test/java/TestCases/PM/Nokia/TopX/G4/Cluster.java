package TestCases.PM.Nokia.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterDailyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Daily", "Cell", false);
    }

    @Test
    public void ClusterDailyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "DailyBH", "Cell", false);
    }

    @Test
    public void ClusterWeeklyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Weekly", "Cell", false);
    }

    @Test
    public void ClusterWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "WeeklyBH", "Cell", false);
    }

    @Test
    public void ClusterMonthlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Monthly", "Cell", false);
    }
    @Test
    public void ClusterMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "MonthlyBH", "Cell", false);
    }

    @Test
    public void ClusterHourlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterDailyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Daily", "Cell", true);
    }
    @Test
    public void ClusterDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "DailyBH", "Cell", true);
    }

    @Test
    public void ClusterWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Weekly", "Cell", true);
    }

    @Test
    public void ClusterWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "WeeklyBH", "Cell", true);
    }

    @Test
    public void ClusterMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Monthly", "Cell", true);
    }
    @Test
    public void ClusterMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "MonthlyBH", "Cell", true);
    }

    @Test
    public void ClusterHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster", "Hourly", "Cell", true);
    }

}
