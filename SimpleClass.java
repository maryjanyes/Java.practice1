class LetterToFuture {
    
    protected int age;
    
    protected String[] phoneNumbers = {"380634556567", "380934556567"};
    protected int[] salaryValues = {100, 200};
    
    protected void setAge(int ageCount) {
        age = ageCount;
    }
    
    void printAge() {
        System.out.println("I have " + age + " years old..");
    }
}

class MyDeadVoice extends LetterToFuture {
    
    void printAge() {
        super.printAge();
        System.out.println("I has " + age + " years old..");
    }
    
    String reducePhones() {
        
        String phoneNumHash = "";
        for (String phoneNum: phoneNumbers) {
            phoneNumHash+= phoneNum;
        }
        
        return phoneNumHash;
    }
}

public class Program {
    
    public static void main(String args[]) {
        
        MyDeadVoice myDeadScream = new MyDeadVoice();
        myDeadScream.setAge(23);
        myDeadScream.printAge();
        
        String phoneNumLong = myDeadScream.reducePhones();
        
        System.out.println(phoneNumLong);
    }
}
