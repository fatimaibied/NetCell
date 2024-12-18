package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class GovernorateXDD extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateXDDStats4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", false,"Hourly", "All", false);
    }

    @Test
    public void GovernorateXDDStatsAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", true,"Hourly", "All", false);
    }

    @Test
    public void GovernorateXDDStatsDaily4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", false,"Daily", "All", false);
    }
    @Test
    public void GovernorateXDDStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", true,"Daily", "All", false);
    }
    @Test
    public void GovernorateXDDStatsWeekly4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", false,"Weekly", "All", false);
    }
    @Test
    public void GovernorateXDDStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", true,"Weekly", "All", false);
    }

    @Test
    public void GovernorateXDDStatsMonthly4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", false,"Monthly", "All", false);
    }
    @Test
    public void GovernorateXDDStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", true,"Monthly", "All", false);
    }
    @Test
    public void GovernorateXDDStatsDailyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", false,"DailyBH", "All", false);
    }
    @Test
    public void GovernorateXDDStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", true,"DailyBH", "All", false);
    }

    @Test
    public void GovernorateXDDStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", false,"WeeklyBH", "All", false);
    }
    @Test
    public void GovernorateXDDStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", true,"WeeklyBH", "All", false);
    }

    @Test
    public void GovernorateXDDStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", false,"MonthlyBH", "All", false);
    }

    @Test
    public void GovernorateXDDStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", true,"MonthlyBH", "All", false);
    }

    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void GovernorateXDDSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate XDD", false,"Hourly", "Total_Conn_Erlangs", false);
    }
}
