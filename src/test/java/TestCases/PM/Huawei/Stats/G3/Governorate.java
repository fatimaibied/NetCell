package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", false,"Hourly", "All");
    }

    @Test
    public void GovernorateStatsAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", true,"Hourly", "All");
    }
    @Test
    public void GovernorateStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", false,"Daily", "All");
    }
    @Test
    public void GovernorateStatsDailyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", true,"Daily", "All");
    }
    @Test
    public void GovernorateStatsWeekly3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", false,"Weekly", "All");
    }
    @Test
    public void GovernorateStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", true,"Weekly", "All");
    }

    @Test
    public void GovernorateStatsMonthly3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", false,"Monthly", "All");
    }
    @Test
    public void GovernorateStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", true,"Monthly", "All");
    }
    @Test
    public void GovernorateStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", false,"DailyBH", "All");
    }
    @Test
    public void GovernorateStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", true,"DailyBH", "All");
    }

    @Test
    public void GovernorateStatsWeeklyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", false,"WeeklyBH", "All");
    }
    @Test
    public void GovernorateStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", true,"WeeklyBH", "All");
    }

    @Test
    public void GovernorateStatsMonthlyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", false,"MonthlyBH", "All");
    }

    @Test
    public void GovernorateStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", true,"MonthlyBH", "All");
    }

    @Test
    public void GovernorateStatsRowAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", true,"Raw", "All");
    }
    @Test
    public void GovernorateStatsRow3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", false,"Raw", "All");
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void GovernorateSearchForKPI3G() throws Exception {

        State.Stats("Huawei", "3G", "Governorate", false,"Hourly", "Total_HSDPA_Erlang_Hours");
    }
}
