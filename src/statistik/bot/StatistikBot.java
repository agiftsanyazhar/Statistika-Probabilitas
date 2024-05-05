package statistik.bot;

public class StatistikBot {
    public static void main(String[] args) {
        nomor1(0, "diva");
        nomor2(0, "diva");
        nomor3(100, "diva");
        nomor4(20, "diva");
    }
    
    public static void nomor1(int pengambilan, String nama){
        System.out.println("NOMOR 1");
        System.out.println("->>" + nama);
        int gambar  = 0;
        int angka   = 0;
        for (int i=0; i<pengambilan; i++){
            int set = getRandom(3, 1);
            if (i%10 == 0)
                System.out.println("");
            if (set == 1){
                System.out.print(set+"  ,");
                gambar = gambar+1;
            }
            else if (set==2){
                System.out.print(set+"  ,");
                angka = angka+1;
            }
        }
        System.out.println("Gambar  = " + gambar);
        System.out.println("Angka   = " + angka);
        System.out.println("Dari " + pengambilan + " percobaan");
    }
    
    public static void nomor2(int pengambilan, String nama){
        System.out.println("NOMOR 2");
        System.out.println("->>"+nama);
        int gg=0;
        int ag=0;
        int aa=0;
        for (int i=0; i<pengambilan; i++){
            int set1 = getRandom(3,1);
            if (i%10==0)
                System.out.println("");
            for (int j=0; j<1; j++){
                int set2 = getRandom(3,1);
                if (set1==1 && set2==1){
                    System.out.print("["+set1+"|"+set2+"] , ");
                    gg = gg+1;
                }
                else if (set1==1 && set2==2){
                    System.out.print("["+set1+"|"+set2+"] , ");
                    ag = ag+1;
                }
                else if (set1==2 && set2==1){
                    System.out.print("["+set1+"|"+set2+"] , ");
                    ag = ag+1;
                }
                else if (set1==2 && set2==2){
                    System.out.print("["+set1+"|"+set2+"] , ");
                    aa = aa+1;
                } 
            }
        }
        System.out.println("");
        System.out.println("Gambar-Gambar = "+gg);
        System.out.println("Angka-Gambar = "+ag);
        System.out.println("Angka-Angka = "+aa);
        System.out.println("Dari "+pengambilan+" percobaan");
    }
    
    public static void nomor3(int pengambilan, String nama){
        System.out.println(" NOMOR 3");
        System.out.println("->>"+nama);
        int titik1=0;
        int titik2=0;
        int titik3=0;
        int titik4=0;
        int titik5=0;
        int titik6=0;
        
        for (int i=0; i<pengambilan; i++){
            int dadu = getRandom(7,1);
            if (i%10==0)
                System.out.println("");
            if (dadu==1){
                System.out.print(dadu+" ,");
                titik1=titik1+1;
            }
            else if (dadu==2){
                    System.out.print(dadu+" ,");
                    titik2=titik2+1;
                }
            else if (dadu==3){
                    System.out.print(dadu+" ,");
                    titik3=titik3+1;
                }
            else if (dadu==4){
                    System.out.print(dadu+" ,");
                    titik4=titik4+1;
                }
            else if (dadu==5){
                    System.out.print(dadu+" ,");
                    titik5=titik5+1;
                }
            else if (dadu==6){
                    System.out.print(dadu+" ,");
                    titik6=titik6+1;
                }
        }
        System.out.println("");
        System.out.println("Titik 1 = "+titik1);
        System.out.println("Titik 2 = "+titik2);
        System.out.println("Titik 3 = "+titik3);
        System.out.println("Titik 4 = "+titik4);
        System.out.println("Titik 5 = "+titik5);
        System.out.println("Titik 6 = "+titik6);
        System.out.println("Dari "+pengambilan+" percobaan");
            
    }
    
    public static void nomor4(int pengambilan, String nama){
        System.out.println(" NOMOR 4");
        System.out.println("->>"+nama);
        int merah = 0;
        int biru = 0;
        int kuning = 0;
        for(int i=0; i<pengambilan; i++){
            int bola = getRandom(13,1);
            if (i%10==0)
                System.out.println("");
            if (bola<=2){
                System.out.print(bola+"  ,");
                merah = merah+1;
            }
            else if (bola<=6){
                System.out.print(bola+"  ,");
                biru = biru+1;
            }
            else {
                System.out.print(bola+"  ,");
                kuning = kuning+1;
            }
        }
        System.out.println("");
        System.out.println("Merah = "+merah);
        System.out.println("Biru = "+biru);
        System.out.println("Kuning = "+kuning);
        System.out.println("Dari "+pengambilan+" percobaan");
        
    }
    
    public static int getRandom(int maximum, int minimum){
        return ((int) (Math.random()*(maximum-minimum)))+minimum;
    }
    
}