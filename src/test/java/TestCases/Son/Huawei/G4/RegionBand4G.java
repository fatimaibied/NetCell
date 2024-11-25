package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class RegionBand4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void RegionBand4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Region Band", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void RegionBand4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Region Band", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void RegionBand4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Region Band", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void RegionBand4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Region Band", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void RegionBand4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void RegionBand4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void RegionBand4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void RegionBand4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void RegionBand4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void RegionBand4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void RegionBand4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void RegionBand4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void RegionBand4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void RegionBand4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RegionBand4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionBand4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionBand4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Region Band", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void RegionBand4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionBand4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RegionBand4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void RegionBand4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "Region Band", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void RegionBandAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Region Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionBandAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Region Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionBandAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Region Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void RegionBandAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Region Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionBandAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Region Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionBandAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Region Band", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void RegionBandSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "Region Band", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void RegionBandSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "Region Band", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RegionBandSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "Region Band", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionBandSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "Region Band", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionBandSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Region Band", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void RegionBandSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "Region Band", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionBandSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Region Band", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void RegionBandCOSector() throws Exception {

        SON.son("Huawei","4G", "Region Band", "CO Sector","","");
    }


   }