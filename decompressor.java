package Compressor_Decompressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class decompressor {
	
	public static void method(File file) throws IOException {
		
		String fileDirectory =file.getParent();
				
				FileInputStream fis = new FileInputStream(file);
		    // by using this we can read the file in bytes
				FileOutputStream fos = new FileOutputStream(fileDirectory+"DecompressedFile.gz");
		      // we can wright into the file by using fos
				GZIPOutputStream gzip = new GZIPOutputStream(fos);
				
				byte[] buffer = new byte[1024];
				int len;
				while((len=  gzip.read(buffer))!=-1)
				{
					gzip.write(buffer, 0, len);
				}
				gzip.close();
				fos.close();
				fis.close();
			}
			public static void main(String[] args) throws IOException {
				
				File path = new File("C:/Users/Shiva Sai/OneDrive/Pictures/Camera Roll");
				method(path);

			}


}
