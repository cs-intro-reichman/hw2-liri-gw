// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // create variables and replace the name to upper case
            String name = args [0].toUpperCase(), cheer;
            String strAn = "AEFHILMNORSX";
            int num = Integer.parseInt(args[1]);
            // print each sentence for every letter of the input name with an\a
            for(int i = 0; i < name.length(); i++) {
                cheer = "Give me";
                if(strAn.indexOf(name.charAt(i)) != -1) {
                        cheer += " an ";
                }
                else {
                        cheer += " a  ";
                }
                cheer += name.charAt(i) + ": " + name.charAt(i) + "!";
                System.out.println(cheer);
            }
            // prints the name with (!!!) few times as the num on input
            System.out.println("What does that spell?");
            for(int i=0; i<num; i++) {
                System.out.println(name + "!!!");
            }
        }
}
