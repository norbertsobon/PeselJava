public class Pesel {
    private boolean weryfikacja(String pesel){
        char[] peselArrayChar = pesel.toCharArray();
        int[] peselArrayInt = new int[peselArrayChar.length];
        for(int i = 0; i < peselArrayChar.length;i++){
            peselArrayInt[i] = Character.getNumericValue(peselArrayChar[i]);
        }
        int suma = peselArrayInt[0]*1 + peselArrayInt[1]*3 + peselArrayInt[2]*7 + peselArrayInt[3]*9 + peselArrayInt[4]*1 + peselArrayInt[5]*3 + peselArrayInt[6]*7 + peselArrayInt[7]*9 + peselArrayInt[8]*1 + peselArrayInt[9]*3;
        int m = suma%10;

        int liczbaKontrolna;
        if(m == 0){
            liczbaKontrolna = 0;
        }else{
            liczbaKontrolna = 10 - m;
        }
        if(peselArrayInt[10] == liczbaKontrolna){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Pesel obiekt = new Pesel();
        System.out.println(obiekt.weryfikacja("66091049746")); //true
        System.out.println(obiekt.weryfikacja("88110877815")); //true
        System.out.println(obiekt.weryfikacja("53051536345")); //true
        System.out.println(obiekt.weryfikacja("55050673148")); //true
        System.out.println(obiekt.weryfikacja("76392056715")); //false
    }
}
