package com.company.synchronization.phaser.example2;

import java.util.concurrent.Phaser;
/*
Extending Phaser to stop the phaser after specified number of phases.
 */
public class MyPhaser extends Phaser {
    int numOfPhases;

    MyPhaser(int parties, int numOfPhases){
        super(parties);
        this.numOfPhases = numOfPhases-1; // -1 since phases start from 0;
    }

    /**
     *
     * @param phase current phase, if phase == total specified phases then stop advancing to next phase.
     * @param registeredParties total of currently registered parties. if 0 then stop advancing to next phase.
     * @return true: stop phaser from advancing; false: continue to next phase.
     */
    @Override
    protected boolean onAdvance(int phase, int registeredParties){
        /*
            if specified number of phases are complete or
            no registered parties after any phase then stop advancing to next phase and terminate.
        */
        return (phase == numOfPhases || registeredParties == 0);
    }
}
