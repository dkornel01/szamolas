package szamolasok;

public class Szamolasok {

    public static void main(String[] args) {
        int[] szamok = {2, 3, 4};
        for (int i = 0; i < szamok.length; i++) { 
            for (int x = 0; x < szamok.length; x++) { 
                for (int y = 0; y < szamok.length; y++) {
                    System.out.println(szamok[i] + "" + szamok[x] + "" + szamok[y]);
                }
            }
        }
    }

}
