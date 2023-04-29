package Task2;

public class Main {
        public static void main(String[] args) {
            Excep myException = new Excep();
            myException.litr();
            try {
                myException.zaps(0);
            } catch (Zapas e){
                System.out.println("Нехватка води становить(в літрах): " + e.getLit());

            }
        }
}
