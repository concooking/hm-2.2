public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задача 1
        byte a = 8;
        System.out.println("Значение переменной а с типом byte равно " + a);
        short b = 549;
        System.out.println("Значение переменной b с типом byte равно " + b);
        int c = 11;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 987678967849L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 27.12f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 100;
        System.out.println("Значение переменной f с типом double равно " + f);
        // Задача 2
        float g = 27.12f;
        long h = 987678965549L;
        float j = 2.786f;
        short k= 569;
        short l = -159;
        short m = 27897;
        byte n = 67;
        // Задача 3
        byte classLp = 23;
        byte classAs = 27;
        byte classEa = 30;
        short allPaper = 480;
        int allStudents = classLp + classAs + classEa;
        int oneStudents = allPaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + oneStudents + " листов бумаги");
        // Задача 4
        int machineProductivityTwoMinute = 16;
        int machineProductivityOneMinute = machineProductivityTwoMinute / 2;
        int machineProductivityTwentyMinute = machineProductivityOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + machineProductivityTwentyMinute + " штук бутылок");
        int machineProductivityOneDay = machineProductivityOneMinute * 60 * 24;
        System.out.println("За сутки машина произвела " + machineProductivityOneDay + " штук бутылок");
        int machineProductivityThreeDays = machineProductivityOneDay * 3;
        System.out.println("За 3 дня машина произвела " + machineProductivityThreeDays + " штук бутылок");
        int machineProductivityOneMonth = machineProductivityOneDay * 30;
        System.out.println("За 1 месяц машина произвела " + machineProductivityOneMonth + " штук бутылок");
        // Задача 5
        int oneClassWhitePaint = 2;
        int oneClassBrownPaint = 4;
        int totalCansPaints = 120;
        int oneClassAllPaints = oneClassWhitePaint + oneClassBrownPaint;
        int allClassSchool = totalCansPaints / oneClassAllPaints;
        int allWhitePaintSchool = allClassSchool * oneClassWhitePaint;
        int allBrownPaintSchool = allClassSchool * oneClassBrownPaint;
        // Задача 6
        System.out.println("В школе, где " + allClassSchool + " классов, нужно " + allWhitePaintSchool + " банок белой краски и " + allBrownPaintSchool + " банок коричневой краски");
        int banana = 5;
        int weightOneBanana = 80;
        int milk = 2;
        int weightOneMilk = 105;
        int iceCream = 2;
        int weightOneIceCream = 100;
        int egg = 4;
        int weightOneEgg = 70;
        int bananaIngredient = banana * weightOneBanana;
        int milkIngredient = milk * weightOneMilk;
        int iceCreamIngredient = iceCream * weightOneIceCream;
        int eggIngredient = egg * weightOneEgg;
        float weightBreakfastGrm = bananaIngredient + iceCreamIngredient + milkIngredient + eggIngredient;
        System.out.println("Вес завтрака " + weightBreakfastGrm + " грамм");
        float weightBreakfastKg = weightBreakfastGrm / 1000;
        System.out.println("Вес завтрака " + weightBreakfastKg + " кг");
        // Задача 7
        int weightLossKg = 7;
        int weightLossGrm = weightLossKg * 1000;
        int lossOne = 250;
        int lossTwo = 500;
        int firstOption = weightLossGrm / lossOne;
        System.out.println("На похудение уйдет " + firstOption + " дней, если спортсмен будет терять 250 грамм, каждый день");
        int secondOption = weightLossGrm / lossTwo;
        System.out.println("На похудение уйдет " + secondOption + " дней, если спортсмен будет терять 500 грам , каждый день");
        int averageNumberDays = (firstOption + secondOption) / 2;
        System.out.println("В среднем на похудение уйдет " + averageNumberDays + " день");
        // Задача 8
        int wagesMashaBefore = 67760;
        int wagesDenisBefore = 83690;
        int wagesKrisBefore = 76230;
        int percentageIncrease = 10;
        int wagesMashaAfter = ((wagesMashaBefore * percentageIncrease) / 100) + wagesMashaBefore;
        int wagesDenisAfter = ((wagesDenisBefore * percentageIncrease) / 100) + wagesDenisBefore;
        int wagesKrisAfter = ((wagesKrisBefore * percentageIncrease) / 100) + wagesKrisBefore;
        int incomeGrowthMasha = (wagesMashaAfter - wagesMashaBefore) * 12;
        System.out.println("Маша теперь получает " + wagesMashaAfter + " рублей. Годовой доход вырос на " + incomeGrowthMasha + " рублей");
        int incomeGrowthDenis = (wagesDenisAfter - wagesDenisBefore) * 12;
        System.out.println("Денис теперь получает " + wagesDenisAfter + " рублей. Годовой доход вырос на " + incomeGrowthDenis + " рублей");
        int incomeGrowthKris = (wagesKrisAfter - wagesKrisBefore) * 12;
        System.out.println("Кристина теперь получает " + wagesKrisAfter + " рублей. Годовой доход вырос на " + incomeGrowthKris + " рублей");
    }
}