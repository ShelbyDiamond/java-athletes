package com.lambdaschool.solution;
public class MyApplication implements Processor {

    // CONSTRUCTOR INJECTION
    private AthleteService athSrv;

    public MyApplication(AthleteService athSrv) {
        this.athSrv = athSrv;
    }

    @Override
    public void displayAthlete() {
        System.out.println("************");
        athSrv.displayAthlete();
        System.out.println("************\n");
    }
}
