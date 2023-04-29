package Task2;

public class Excep {
    private int litriv = 200;

    public void litr(){
        System.out.println("В резервуарі міститься " + litriv + " літрів питної води");
    }

    public void zaps(int zap) throws Zapas {
        if (zap < litriv){
            System.out.println("Все в порядку.");
        } else {
            int l = litriv + zap;
            throw new Zapas(l);

        }

    }

    public int getLitriv() {
        return litriv;
    }
}
