package pl.bioinf;

import org.biojava.nbio.core.exceptions.CompoundNotFoundException;

class SequenceService {

    private Sequencer sequencer;

    SequenceService(Sequencer sequencer){
        this.sequencer = sequencer;
    }

    void makeAlignment() throws CompoundNotFoundException {
        sequencer.makeAlignment();
    }

}
