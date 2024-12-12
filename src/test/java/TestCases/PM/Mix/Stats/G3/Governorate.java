package TestCases.PM.Mix.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"Hourly");
    }

    @Test
    public void GovernorateStatsAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"Hourly");
    }
    @Test
    public void GovernorateStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"Daily");
    }
    @Test
    public void GovernorateStatsDailyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"Daily");
    }
    @Test
    public void GovernorateStatsWeekly3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"Weekly");
    }
    @Test
    public void GovernorateStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"Weekly");
    }

    @Test
    public void GovernorateStatsMonthly3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"Monthly");
    }
    @Test
    public void GovernorateStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"Monthly");
    }
    @Test
    public void GovernorateStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"DailyBH");
    }
    @Test
    public void GovernorateStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"DailyBH");
    }

    @Test
    public void GovernorateStatsWeeklyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"WeeklyBH");
    }
    @Test
    public void GovernorateStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"WeeklyBH");
    }

    @Test
    public void GovernorateStatsMonthlyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"MonthlyBH");
    }

    @Test
    public void GovernorateStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"MonthlyBH");
    }

    @Test
    public void GovernorateStatsRowAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"Raw");
    }
    @Test
    public void GovernorateStatsRow3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"Raw");
    }
}
