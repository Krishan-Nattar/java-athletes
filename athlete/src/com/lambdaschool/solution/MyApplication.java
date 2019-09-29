package com.lambdaschool.solution;

public class MyApplication implements Processor{

    private AthleteService ath;
    public CourtService court;
    public MyApplication(AthleteService ath)
    {
        this.ath = ath;
    }
    public MyApplication(CourtService court)
    {
        this.court = court;
    }

    @Override
    public void displayAthlete() {
        System.out.println("*****************");
        ath.displayAthlete();
        System.out.println("*****************");
    }

    @Override
    public void displayCourt() {
        System.out.println("*****************");
        court.displayCourt();
        System.out.println("*****************");
    }
}
