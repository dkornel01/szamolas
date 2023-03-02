
package szamolasok;


public class Szamolasok {

    
    public static void main(String[] args) {
    int[] szamok={2,3,4};
    String megold="";
    int elsoszam=0;
    int masodikszam=0;
    int harmadikszam=0;
    for (int i=0;i<szamok.length;i++){
         elsoszam=szamok[i];
        for (int x=0;x<szamok.length;x++){
             masodikszam=szamok[x];
            for (int y=0;y<szamok.length;y++){
                 harmadikszam=szamok[y];
                System.out.println(szamok[i]+""+szamok[x]+""+szamok[y]);
            }
        }
       }
    }
    
}
