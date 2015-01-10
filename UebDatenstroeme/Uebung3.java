package UebDatenstroeme;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Uebung3 {
	
	public static void main(String[] args) throws URISyntaxException, IOException {
		Path path = Paths.get( new URI( "file:/Users/schulung/workspace/Uebungen/UebDatenstroeme/Uebung3.in" ) );
		String content = new String( Files.readAllBytes( path ),
				StandardCharsets.UTF_8 );
		System.out.println( content );
	}
	

}
