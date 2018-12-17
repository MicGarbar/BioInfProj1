package pl.bioinf;

import org.biojava.nbio.core.exceptions.CompoundNotFoundException;

public class App {

    public static void main(String[] args) throws CompoundNotFoundException {
        SequenceService sequenceService = new SequenceService(new PairSequencer());
        sequenceService.makeAlignment();

        sequenceService = new SequenceService(new ProteinSequencer());
        sequenceService.makeAlignment();

        sequenceService = new SequenceService(new DNASequencer());
        sequenceService.makeAlignment();
    }

}
