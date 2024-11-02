public class Main {
    public static void main(String[] args) {
        System.out.println();
        var dog = 8.0;
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println("Новое значение " + dog);
        cat = cat + 4;
        System.out.println("Новое значение " + cat);
        paper = paper + 4;
        System.out.println("Новое значение " + paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstWeight = 78.2;
        var secondWeight = 82.7;
        var generalWeight = firstWeight + secondWeight;
        System.out.println("Общая масса боксеров " + generalWeight + "кг!");
        var differenceWeight = secondWeight - firstWeight;
        System.out.println("Разница между боксерами " + differenceWeight +"кг!");

        differenceWeight = secondWeight % firstWeight;
        System.out.println(differenceWeight);

        var all = 640;
        var one = 8;
        var people = all/one;
        System.out.println("Всего работников в компании " + people + " человек");
        people = people + 94;
        var time = all/people;
        System.out.println("Если в компании работает " + people + " человек, то всего " + time + " часов работы может быть поделено между сотрудниками");
    }
}