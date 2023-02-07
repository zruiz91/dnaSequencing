public class DNA {
    //program that determines whether there is a protein in a strand of DNA.

    public static void main(String[] args) {

        //test dna variables
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        //dan variable that holds the different trest values
        String dna = dna3;
        //hold the length of dna
        int length = dna.length();

        //hold start and  stop of the codons
        int start = dna.indexOf("ATG");
        int stop = dna.indexOf("TGA");

        System.out.println("Length: " + length);
        System.out.println("Start: " + start);
        System.out.println("Stop: " + stop);

        //ifconditional that checks whether or not the dna sequence is a protein
        if (start != -1 && stop != -1 && (start - stop) % 3 == 0) {

            System.out.println("Condition 1 and 2 and 3 are satisfied.");
            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No Protein");
        }

    }

}