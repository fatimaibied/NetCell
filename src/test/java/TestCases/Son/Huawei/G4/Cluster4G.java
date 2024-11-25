package TestCases.Son.Huawei.G4;

import Main.Functions;
import Main.MainClass;
import Main.SON;
import org.testng.annotations.Test;

public class Cluster4G extends MainClass {
    Functions support = new Functions();
    Main.SON SON = new SON();


    //---------------4G Balance-----------------------------------
    //----------------------Hourly--------------------------------------
    @Test
    public void Cluster4GBalanceHourlyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Cluster", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Cluster4GBalanceHourlyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Cluster", "4G Balance","Hourly","");
        SON.CarrierType="";
    }
    //----------------------Daily--------------------------------------
    @Test
    public void Cluster4GBalanceDailyTDD() throws Exception {
        SON.CarrierType="TDD";
        SON.son("Huawei","4G", "Cluster", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //----------------------FDD-------------------------
    @Test
    public void Cluster4GBalanceDailyFDD() throws Exception {
        SON.CarrierType="FDD";
        SON.son("Huawei","4G", "Cluster", "4G Balance","Daily","");
        SON.CarrierType="";
    }
    //---------------4G Balance New-----------------------------------
    @Test
    public void Cluster4GBalanceNew() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G Balance New","","");
    }

    //-----------------------4g congested cells---------------------
    @Test
    public void Cluster4Gcongestedcells() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4g congested cells","DailyBH","");
    }


    //------------------------4G PCIConfusion --------------------
    @Test
    public void Cluster4GPCIConfusion() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G PCIConfusion","","");
    }

    //------------------------4G IntraNeighbors --------------------
    @Test
    public void Cluster4GIntraNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G IntraNeighbors","","");
    }

    //------------------------4G InterNeighbors --------------------
    @Test
    public void Cluster4GInterNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G InterNeighbors","","");
    }

    //------------------------4G 3GUtranNCellNeighbors --------------------
    @Test
    public void Cluster4G3GUtranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G 3GUtranNCellNeighbors","","");
    }

    //------------------------4G 2GGeranNCellNeighbors --------------------
    @Test
    public void Cluster4G2GGeranNCellNeighbors() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G 2GGeranNCellNeighbors","","");
    }

    //------------------------4G StrategyLayers --------------------
    @Test
    public void Cluster4GStrategyLayers() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G StrategyLayers","","");
    }

    //------------------------4G TAL --------------------
    @Test
    public void Cluster4GTALDaily() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G TAL","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void Cluster4GTALDailyBH() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G TAL","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Cluster4GTALHourly() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G TAL","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void Cluster4GTALMonthly() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G TAL","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void Cluster4GTALMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Cluster", "4G TAL","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void Cluster4GTALWeekly() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G TAL","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void Cluster4GTALWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G TAL","WeeklyBH","");

    }
    //---------------------------------------------------
    @Test
    public void Cluster4GTALRaw() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G TAL","Raw","");

    }
    //-------------------------4G PCIConflict-------------------------

    @Test
    public void Cluster4GPCIConflict() throws Exception {

        SON.son("Huawei","4G", "Cluster", "4G PCIConflict","","");
    }


    //-------------------------Azimuth Discrepancy Daily-------------------------
    //-----------TDD-----------------------------------------------------
    @Test
    public void ClusterAzimuthDiscrepancyTIntraFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Cluster", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void ClusterAzimuthDiscrepancyTInterFrequency() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Cluster", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void ClusterAzimuthDiscrepancyTIntraRAT() throws Exception {
        SON.CarrierType="TDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Cluster", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-----------FDD-----------------------------------------------------
    @Test
    public void ClusterAzimuthDiscrepancyFIntraFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra Frequency";

        SON.son("Huawei","4G", "Cluster", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void ClusterAzimuthDiscrepancyFInterFrequency() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Inter Frequency";

        SON.son("Huawei","4G", "Cluster", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //-------------------------------------------------------------
    @Test
    public void ClusterAzimuthDiscrepancyFIntraRAT() throws Exception {
        SON.CarrierType="FDD";
        SON.NeighborType="Intra RAT";

        SON.son("Huawei","4G", "Cluster", "Azimuth Discrepancy","Daily","");

        SON.CarrierType="";
        SON.NeighborType="";
    }
    //--------------------------------Sleeping Cells------------------------
    @Test
    public void ClusterSleepingCellsDaily() throws Exception {

        SON.son("Huawei","4G", "Cluster", "Sleeping Cells","Daily","");

    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsDailyBH() throws Exception {

        SON.son("Huawei","4G", "Cluster", "Sleeping Cells","DailyBH","");

    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsHourly() throws Exception {

        SON.son("Huawei","4G", "Cluster", "Sleeping Cells","Hourly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsMonthly() throws Exception {

        SON.son("Huawei","4G", "Cluster", "Sleeping Cells","Monthly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsMonthlyBH() throws Exception {

        SON.son("Huawei","34G", "Cluster", "Sleeping Cells","MonthlyBH","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsWeekly() throws Exception {

        SON.son("Huawei","4G", "Cluster", "Sleeping Cells","Weekly","");
    }
    //---------------------------------------------------
    @Test
    public void ClusterSleepingCellsWeeklyBH() throws Exception {

        SON.son("Huawei","4G", "Cluster", "Sleeping Cells","WeeklyBH","");

    }
    //--------------------------------CO Sector------------------------
    @Test
    public void ClusterCOSector() throws Exception {

        SON.son("Huawei","4G", "Cluster", "CO Sector","","");
    }


   }