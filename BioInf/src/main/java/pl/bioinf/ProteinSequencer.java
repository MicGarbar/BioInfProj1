package pl.bioinf;

import org.biojava.nbio.alignment.Alignments;
import org.biojava.nbio.core.alignment.template.Profile;
import org.biojava.nbio.core.exceptions.CompoundNotFoundException;
import org.biojava.nbio.core.sequence.ProteinSequence;
import org.biojava.nbio.core.sequence.compound.AminoAcidCompound;

import java.util.Arrays;
import java.util.List;

public class ProteinSequencer implements Sequencer {

    public void makeAlignment() throws CompoundNotFoundException {
        String[] ids = new String[] {"Q21691", "A8WS47", "O48771"};  
        List<ProteinSequence> list;
        try {
            list = SequenceReader.getProteinSequences(ids);
            Profile<ProteinSequence, AminoAcidCompound> multipleSequenceAlignment = Alignments.getMultipleSequenceAlignment(list);

            System.out.println("PROTEIN ALIGNMENT: \n" + multipleSequenceAlignment);
        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
