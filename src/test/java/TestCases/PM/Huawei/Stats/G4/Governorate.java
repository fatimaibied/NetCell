package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"Hourly", "All", false);
    }

    @Test
    public void GovernorateStatsAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"Hourly", "All", false);
    }
    @Test
    public void GovernorateStatsDaily4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"Daily", "All", false);
    }
    @Test
    public void GovernorateStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"Daily", "All", false);
    }
    @Test
    public void GovernorateStatsWeekly4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"Weekly", "All", false);
    }
    @Test
    public void GovernorateStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"Weekly", "All", false);
    }

    @Test
    public void GovernorateStatsMonthly4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"Monthly", "All", false);
    }
    @Test
    public void GovernorateStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"Monthly", "All", false);
    }
    @Test
    public void GovernorateStatsDailyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"DailyBH", "All", false);
    }
    @Test
    public void GovernorateStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"DailyBH", "All", false);
    }

    @Test
    public void GovernorateStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"WeeklyBH", "All", false);
    }
    @Test
    public void GovernorateStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"WeeklyBH", "All", false);
    }

    @Test
    public void GovernorateStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"MonthlyBH", "All", false);
    }

    @Test
    public void GovernorateStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", true,"MonthlyBH", "All", false);
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void GovernorateSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate", false,"Hourly", "ERAB_Drop", false);
    }
}
