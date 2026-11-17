package edu.ec.uce.pa.grupo.u2;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain 
public class Main implements QuarkusApplication{

    public static void main(String[] arg){
        Quarkus.run(Main.class,arg);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("\nHello, Quarkus\n");

        return 0;
    }

    

}
