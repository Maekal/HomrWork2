public class Main {
    public static void main(String[] args) {
        //задание 1
        int dog = 10;
        short cat = 6;
        byte mouse = 1;
        double potatoWeight = 2.6;
        float saltWeight = 1.5f;
        boolean catIsAdult = cat > 10;
        char bar = 36;
        long a = 1;

        //задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weight0fallBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес бокссеров" + weight0fallBoxers);
        System.out.println("Разница в весе боксеров" + weightDifference);

        //задание 3
        float bananas = 80;
        float milk = 105;
        float icecream = 100;
        float ragg = 70;
        float weightGren = bananas * 5 + milk * 2 + icecream * 2 + ragg * 4;
        System.out.println("Вес в граммах" + weightGren);
        System.out.println("Вес в кг "+ weightGren/1000);

        // Задание 4
        double sportsman = 7000;
        double deetFirst = 250;
        double dietSekond = 500;
        double firstResult = sportsman / deetFirst;
        System.out.println("Скинет по 1 диете 7 кг"+ firstResult);
        double secondResult = sportsman / dietSekond;
        System.out.println("Скинет по 2 диете 7 кг"+ secondResult);
        System.out.println("В среднем уйдет дней"+ (firstResult+secondResult)/2 + "дней");

        // Задание 5
        int mahaSalary = 67760;
        int denisSalary = 83690;
        int kristySalary = 76320;

        double increasedSalaryMaha = mahaSalary / 100 * 10 + mahaSalary;
        double increasedSalaryDenis = denisSalary / 100 * 10 + denisSalary;
        double increasedSalaryKrisry = kristySalary / 100 * 10 + kristySalary;
        System.out.println("Разница в годовом доходе Маши составляет"+(increasedSalaryMaha-mahaSalary)*12);
        System.out.println("Разница в годовом доъходе Дениса составляет"+(increasedSalaryDenis-denisSalary)*12);
        System.out.println("Разница в годовом доходе Кристины составляет"+( increasedSalaryKrisry-kristySalary)*12);
        }


}