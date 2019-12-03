/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinventorysystem;

import java.util.Scanner;

/**
 *
 * @author Ameer Ayman
 */
public class SimpleInventorySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // excel good fair poor
        // 0.15 0.45 0.35 0.05
        // 40 50 60 70 80 90 100 110 120
        // 0.00 0.06 0.09 0.11 0.14 0.21 0.24 0.10 0.05 ex
        // 0.05 0.10 0.15 0.20 0.30 0.10 0.07 0.03 0.00 go
        // 0.15 0.20 0.30 0.17 0.11 0.05 0.02 0.00 0.00 fa
        // 0.44 0.26 0.16 0.08 0.06 0.01 0.00 0.00 0.00 po
        /*40 0.00 0.05 0.15 0.44 50 0.06 0.10 0.20 0.26 60 0.09 0.15 0.30 0.16 70 0.11 0.20 0.17 0.08 80 0.14 0.30 0.11 0.06 90 0.21 0.10 0.05 0.01 100 0.24 0.07 0.02 0.00 110 0.10 0.03 0.00 0.00
 120 0.05 0.00 0.00 0.00*/
        //9
        // good fair poor
        // 0.35 0.45 0.2
        // 40 50 60 70 80 90 100
        // 0.03 0.05 0.15 0.2 0.35 0.15 0.07
        // 0.1 0.18 0.4 0.2 0.08 0.04 0.00
        // 0.44 0.22 0.16 0.12 0.06 0 0
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many type of newsday");
        int typeNumbers = input.nextInt();
        System.out.println("----------------------------------------------------------------");
        TheNewsDealer news=new TheNewsDealer();
        news.getTypeOfNewsDay(typeNumbers);
        news.getProbabilitiesOfTypeOfNewsDay(typeNumbers);
        //news.displayTypeOfNewsdayAndTheirPropabilities(typeNumbers);
        System.out.println("----------------------------------------------------------------");
        news.calculateCumulativeProbabilityAndRanges_typeOfNewsday(typeNumbers);
        //news.displayCumulativeProbabilityAndRanges_typeOfNewsday(typeNumbers);
        System.out.println("----------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------");
        System.out.println("Enter how many number of demand");
        int demandNumbers = input.nextInt();
        //news.getDemandAndTheirProbabilities(demandNumbers);
        //news.displayDemandAndTheirProbabilities(demandNumbers);
        news.getDemand(demandNumbers);
        news.getExcellentDemandProbabilities(demandNumbers);
        news.getGoodDemandProbabilities(demandNumbers);
        news.getFairDemandProbabilities(demandNumbers);
        news.getPoorDemandProbabilities(demandNumbers);
        //news.displayDemandAndTheirProbabilities1(demandNumbers);
        System.out.println("----------------------------------------------------------------");
        news.calculateCumulativeProbabilityAndRanges_excellentDemand(demandNumbers);
        news.calculateCumulativeProbabilityAndRanges_goodDemand(demandNumbers);
        news.calculateCumulativeProbabilityAndRanges_fairDemand(demandNumbers);
        news.calculateCumulativeProbabilityAndRanges_poorDemand(demandNumbers);
        //news.displayCumulativeProbabilityAndRanges_excellentDemand(demandNumbers);
        System.out.println("----------------------------------------------------------------");
        //news.displayCumulativeProbabilityAndRanges_goodDemand(demandNumbers);
        System.out.println("----------------------------------------------------------------");
        //news.displayCumulativeProbabilityAndRanges_fairDemand(demandNumbers);
        System.out.println("----------------------------------------------------------------");
        //news.displayCumulativeProbabilityAndRanges_poorDemand(demandNumbers);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Enter how many days");
        int days = input.nextInt();
        news.generateRandAndAssignType(days);
        //news.displayRandomNumberAndAssignedType(days);
        System.out.println("----------------------------------------------------------------");
        news.generateRandAndAssignDemand(days);
        //news.displayRandomNumberAndAssignedDemand(days);
        System.out.println("----------------------------------------------------------------");
        news.calculateRevenue(days);
        //news.displayRevenu(days);
        System.out.println("----------------------------------------------------------------");
        news.calculateLostProfit(days);
        //news.displayLostProfit(days);
        news.calculateSalvage(days);
        news.calculateDailyProfit(days);
        news.displayCalender(days);
    }
    
}
