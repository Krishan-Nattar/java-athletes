package com.lambdaschool.solution;

public class Main {
    public static void main(String[] args) {
        AthleteCreationInjector injector;
        CourtCreationInjector courtinjector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Track Court
        courtinjector = new TrackCourtCreationInjector();
        app = courtinjector.getProcess();
        app.displayCourt();

        // Create a Hockey Court
        courtinjector = new HockeyCourtCreationInjector();
        app = courtinjector.getProcess();
        app.displayCourt();

        // Create a Rugby Court
        courtinjector = new RugbyCourtCreationInjector();
        app = courtinjector.getProcess();
        app.displayCourt();

        // Create a Baseball Court
        courtinjector = new BaseballCourtCreationInjector();
        app = courtinjector.getProcess();
        app.displayCourt();

    }
}
