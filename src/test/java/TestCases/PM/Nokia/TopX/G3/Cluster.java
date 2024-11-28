package TestCases.PM.Nokia.TopX.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Cluster extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterDailyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "Daily", "Cell", false);
    }

    @Test
    public void ClusterDailyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "DailyBH", "Cell", false);
    }

    @Test
    public void ClusterWeeklyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "Weekly", "Cell", false);
    }

    @Test
    public void ClusterWeeklyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "WeeklyBH", "Cell", false);
    }

    @Test
    public void ClusterMonthlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "Monthly", "Cell", false);
    }
    @Test
    public void ClusterMonthlyBHTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "MonthlyBH", "Cell", false);
    }

    @Test
    public void ClusterHourlyTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterDailyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "Daily", "Cell", true);
    }
    @Test
    public void ClusterDailyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "DailyBH", "Cell", true);
    }

    @Test
    public void ClusterWeeklyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "Weekly", "Cell", true);
    }

    @Test
    public void ClusterWeeklyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "WeeklyBH", "Cell", true);
    }

    @Test
    public void ClusterMonthlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "Monthly", "Cell", true);
    }
    @Test
    public void ClusterMonthlyBHLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "MonthlyBH", "Cell", true);
    }

    @Test
    public void ClusterHourlyLowXTopX3G() throws Exception {

        TopX.TopX("Nokia", "3G", "Cluster", "Hourly", "Cell", true);
    }

}
