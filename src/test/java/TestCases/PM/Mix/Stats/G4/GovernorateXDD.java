package TestCases.PM.Mix.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class GovernorateXDD extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateXDDStats4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", false,"Hourly");
    }

    @Test
    public void GovernorateXDDStatsAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", true,"Hourly");
    }

    @Test
    public void GovernorateXDDStatsDaily4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", false,"Daily");
    }
    @Test
    public void GovernorateXDDStatsDailyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", true,"Daily");
    }
    @Test
    public void GovernorateXDDStatsWeekly4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", false,"Weekly");
    }
    @Test
    public void GovernorateXDDStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", true,"Weekly");
    }

    @Test
    public void GovernorateXDDStatsMonthly4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", false,"Monthly");
    }
    @Test
    public void GovernorateXDDStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", true,"Monthly");
    }
    @Test
    public void GovernorateXDDStatsDailyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", false,"DailyBH");
    }
    @Test
    public void GovernorateXDDStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", true,"DailyBH");
    }

    @Test
    public void GovernorateXDDStatsWeeklyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", false,"WeeklyBH");
    }
    @Test
    public void GovernorateXDDStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", true,"WeeklyBH");
    }

    @Test
    public void GovernorateXDDStatsMonthlyBH4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", false,"MonthlyBH");
    }

    @Test
    public void GovernorateXDDStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Mix", "4G", "Governorate XDD", true,"MonthlyBH");
    }
}
