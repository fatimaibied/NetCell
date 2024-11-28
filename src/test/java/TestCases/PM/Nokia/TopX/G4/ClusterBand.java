package TestCases.PM.Nokia.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ClusterBand extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterBandDailyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "Daily", "Cell", false);
    }

    @Test
    public void ClusterBandDailyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "DailyBH", "Cell", false);
    }

    @Test
    public void ClusterBandWeeklyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "Weekly", "Cell", false);
    }

    @Test
    public void ClusterBandWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "WeeklyBH", "Cell", false);
    }

    @Test
    public void ClusterBandMonthlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "Monthly", "Cell", false);
    }
    @Test
    public void ClusterBandMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "MonthlyBH", "Cell", false);
    }

    @Test
    public void ClusterBandHourlyTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "Hourly", "Cell", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterBandDailyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "Daily", "Cell", true);
    }
    @Test
    public void ClusterBandDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "DailyBH", "Cell", true);
    }

    @Test
    public void ClusterBandWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "Weekly", "Cell", true);
    }

    @Test
    public void ClusterBandWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "WeeklyBH", "Cell", true);
    }

    @Test
    public void ClusterBandMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "Monthly", "Cell", true);
    }
    @Test
    public void ClusterBandMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "MonthlyBH", "Cell", true);
    }

    @Test
    public void ClusterBandHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Nokia", "4G", "Cluster Band", "Hourly", "Cell", true);
    }
}
