/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinventorysystem;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ameer Ayman
 */
public class TheNewsDealer {

    Scanner input = new Scanner(System.in);
    public String type[];
    public double typeProbabilities[];
    public double typesOfNewsdayCumulativeAndRanges[][];
    public double CumulativeAndRangesForExcellentDemand[][];
    public double CumulativeAndRangesForGoodDemand[][];
    public double CumulativeAndRangesForFairDemand[][];
    public double CumulativeAndRangesForPoorDemand[][];
    public double demandAndProbabilities[][];
    public int demand[];
    public double demandExcellent[];
    public double demandGood[];
    public double demandFair[];
    public double demandPoor[];
    public int RandomNumberOfType[];
    public String assignType[];
    public int RandomNumberAndDemand[][];
    public double revenu[];
    public double lostProfit[];
    public double salvage[];
    public double dailyProfit[];

    public void getTypeOfNewsDay(int num) {
        type = new String[num];
        System.out.println("Enter the type of newsday ");
        for (int i = 0; i < num; i++) {

            type[i] = input.next();

        }
    }

    public void getProbabilitiesOfTypeOfNewsDay(int num) {
        typeProbabilities = new double[num];
        System.out.println("Enter the probabilities of type of news day ");
        for (int i = 0; i < num; i++) {

            typeProbabilities[i] = input.nextDouble();
        }
    }

    public void displayTypeOfNewsdayAndTheirPropabilities(int num) {
        for (int j = 0; j < num; j++) {
            System.out.println(type[j] + "\t" + typeProbabilities[j]);
        }
    }

    public void calculateCumulativeProbabilityAndRanges_typeOfNewsday(int num) {
        double sumForCum = 0.0;
        typesOfNewsdayCumulativeAndRanges = new double[num][3];
        for (int i = 0; i < num; i++) {

            typesOfNewsdayCumulativeAndRanges[i][1] = Math.round(sumForCum * 100);
            sumForCum += typeProbabilities[i];
            typesOfNewsdayCumulativeAndRanges[i][0] = sumForCum;
            typesOfNewsdayCumulativeAndRanges[i][2] = Math.round(sumForCum * 100);
        }
    }

    public void displayCumulativeProbabilityAndRanges_typeOfNewsday(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(typesOfNewsdayCumulativeAndRanges[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void getDemandAndTheirProbabilities(int num) {
        demandAndProbabilities = new double[num][5];
        System.out.println("Enter the demand and their probabilities ");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                demandAndProbabilities[i][j] = input.nextDouble();
            }
        }
    }

    public void getDemand(int num) {
        demand = new int[num];
        System.out.println("Enter the demand values ");
        for (int i = 0; i < num; i++) {
            demand[i] = input.nextInt();
        }
    }

    public void getExcellentDemandProbabilities(int num) {
        demandExcellent = new double[num];
        System.out.println("Enter the Excellent demand probabilities values ");
        for (int i = 0; i < num; i++) {
            demandExcellent[i] = input.nextDouble();
        }
    }

    public void getGoodDemandProbabilities(int num) {
        demandGood = new double[num];
        System.out.println("Enter the good demand probabilities values ");
        for (int i = 0; i < num; i++) {
            demandGood[i] = input.nextDouble();
        }
    }

    public void getFairDemandProbabilities(int num) {
        demandFair = new double[num];
        System.out.println("Enter the Fair demand probabilities values ");
        for (int i = 0; i < num; i++) {
            demandFair[i] = input.nextDouble();
        }
    }

    public void getPoorDemandProbabilities(int num) {
        demandPoor = new double[num];
        System.out.println("Enter the Poor demand probabilities values ");
        for (int i = 0; i < num; i++) {
            demandPoor[i] = input.nextDouble();
        }
    }

    public void calculateCumulativeProbabilityAndRanges_excellentDemand(int num) {
        double sumForCum = 0.0;
        CumulativeAndRangesForExcellentDemand = new double[num][3];
        for (int i = 0; i < num; i++) {

            CumulativeAndRangesForExcellentDemand[i][1] = Math.round(sumForCum * 100);
            sumForCum += demandExcellent[i];
            CumulativeAndRangesForExcellentDemand[i][0] = sumForCum;
            CumulativeAndRangesForExcellentDemand[i][2] = Math.round(sumForCum * 100);
        }
    }

    public void calculateCumulativeProbabilityAndRanges_goodDemand(int num) {
        double sumForCum = 0.0;
        CumulativeAndRangesForGoodDemand = new double[num][3];
        for (int i = 0; i < num; i++) {

            CumulativeAndRangesForGoodDemand[i][1] = Math.round(sumForCum * 100);
            sumForCum += demandGood[i];
            CumulativeAndRangesForGoodDemand[i][0] = sumForCum;
            CumulativeAndRangesForGoodDemand[i][2] = Math.round(sumForCum * 100);
        }
    }

    public void calculateCumulativeProbabilityAndRanges_fairDemand(int num) {
        double sumForCum = 0.0;
        CumulativeAndRangesForFairDemand = new double[num][3];
        for (int i = 0; i < num; i++) {

            CumulativeAndRangesForFairDemand[i][1] = Math.round(sumForCum * 100);
            sumForCum += demandFair[i];
            CumulativeAndRangesForFairDemand[i][0] = sumForCum;
            CumulativeAndRangesForFairDemand[i][2] = Math.round(sumForCum * 100);
        }
    }

    public void calculateCumulativeProbabilityAndRanges_poorDemand(int num) {
        double sumForCum = 0.0;
        CumulativeAndRangesForPoorDemand = new double[num][3];
        for (int i = 0; i < num; i++) {

            CumulativeAndRangesForPoorDemand[i][1] = Math.round(sumForCum * 100);
            sumForCum += demandPoor[i];
            CumulativeAndRangesForPoorDemand[i][0] = sumForCum;
            CumulativeAndRangesForPoorDemand[i][2] = Math.round(sumForCum * 100);
        }
    }

    public void generateRandAndAssignType(int num) {
        RandomNumberOfType = new int[num];
        assignType = new String[num];
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            RandomNumberOfType[i] = rand.nextInt(90) + 10;
            int value = RandomNumberOfType[i];
            for (int j = 0; j < 4; j++) {
                if (value > typesOfNewsdayCumulativeAndRanges[j][1] && value <= typesOfNewsdayCumulativeAndRanges[j][2]) {
                    assignType[i] = type[j];
                }
            }

        }

    }

    public void calculateRevenue(int num) {
        revenu = new double[num];
        for (int i = 0; i < num; i++) {

            if (RandomNumberAndDemand[i][1] >= 70) {
                revenu[i] = (70 * 0.6);
            } else {
                revenu[i] = (RandomNumberAndDemand[i][1] * 0.6);
            }

        }

    }

    public void displayRevenu(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(revenu[i]);
        }
    }

    public void calculateLostProfit(int num) {
        lostProfit = new double[num];
        for (int i = 0; i < num; i++) {
            if (RandomNumberAndDemand[i][1] > 70) {
                lostProfit[i] = (RandomNumberAndDemand[i][1] - 70) * 0.2;
            }
        }

    }

    public void displayLostProfit(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(lostProfit[i]);
        }
    }

    public void calculateSalvage(int num) {
        salvage = new double[num];
        for (int i = 0; i < num; i++) {
            if (RandomNumberAndDemand[i][1] < 70) {
                salvage[i] = (70-RandomNumberAndDemand[i][1]) * 0.05;
            }
        }

    }

    public void displaySalvage(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(salvage[i]);
        }
    }

    public void calculateDailyProfit(int num) {
        dailyProfit = new double[num];
        for (int i = 0; i < num; i++) {

            dailyProfit[i] = Math.abs(revenu[i] - (70.0 * 0.4) - lostProfit[i] + salvage[i]);

        }

    }
    public void displayDailyProfit(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(dailyProfit[i]);
        }
    }
    public void displayCalender(int num){
        System.out.println("Day"+"\t"+"Rand"+"\t"+"Type"+"\t"+"Rand"+"\t"+"Demand"+"\t"+"Revenue"+"\t"+"Lost"+"\t"+"Salvage"+"\t"+"DailtProfit");
        for (int i = 0; i < num; i++) {
            System.out.println((i+1)+"\t"+RandomNumberOfType[i]+"\t"+assignType[i]+"\t"+RandomNumberAndDemand[i][0]+"\t"+RandomNumberAndDemand[i][1]+"\t"+revenu[i]+'$'+"\t"+lostProfit[i]+'$'+"\t"+salvage[i]+'$'+"\t"+dailyProfit[i]+'$');
        }
    }

    public void generateRandAndAssignDemand(int num) {
        RandomNumberAndDemand = new int[num][2];

        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            RandomNumberAndDemand[i][0] = rand.nextInt(90) + 10;
            int value = RandomNumberAndDemand[i][0];
            for (int j = 0; j < 9; j++) {

                if ("excel".equals(assignType[i]) && value > CumulativeAndRangesForExcellentDemand[j][1] && value <= CumulativeAndRangesForExcellentDemand[j][2]) {
                    RandomNumberAndDemand[i][1] = demand[j];

                }
                if ("good".equals(assignType[i]) && value > CumulativeAndRangesForGoodDemand[j][1] && value <= CumulativeAndRangesForGoodDemand[j][2]) {
                    RandomNumberAndDemand[i][1] = demand[j];

                }
                if ("fair".equals(assignType[i]) && value > CumulativeAndRangesForFairDemand[j][1] && value <= CumulativeAndRangesForFairDemand[j][2]) {
                    RandomNumberAndDemand[i][1] = demand[j];

                }
                if ("poor".equals(assignType[i]) && value > CumulativeAndRangesForPoorDemand[j][1] && value <= CumulativeAndRangesForPoorDemand[j][2]) {
                    RandomNumberAndDemand[i][1] = demand[j];

                }

            }

        }

    }

    public void displayRandomNumberAndAssignedType(int num) {
        for (int i = 0; i < num; i++) {

            System.out.println(RandomNumberOfType[i] + "\t" + assignType[i]);

        }
    }

    public void displayRandomNumberAndAssignedDemand(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(RandomNumberAndDemand[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void displayCumulativeProbabilityAndRanges_excellentDemand(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(CumulativeAndRangesForExcellentDemand[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void displayCumulativeProbabilityAndRanges_goodDemand(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(CumulativeAndRangesForGoodDemand[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void displayCumulativeProbabilityAndRanges_fairDemand(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(CumulativeAndRangesForFairDemand[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void displayCumulativeProbabilityAndRanges_poorDemand(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(CumulativeAndRangesForPoorDemand[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void displayDemandAndTheirProbabilities1(int num) {
        for (int i = 0; i < num; i++) {

            System.out.println(demand[i] + "\t" /*+ demandExcellent[i]*/ + "\t" + demandGood[i] + "\t" + demandFair[i] + "\t" + demandPoor[i]);

        }
    }

    public void displayDemandAndTheirProbabilities(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(demandAndProbabilities[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
