package TestCases.PM.Mix.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class RNC extends MainClass {

    PM State= new PM();

    @Test
    public void RNCStats3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", false,"Hourly", "All");
    }

    @Test
    public void RNCStatsAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", true,"Hourly", "All");
    }
    @Test
    public void RNCStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", false,"Daily", "All");
    }
    @Test
    public void RNCStatsDailyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", true,"Daily", "All");
    }
    @Test
    public void RNCStatsWeekly3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", false,"Weekly", "All");
    }
    @Test
    public void RNCStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", true,"Weekly", "All");
    }

    @Test
    public void RNCStatsMonthly3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", false,"Monthly", "All");
    }
    @Test
    public void RNCStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", true,"Monthly", "All");
    }
    @Test
    public void RNCStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", false,"DailyBH", "All");
    }
    @Test
    public void RNCStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", true,"DailyBH", "All");
    }

    @Test
    public void RNCStatsWeeklyBH3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", false,"WeeklyBH", "All");
    }
    @Test
    public void RNCStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", true,"WeeklyBH", "All");
    }

    @Test
    public void RNCStatsMonthlyBH3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", false,"MonthlyBH", "All");
    }

    @Test
    public void RNCStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", true,"MonthlyBH", "All");
    }

    @Test
    public void RNCStatsRowAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", true,"Raw", "All");
    }
    @Test
    public void RNCStatsRow3G() throws Exception {

        State.Stats("Mix", "3G", "RNC", false,"Raw", "All");
    }
}
