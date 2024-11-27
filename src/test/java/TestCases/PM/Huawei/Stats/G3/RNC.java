package TestCases.PM.Huawei.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RNC extends MainClass {

    PM State= new PM();

    @Test
    public void RNCStats3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Hourly");
    }

    @Test
    public void RNCStatsAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Hourly");
    }
    @Test
    public void RNCStatsDaily3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Daily");
    }
    @Test
    public void RNCStatsDailyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Daily");
    }
    @Test
    public void RNCStatsWeekly3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Weekly");
    }
    @Test
    public void RNCStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Weekly");
    }

    @Test
    public void RNCStatsMonthly3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"Monthly");
    }
    @Test
    public void RNCStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Monthly");
    }
    @Test
    public void RNCStatsDailyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"DailyBH");
    }
    @Test
    public void RNCStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"DailyBH");
    }

    @Test
    public void RNCStatsWeeklyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"WeeklyBH");
    }
    @Test
    public void RNCStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"WeeklyBH");
    }

    @Test
    public void RNCStatsMonthlyBH3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", false,"MonthlyBH");
    }

    @Test
    public void RNCStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"MonthlyBH");
    }

    @Test
    public void RNCStatsRowAggregation3G() throws Exception {

        State.Stats("Huawei", "3G", "RNC", true,"Row");
    }

}
