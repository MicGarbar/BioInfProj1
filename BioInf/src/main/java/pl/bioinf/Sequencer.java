package pl.bioinf;

import org.biojava.nbio.core.exceptions.CompoundNotFoundException;

public interface Sequencer {
    void makeAlignment() throws CompoundNotFoundException;
}
