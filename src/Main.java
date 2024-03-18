public class Main {
    public static void main(String[] args) {

        //Задача №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper); //с переносом строки
        //System.out.println(String.format("%s %s %s", dog, cat, paper)); //в одну строку(тут IDEA ругается за "избыточный "format")
        System.out.println("_________________________");

        //Задача №2
        dog += 4; //Первый способ
        cat = cat + 4; //Второй способ
        paper = paper + 4;
        System.out.println(dog + "\n" + cat + "\n" + paper);
        //System.out.println(String.format("%s %s %s", dog, cat, paper));
        System.out.println("_________________________");

        //Задача №3
        dog -= 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper);
        //System.out.println(String.format("%s %s %s", dog, cat, paper));
        System.out.println("_________________________");

        //Задача №4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("_________________________");

        //Задача №5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println("_________________________");

        //Задача №6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общая масса двух бойцов " + totalWeight + " кг");
        var differenceWeight = Math.abs(firstBoxer - secondBoxer); //Метод Math.abs() для получения модуля выражения
        System.out.println("Разница в весе составляет " + differenceWeight + " кг");
        System.out.println("_________________________");

        //Задача №7
        var num1 = 82.7;
        var num2 = 78.2;
        var remainder = num1 % num2;
        System.out.println(remainder);
        System.out.println("________________________");

        //Задача №8
        var totalTime = 640;
        var personTime = 8;
        var personCount = totalTime / personTime;
        System.out.println("Всего работников в компании — " + personCount + " человек");

        personCount += 94;
        personTime = totalTime / personCount;
        System.out.println("Если в компании работает " + personCount + " человека, то всего " + personTime + " часа работы может быть поделено между сотрудниками");
    }
}