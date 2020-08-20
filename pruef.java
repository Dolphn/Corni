
/**
 * Write a description of class pruef here.
 *
 * @author (Cornelius, Christine, Selim)
 * @version (a version number or a date)
 */
public class pruef
{

    public boolean pruefen(String data){
        int res = 0;
        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i) == '1')
                res ++;
        }
        if(res % 2 == 0)
            return true;
        return false;

    }

    public boolean quersumme(String data, int n){
        int j = pruefbits(n);
        int quers = 0;
        for(int i = 0; i < data.length() -j; i++){
            if(data.charAt(i) == '1')
                quers++;
        }
        String sub = data.substring(data.length() -j);
        if(quers % n == binToDec(sub))
            return true;
        return false;
    }

    public boolean gewQuersumme(String data, int n){
        int j = pruefbits(n);
        int quers = 0;
        int gewicht = 1;
        for(int i = data.length() -j -1; i >=0 ; i--){
            if(data.charAt(i) == '1')
                quers += gewicht;
            gewicht++;
        }
        String sub = data.substring(data.length() -j);
        if(quers % n == binToDec(sub))
            return true;
        return false;
    }

    public int pruefbits(int n) {
        int j = 0;
        int m = n;
        while (m > 1){
            j++;
            m /= 2;
        }
        return j;
    }

    public int binToDec(String data){
        int j = 0;
        int res = 0;
        for(int i = data.length() -1; i >= 0; i--){
            if(data.charAt(i) == '1')
                res += Math.pow(2, j);
            j++;
        }
        return res;
    }
}
