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
        ProteinSequence s1 = new ProteinSequence("GDTTCVSMIWPTEKEDHMCMFVVACALKTWPSKLKMRQTGGENWFMIYMWYSSPMGTVNR");
        ProteinSequence s2 = new ProteinSequence("PDCPTRTRFSEMPETEYQAPIPNRFGRLGWAMLSGYKYVTCAENLCDMCSHGPCEAYMSG");
        ProteinSequence s3 = new ProteinSequence("CGLNIELPACVWIDWSLDFQACQQSWDVGLWRVWSANPIPECEWKLNNQGDKLSMITAVH");

        List<ProteinSequence> list = Arrays.asList(s1, s2, s3);

        Profile<ProteinSequence, AminoAcidCompound> multipleSequenceAlignment = Alignments.getMultipleSequenceAlignment(list);

        System.out.println("PROTEIN ALIGNMENT: \n" + multipleSequenceAlignment);
    }
}
