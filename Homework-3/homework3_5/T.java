package homework3_5;

public class T extends Thread {
    public T(String str) {
        super(str);
    }

    @Override
    public void run() {
        for(int i = 0; i < 20; i++) {
            try{
                System.out.println(this.getName());
            sleep(300);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}