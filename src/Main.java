public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Task 1");

        int intBox = 256;
        byte byteBox = 1;
        short shortBox = 100;
        long longBox = 5544039;
        float floatBox = 3342.5561f;
        double doubleBox = 9221.45;

        System.out.println("Значение переменной intBox с типом int равно "+intBox);
        System.out.println("Значение переменной byteBox с типом byte равно "+byteBox);
        System.out.println("Значение переменной shortBox с типом short равно "+shortBox);
        System.out.println("Значение переменной longBox с типом long равно "+longBox);
        System.out.println("Значение переменной floatBox с типом float равно "+floatBox);
        System.out.println("Значение переменной doubleBox с типом double равно "+doubleBox);

        //task 2
        System.out.println("Task 2");

        double truckWeight = 27.12;
        long distanceToPlanet = 987678965549L;
        float  carWeight  = 2.786F;
        boolean maxWeight = carWeight>truckWeight;
        short zooPopulation = 569;
        int lowestTemperature = -159;
        int highestTower = 27897;
        byte numPixels = 67;
        char onePiece = 142;

        System.out.println(truckWeight);
        System.out.println(distanceToPlanet);
        System.out.println(carWeight);
        System.out.println(maxWeight);
        System.out.println(zooPopulation);
        System.out.println(lowestTemperature);
        System.out.println(highestTower);
        System.out.println(numPixels);
        System.out.println(onePiece);

        //task_3
        System.out.println("Task 3");

        int ludmila = 23;
        int anna = 27;
        int katya = 30;
        int numberOfStudents = ludmila+anna+katya;
        int papersWereBought = 480;
        int papersForOne = papersWereBought/numberOfStudents;
        System.out.println("На каждого ученика рассчитано "+papersForOne+" листов бумаги");

        //task_4
        System.out.println("Task 4");

        int bottles = 16;
        int timeFor16BottlesInMin = 2;
        int bottlesPerMin = bottles/timeFor16BottlesInMin;

        int twentyMin = 20;
        int bottlesPerTwentyMin = twentyMin*bottlesPerMin;
        System.out.println("За 20 минут машина произвела бутылок "+bottlesPerTwentyMin+" штук ");

        int bottlesPerHour = 60*bottlesPerMin;
        int bottlesPerDay = 24*bottlesPerHour;
        System.out.println("За 1 сутки машина произвела бутылок "+bottlesPerDay+" штук ");

        int bottlesPerThreeDays = 3*bottlesPerDay;
        System.out.println("За 3 дня машина произвела бутылок "+bottlesPerThreeDays+" штук ");

        int bottlesPerMonth = 30*bottlesPerDay;
        System.out.println("За 1 месяц машина произвела бутылок "+bottlesPerMonth+" штук ");

        //task_5
        System.out.println("Task 5");

        int allPaintCans = 120;
        int brownPaintCansForOneRoom = 4;
        int whitePaintCansForOneRoom = 2;
        int paintCansEveryColor = brownPaintCansForOneRoom+whitePaintCansForOneRoom;
        int classRooms = allPaintCans/paintCansEveryColor;
        int allBrownCans = classRooms*brownPaintCansForOneRoom;
        int allWhiteCans = classRooms*whitePaintCansForOneRoom;
        System.out.println("В школе, где "+classRooms+" классов, нужно "+allWhiteCans+" банок белой краски и "+allBrownCans+ " банок коричневой краски");

        //task_6
        System.out.println("Task 6");

        int bananaWeight = 80;
        int hundredMlsMilkWeight = 105;
        int iceCreamBrickWeight = 100;
        int eggWeight = 70;

        int totalBananas = 5;
        int totalMilk = 2;
        int totalIceCream = 2;
        int totalEggs = 4;

        int totalWeight = (bananaWeight*totalBananas)+(hundredMlsMilkWeight*totalMilk)+(iceCreamBrickWeight*totalIceCream)+(eggWeight*totalEggs);
        float weightInKilos = totalWeight/1000f;
        System.out.println("Вес спортзавтрака составляет "+weightInKilos+" кг");

        //task_7
        System.out.println("Task 7");

        int weightToLose = 7;
        int weightToLoseInGrams = weightToLose*1000;
        int minNumOfGrams = 250;
        int maxNumOfGrams = 500;

        if((weightToLoseInGrams%minNumOfGrams)==0){
            int daysWithMinGrams = weightToLoseInGrams/minNumOfGrams;
            System.out.println(daysWithMinGrams+" дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм");
        }
        if((weightToLoseInGrams%maxNumOfGrams)==0){
            int daysWithMaxGrams = weightToLoseInGrams/maxNumOfGrams;
            System.out.println(daysWithMaxGrams+" дней уйдёт на похудение, если спортсмен будет терять каждый день по 500 грамм");
        }
        int[] averageNumOfDays = {28, 14};
        int result = 0;
        for(int count : averageNumOfDays){
            result+=count;
        }
        System.out.println(result/averageNumOfDays.length+" дней в среднем может потребоваться, чтобы добиться результата похудения");

        //task_8
        System.out.println("Task 8");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinSalary = 76230;

        int newMasha = (mashaSalary/10)+mashaSalary;
        int newDenis = (denisSalary/10)+denisSalary;
        int newKristin = (kristinSalary/10)+kristinSalary;

        int difMasha = (newMasha*12)-(mashaSalary*12);
        int difDenis = (newDenis*12)-(denisSalary*12);
        int difKristin = (newKristin*12)-(kristinSalary*12);

        System.out.println("Маша теперь получает "+newMasha+" рублей. Годовой доход вырос на "+difMasha+" рублей");
        System.out.println("Денис теперь получает "+newDenis+" рублей. Годовой доход вырос на "+difDenis+" рублей");
        System.out.println("Кристина теперь получает "+newKristin+" рублей. Годовой доход вырос на "+difKristin+" рублей");




















    }
}