package Class09;
abstract class Computer {
    abstract void display();
    abstract void typing();

    void turnOn() {
        System.out.println("전원을 켭니다.");
    }
    void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
class DeskTop extends Computer{
    // display, typing 상속받기

    @Override
    void display() {
        System.out.println("DeskTop display..");
    }

    @Override
    void typing() {
        System.out.println("DeskTop typing..");
    }
}

class NoteBook extends Computer {
    @Override
    void display() {
        System.out.println("NoteBook display..");
    }
    @Override
    void typing() {
        System.out.println("NoteBook typing..");
    }
}

public class ex01 {
    public static void main(String[] args) throws Exception {
        Computer [] c = {new DeskTop(), new DeskTop(), new NoteBook(), new NoteBook()};

        for(Computer com : c) {
            com.turnOn();
            com.display();
            com.typing();
            com.turnOff();
            System.out.println();
        }
    }
}