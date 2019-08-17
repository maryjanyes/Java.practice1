import java.util.List;
import java.util.ArrayList;

// the main class
public class Program {
    
    public static void main(String[] args) {
        QuestRoom questRoom = new QuestRoom();
        questRoom.ID = questRoom.ID + 1;
        questRoom.init();
        questRoom.displayVisitor(0);
        questRoom.displayVisitor(1);
        
        PaymentSystem paymentModule = new PaymentSystem();
        paymentModule.displaySum(10, questRoom);
        System.out.println("Quest Room ID: " + questRoom.ID);
    }
}

abstract class Payment {
    
    public void displaySum(int peoplesCount, QuestRoom room) {
        int moneys = peoplesCount * room.price;
        System.out.println("Quest Room price: " + moneys);
    }
}

class PaymentSystem extends Payment { }

class Generator {
    
    public static int ID;
    
    public void loise() { };
}

// the QuestRoom class
class QuestRoom extends Generator {
    
    ArrayList<Visitor> visitors;
    public final int price;
    
    {
        this.price = 100;
    }
    
    public static void main(String[] args) { }

    public void init() {
        visitors = new ArrayList<Visitor>();
        Visitor visitor1 = new Visitor(0, "", true);
        Visitor visitor2 = new Visitor(22, "Marianna Yasko", false);
        visitors.add(0, visitor1);
        visitors.add(1, visitor2);
    }

    public void displayVisitor(int index) {
        Visitor visitorThatFinded = visitors.get(index);
        System.out.println(visitorThatFinded.name + " : " + visitorThatFinded.age);
    }
}

class Visitor extends Generator {
    
    int age;
    String name;
    Boolean withFriends;
    
    Visitor(
        int age,
        String name,
        Boolean withFriends
    ) {
        if (age != 0) {
          this.age = age;
        } else if (name != "") {
          this.name = name;
        }
        this.withFriends = withFriends;
    }

    {
        this.age = 20;
        this.name = "Olly Olliwery";
        this.withFriends = false;
    }
}
