/**
 *
 * @author Kevin Kim
 */
import java.io.IOException;

public class GrinCompression {
	
	public static void main(String[] args) throws IOException {
		String codeDir = args[0];
		String infile = args[1];
		String outfile = args[2];
		
            switch (codeDir) {
                case "encode":
                    GrinEncoder.encode(infile, outfile);
                    break;
                case "decode":
                    GrinDecoder.decode(infile, outfile);
                    break;
                default:
                    System.out.println("Error, must choose encode or decode");
            }
	}
}
