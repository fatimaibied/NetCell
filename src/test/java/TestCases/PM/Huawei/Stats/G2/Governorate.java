package TestCases.PM.Huawei.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", false,"Hourly", "All");
    }

    @Test
    public void GovernorateStatsAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", true,"Hourly", "All");
    }

    @Test
    public void GovernorateStatsDaily2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", false,"Daily", "All");
    }
    @Test
    public void GovernorateStatsDailyAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", true,"Daily", "All");
    }
    @Test
    public void GovernorateStatsWeekly2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", false,"Weekly", "All");
    }
    @Test
    public void GovernorateStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", true,"Weekly", "All");
    }

    @Test
    public void GovernorateStatsMonthly2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", false,"Monthly", "All");
    }
    @Test
    public void GovernorateStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", true,"Monthly", "All");
    }
    @Test
    public void GovernorateStatsDailyBH2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", false,"DailyBH", "All");
    }
    @Test
    public void GovernorateStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", true,"DailyBH", "All");
    }

    @Test
    public void GovernorateStatsWeeklyBH2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", false,"WeeklyBH", "All");
    }
    @Test
    public void GovernorateStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", true,"WeeklyBH", "All");
    }

    @Test
    public void GovernorateStatsMonthlyBH2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", false,"MonthlyBH", "All");
    }

    @Test
    public void GovernorateStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", true,"MonthlyBH", "All");
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void GovernorateSearchForKPI2G() throws Exception {

        State.Stats("Huawei", "2G", "Governorate", false,"Hourly", "Total_PS_DL_Data_Volume");
    }
}
