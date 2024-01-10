package homework;

class Animal {
    public int energy = 3;

    public void eat() {
        energy += 5;
        System.out.println("Animal eats. Energy: " + energy);
    }
}

class Lion extends Animal {
    public int energy = 8;

    @Override
    public void eat() {
        this.energy += 5;
        System.out.println("Lion eats. Energy: " + energy);
    }
}

public class Zoo {
    public static void main(String[] args) {
        // Lion 타입의 lion 변수에 Lion 인스턴스를 저장
        Lion lion = new Lion();
        lion.eat();
        System.out.println("Lion's energy: " + lion.energy);
        System.out.println();

        // Animal 타입의 animal 변수에 Lion 인스턴스를 저장
        Animal animal = new Lion();
        animal.eat();
        System.out.println("Animal's energy: " + animal.energy);
        System.out.println();

        // Animal 타입을 Lion 타입으로 형변환
        Lion lionFromAnimal = (Lion) animal;
        lionFromAnimal.eat();
        System.out.println("Lion from Animal's energy: " + lionFromAnimal.energy);
        System.out.println();
    }
}
