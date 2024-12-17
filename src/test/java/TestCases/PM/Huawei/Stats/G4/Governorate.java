package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"Hourly", "All");
    }

    @Test
    public void GovernorateStatsAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"Hourly", "All");
    }
    @Test
    public void GovernorateStatsDaily4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"Daily", "All");
    }
    @Test
    public void GovernorateStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"Daily", "All");
    }
    @Test
    public void GovernorateStatsWeekly4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"Weekly", "All");
    }
    @Test
    public void GovernorateStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"Weekly", "All");
    }

    @Test
    public void GovernorateStatsMonthly4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"Monthly", "All");
    }
    @Test
    public void GovernorateStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"Monthly", "All");
    }
    @Test
    public void GovernorateStatsDailyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"DailyBH", "All");
    }
    @Test
    public void GovernorateStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"DailyBH", "All");
    }

    @Test
    public void GovernorateStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"WeeklyBH", "All");
    }
    @Test
    public void GovernorateStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"WeeklyBH", "All");
    }

    @Test
    public void GovernorateStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"MonthlyBH", "All");
    }

    @Test
    public void GovernorateStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"MonthlyBH", "All");
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void GovernorateSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"Hourly", "ERAB_Drop");
    }
}
