package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RNC extends MainClass {

    PM State= new PM();

    @Test
    public void RNCStats3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Hourly", "All", false);
    }

    @Test
    public void RNCStatsAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Hourly", "All", false);
    }
    @Test
    public void RNCStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Daily", "All", false);
    }
    @Test
    public void RNCStatsDailyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Daily", "All", false);
    }
    @Test
    public void RNCStatsWeekly3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Weekly", "All", false);
    }
    @Test
    public void RNCStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Weekly", "All", false);
    }

    @Test
    public void RNCStatsMonthly3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Monthly", "All", false);
    }
    @Test
    public void RNCStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Monthly", "All", false);
    }
    @Test
    public void RNCStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"DailyBH", "All", false);
    }
    @Test
    public void RNCStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"DailyBH", "All", false);
    }

    @Test
    public void RNCStatsWeeklyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"WeeklyBH", "All", false);
    }
    @Test
    public void RNCStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"WeeklyBH", "All", false);
    }

    @Test
    public void RNCStatsMonthlyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"MonthlyBH", "All", false);
    }

    @Test
    public void RNCStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"MonthlyBH", "All", false);
    }

    @Test
    public void RNCStatsRowAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Raw", "All", false);
    }
    @Test
    public void RNCStatsRow3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Raw", "All", false);
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void RNCSearchForKPI3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Hourly", "HSUPA_MB_", false);
    }
}
