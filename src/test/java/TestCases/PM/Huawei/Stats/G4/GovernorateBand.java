package TestCases.PM.Huawei.Stats.G4;

import Main.MainClass;
import Main.PM;
import org.testng.annotations.Test;

public class GovernorateBand extends MainClass {

    PM State= new PM();

    @Test
    public void GovernorateBandStats4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", false,"Hourly", "All");
    }

    @Test
    public void GovernorateBandStatsAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", true,"Hourly", "All");
    }
    @Test
    public void GovernorateBandStatsDaily4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", false,"Daily", "All");
    }
    @Test
    public void GovernorateBandStatsDailyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", true,"Daily", "All");
    }
    @Test
    public void GovernorateBandStatsWeekly4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", false,"Weekly", "All");
    }
    @Test
    public void GovernorateBandStatsWeeklyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", true,"Weekly", "All");
    }

    @Test
    public void GovernorateBandStatsMonthly4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", false,"Monthly", "All");
    }
    @Test
    public void GovernorateBandStatsMonthlyAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", true,"Monthly", "All");
    }
    @Test
    public void GovernorateBandStatsDailyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", false,"DailyBH", "All");
    }
    @Test
    public void GovernorateBandStatsDailyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", true,"DailyBH", "All");
    }

    @Test
    public void GovernorateBandStatsWeeklyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", false,"WeeklyBH", "All");
    }
    @Test
    public void GovernorateBandStatsWeeklyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", true,"WeeklyBH", "All");
    }

    @Test
    public void GovernorateBandStatsMonthlyBH4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", false,"MonthlyBH", "All");
    }

    @Test
    public void GovernorateBandStatsMonthlyBHAggregation4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", true,"MonthlyBH", "All");
    }
    //------------------- Search for KPI -----------------------------------------------------------------
    @Test
    public void GovernorateBandSearchForKPI4G() throws Exception {

        State.Stats("Huawei", "4G", "Governorate Band", false,"Hourly", "ERAB_Drop_QCI1");
    }
}
