public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog + 4 - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4 - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4 - 7639;
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var overallWeight = firstFighterWeight + secondFighterWeight;
        System.out.println("Общий вес двух бойцов равен " + overallWeight + " кг");
        var weightDiff = secondFighterWeight - firstFighterWeight;
        System.out.println("Разница между весами бойцов составляет " + weightDiff + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var weightDiff1 = secondFighterWeight - firstFighterWeight;
        System.out.println("Разница между весами бойцов составляет " + weightDiff1 + " кг");
        var weightDiff2 = secondFighterWeight % firstFighterWeight;
        System.out.println("Разница между весами бойцов составляет " + weightDiff2 + " кг");
    }
    public static void task8() {
        System.out.println("Задача 8");
        var totalLaboringTime = 640;
        var laboringTimePerWorker = 8;
        var numberOfWorkers = totalLaboringTime / laboringTimePerWorker;
        System.out.println("Всего работников в компании — " + numberOfWorkers + " человек");
        numberOfWorkers = numberOfWorkers + 94;
        var newLaboringTime = numberOfWorkers * 8;
        System.out.println("Если в компании работает " + numberOfWorkers + " человек, то всего " + newLaboringTime +
                " часов работы может быть поделено между сотрудниками");
    }
}
