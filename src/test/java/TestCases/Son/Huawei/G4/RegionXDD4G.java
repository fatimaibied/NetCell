package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class RegionXDD4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void RegionXDD4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Region XDD", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void RegionXDD4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Region XDD", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void RegionXDD4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Region XDD", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void RegionXDD4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Region XDD", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void RegionXDD4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void RegionXDD4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void RegionXDD4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void RegionXDD4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void RegionXDD4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void RegionXDD4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void RegionXDD4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void RegionXDD4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void RegionXDD4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void RegionXDD4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RegionXDD4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionXDD4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionXDD4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Region XDD", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void RegionXDD4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionXDD4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RegionXDD4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void RegionXDD4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void RegionXDDAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Region XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionXDDAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Region XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionXDDAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Region XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void RegionXDDAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Region XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionXDDAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Region XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void RegionXDDAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Region XDD", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void RegionXDDSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void RegionXDDSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void RegionXDDSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionXDDSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionXDDSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Region XDD", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void RegionXDDSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void RegionXDDSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void RegionXDDCOSector() throws Exception {

        SON.son("Huawei","4G", "Region XDD", "CO Sector","","");
    }


   }