import java.util.Scanner;

public class Kucharz {
    public void max_difference( int j,int p, int z) {

        long mr=0;
        if ( z<Math.abs(p-j)){
            if (p<j)p+=z;
            else
                j+=z;
            mr=Math.abs(p-j);
        }
        else{
            int suma = p+j+z;
            if (suma%2==0){
                p=j=suma/2;
                mr=0;
            }
            else{
                p=suma/2;
                j=(suma/2)+1;
                mr=1;
            }
        }
        System.out.println("Minimalna roznica = "+mr +" ile jablek: "+ j + "ile pomaranczy: "+p);
    }
}
