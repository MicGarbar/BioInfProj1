package pl.bioinf;

import org.biojava.nbio.alignment.Alignments;
import org.biojava.nbio.alignment.SimpleGapPenalty;
import org.biojava.nbio.core.alignment.matrices.SimpleSubstitutionMatrix;
import org.biojava.nbio.core.alignment.template.SequencePair;
import org.biojava.nbio.core.alignment.template.SubstitutionMatrix;
import org.biojava.nbio.core.exceptions.CompoundNotFoundException;
import org.biojava.nbio.core.sequence.ProteinSequence;
import org.biojava.nbio.core.sequence.compound.AminoAcidCompound;

public class PairSequencer implements Sequencer {

    public void makeAlignment() throws CompoundNotFoundException {
        ProteinSequence s1 = new ProteinSequence("MFSIJNFIJNFIJMDFIMSMDFNSUIFMJMAFIAMSFIAS");
        ProteinSequence s2 = new ProteinSequence("FASFASFASMFUIAMUIFAMSFIOASFUIOANSFOASFOSA");

        SubstitutionMatrix<AminoAcidCompound> matrix = SimpleSubstitutionMatrix.getBlosum62();

        SequencePair<ProteinSequence, AminoAcidCompound> pairwiseAlignment = Alignments.getPairwiseAlignment(s1, s2, Alignments.PairwiseSequenceAlignerType.LOCAL, new SimpleGapPenalty(), matrix);

        System.out.println("PAIRWISE ALIGNMENT: \n" + pairwiseAlignment);
    }
}
