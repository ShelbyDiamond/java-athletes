package com.lambdaschool.solution;

public class TrackAthleteCreationInjector implements AthleteCreationInjector {

    @Override
    public Processor getProcess() {

        // sends TrackAthleteImpl to be INJECTED into MyApplication
        return new MyApplication(new TrackAthleteImpl());
    }
}
