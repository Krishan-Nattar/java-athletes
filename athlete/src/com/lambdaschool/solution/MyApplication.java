package com.lambdaschool.solution;

public class MyApplication implements Processor{

    private AthleteService ath;
    public MyApplication(AthleteService ath)
    {
        this.ath = ath;
    }

    @Override
    public void displayAthlete() {
        System.out.println("************");
        ath.displayAthlete();
        System.out.println("************");
    }
}
