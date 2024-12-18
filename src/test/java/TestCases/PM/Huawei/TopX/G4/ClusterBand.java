package TestCases.PM.Huawei.TopX.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class ClusterBand extends MainClass {
    PM TopX= new PM();

    @Test
    public void ClusterBandDailyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "Daily", false);
    }

    @Test
    public void ClusterBandDailyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "DailyBH", false);
    }

    @Test
    public void ClusterBandWeeklyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "Weekly", false);
    }

    @Test
    public void ClusterBandWeeklyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "WeeklyBH", false);
    }

    @Test
    public void ClusterBandMonthlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "Monthly", false);
    }
    @Test
    public void ClusterBandMonthlyBHTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "MonthlyBH", false);
    }

    @Test
    public void ClusterBandHourlyTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "Hourly", false);
    }

    //------------------------LowX------------------------------------------------------
    @Test
    public void ClusterBandDailyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "Daily", true);
    }
    @Test
    public void ClusterBandDailyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "DailyBH", true);
    }

    @Test
    public void ClusterBandWeeklyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "Weekly", true);
    }

    @Test
    public void ClusterBandWeeklyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "WeeklyBH", true);
    }

    @Test
    public void ClusterBandMonthlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "Monthly", true);
    }
    @Test
    public void ClusterBandMonthlyBHLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "MonthlyBH", true);
    }

    @Test
    public void ClusterBandHourlyLowXTopX4G() throws Exception {

        TopX.TopX("Huawei", "4G", "Cluster Band", "Hourly", true);
    }
}
