package com.lambdaschool.solution;

public class BaseballCourtCreationInjector implements CourtCreationInjector {

    @Override
    public Processor getProcess() {

       return new MyApplication(new BaseballCourtCreationImplementation());
    }

}
