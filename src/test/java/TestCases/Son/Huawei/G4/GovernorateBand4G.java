package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class GovernorateBand4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void GovernorateBand4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Governorate Band", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void GovernorateBand4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Governorate Band", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void GovernorateBand4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Governorate Band", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void GovernorateBand4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Governorate Band", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void GovernorateBand4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void GovernorateBand4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void GovernorateBand4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void GovernorateBand4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void GovernorateBand4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void GovernorateBand4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void GovernorateBand4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void GovernorateBand4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "GovernorateBand", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void GovernorateBand4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateBand4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "GovernorateBand", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateBand4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateBand4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateBand4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Governorate Band", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateBand4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateBand4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateBand4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void GovernorateBand4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void GovernorateBandAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Governorate Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateBandAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Governorate Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateBandAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Governorate Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void GovernorateBandAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Governorate Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateBandAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Governorate Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void GovernorateBandAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Governorate Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void GovernorateBandSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateBandSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void GovernorateBandSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateBandSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateBandSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Governorate Band", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateBandSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void GovernorateBandSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void GovernorateBandCOSector() throws Exception {

        SON.son("Huawei","4G", "Governorate Band", "CO Sector","","");
    }


   }