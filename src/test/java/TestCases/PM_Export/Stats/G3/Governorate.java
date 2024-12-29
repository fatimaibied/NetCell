package TestCases.PM_Export.Stats.G3;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"Hourly", "All", false);
    }

    @Test
    public void GovernorateStatsAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"Hourly", "All", false);
    }
    @Test
    public void GovernorateStatsDaily3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"Daily", "All", false);
    }
    @Test
    public void GovernorateStatsDailyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"Daily", "All", false);
    }
    @Test
    public void GovernorateStatsWeekly3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"Weekly", "All", false);
    }
    @Test
    public void GovernorateStatsWeeklyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"Weekly", "All", false);
    }

    @Test
    public void GovernorateStatsMonthly3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"Monthly", "All", false);
    }
    @Test
    public void GovernorateStatsMonthlyAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"Monthly", "All", false);
    }
    @Test
    public void GovernorateStatsDailyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"DailyBH", "All", false);
    }
    @Test
    public void GovernorateStatsDailyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"DailyBH", "All", false);
    }

    @Test
    public void GovernorateStatsWeeklyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"WeeklyBH", "All", false);
    }
    @Test
    public void GovernorateStatsWeeklyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"WeeklyBH", "All", false);
    }

    @Test
    public void GovernorateStatsMonthlyBH3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"MonthlyBH", "All", false);
    }

    @Test
    public void GovernorateStatsMonthlyBHAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"MonthlyBH", "All", false);
    }

    @Test
    public void GovernorateStatsRowAggregation3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", true,"Raw", "All", false);
    }
    @Test
    public void GovernorateStatsRow3G() throws Exception {

        State.Stats("Mix", "3G", "Governorate", false,"Raw", "All", false);
    }
}
