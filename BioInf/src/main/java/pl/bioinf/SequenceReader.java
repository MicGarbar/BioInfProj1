/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.bioinf;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.biojava.nbio.core.sequence.DNASequence;
import org.biojava.nbio.core.sequence.ProteinSequence;
import org.biojava.nbio.core.sequence.RNASequence;
import org.biojava.nbio.core.sequence.io.FastaReaderHelper;

/**
 *
 * @author jdr
 */
public class SequenceReader {
   public static List<DNASequence> getDNASequences(String[] uniDNAIds) throws Exception {
       List<DNASequence> lst = new ArrayList<DNASequence>();  
       for (String id : uniDNAIds) {  
           lst.add(getDNASequenceForId(id));  
       }  
       
       return lst;
   }
   
   public static List<RNASequence> getRNASequences(String[] uniRNAIds) throws Exception {
       List<RNASequence> lst = new ArrayList<RNASequence>();  
       for (String id : uniRNAIds) {  
           lst.add(getRNASequenceForId(id));  
       }  
       
       return lst;
   }
   
   public static List<ProteinSequence> getProteinSequences(String[] uniProtIds) throws Exception {
       List<ProteinSequence> lst = new ArrayList<ProteinSequence>();  
       for (String id : uniProtIds) {  
           lst.add(getProteinSequenceForId(id));  
       }  
       
       return lst;
   }
   
   private static RNASequence getRNASequenceForId(String uniProtId) throws Exception {
       // TODO: relative path
       Path file =  Paths.get(String.format("C:/Users/jdr/Documents/studia/bioinfa/zad5/%s.fasta",uniProtId));
       InputStream stream = Files.newInputStream(file);
       return FastaReaderHelper.readFastaRNASequence(stream).get(uniProtId);
   }
   
    private static ProteinSequence getProteinSequenceForId(String uniProtId) throws Exception {
       // TODO: relative path
       Path file =  Paths.get(String.format("C:/Users/jdr/Documents/studia/bioinfa/zad5//BioInfProj1/ProteinData/%s.fasta",uniProtId));
       InputStream stream = Files.newInputStream(file);
       return FastaReaderHelper.readFastaProteinSequence(stream).get(uniProtId);
   }
     
    private static DNASequence getDNASequenceForId(String uniProtId) throws Exception {
       // TODO: relative path
       Path file =  Paths.get(String.format("C:/Users/jdr/Documents/studia/bioinfa/zad5/%s.fasta",uniProtId));
       InputStream stream = Files.newInputStream(file);
       return FastaReaderHelper.readFastaDNASequence(stream).get(uniProtId);
    }
}
