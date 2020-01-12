public class HelloWorld {

    public static final String[] SERVICE_UUIDS = {
        "550e8400-e29b-41d4-a716-446655440000",
        "550e8400-e29b-41d4-a716-446655440022",
        "550e8400-e29b-41d4-a716-446655440011",
        "550e8400-e29b-41d4-a716-446655440033"
    };

    public static void main(String []args) {
        int start = 0;
        
        while (start < 2) {
            start++;
            PichaWorker w = new PichaWorker("Nice" + start);
            w.start();
        }
    }
    
}

class PichaWorker implements Runnable {
    
    PichaWorker(String name) {
        workerGuid = generateGuid(1);
        workerName = name;
    }

    private String workerGuid;
    private String workerName;
    private Thread thread;
    
    private String generateGuid(int randomIndex) {
        return HelloWorld.SERVICE_UUIDS[randomIndex];
    }
    
    public void run() {
        System.out.println(workerName + ":");
        System.out.println("Create worker with name:" + workerGuid);
    }
    
    public void start() {
        System.out.println("Worker" + workerName + " is moving up");
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

}
