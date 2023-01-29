package Utility;

import java.util.concurrent.TimeUnit;

public class MyFunction {
    public static void Bekle(int sn){

        try {
            Thread.sleep(1000*sn); // milisaniye cinsinden olduğu için
            // 1000 le çarpıp saniyeye çevirdik
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }


    }
}
