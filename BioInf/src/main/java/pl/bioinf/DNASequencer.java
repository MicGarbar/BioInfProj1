package pl.bioinf;

import org.biojava.nbio.alignment.Alignments;
import org.biojava.nbio.core.alignment.template.Profile;
import org.biojava.nbio.core.exceptions.CompoundNotFoundException;
import org.biojava.nbio.core.sequence.DNASequence;
import org.biojava.nbio.core.sequence.compound.NucleotideCompound;

import java.util.Arrays;
import java.util.List;

public class DNASequencer implements Sequencer {

    public void makeAlignment() throws CompoundNotFoundException {
        DNASequence d1 = new DNASequence("CACGTTTCTTGTGGCAGCTTAAGTTTGAATGTCATTTCTTCAATGGGACGGA");
        DNASequence d2 = new DNASequence("ACGAGTGCGTGTTTTCCCGCCTGGTCCCCAGGCCCCCTTTCCGTCCTCAGGAA");
        DNASequence d3 = new DNASequence("GCGGGTGCGGTTGCTGGAAAGATGCATCTATAACCAAGAGGAGTCCGTGCGCT");

        List<DNASequence> list = Arrays.asList(d1, d2, d3);

        Profile<DNASequence, NucleotideCompound> multipleSequenceDAlignment = Alignments.getMultipleSequenceAlignment(list);

        System.out.println("DNA ALIGNMENT: \n" + multipleSequenceDAlignment);
    }
}
