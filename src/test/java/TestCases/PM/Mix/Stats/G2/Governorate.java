package TestCases.PM.Mix.Stats.G2;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class Governorate extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateStats2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"Hourly", "All", false);
    }

    @Test
    public void GovernorateStatsAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"Hourly", "All", false);
    }

    @Test
    public void GovernorateStatsDaily2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"Daily", "All", false);
    }
    @Test
    public void GovernorateStatsDailyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"Daily", "All", false);
    }
    @Test
    public void GovernorateStatsWeekly2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"Weekly", "All", false);
    }
    @Test
    public void GovernorateStatsWeeklyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"Weekly", "All", false);
    }

    @Test
    public void GovernorateStatsMonthly2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"Monthly", "All", false);
    }
    @Test
    public void GovernorateStatsMonthlyAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"Monthly", "All", false);
    }
    @Test
    public void GovernorateStatsDailyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"DailyBH", "All", false);
    }
    @Test
    public void GovernorateStatsDailyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"DailyBH", "All", false);
    }

    @Test
    public void GovernorateStatsWeeklyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"WeeklyBH", "All", false);
    }
    @Test
    public void GovernorateStatsWeeklyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"WeeklyBH", "All", false);
    }

    @Test
    public void GovernorateStatsMonthlyBH2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", false,"MonthlyBH", "All", false);
    }

    @Test
    public void GovernorateStatsMonthlyBHAggregation2G() throws Exception {

        State.Stats("Mix", "2G", "Governorate", true,"MonthlyBH", "All", false);
    }
}
