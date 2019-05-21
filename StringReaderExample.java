package Section9_5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class StringReaderExample {

	public static void main(String[] args) throws IOException {
		String msg="セカイの終わり";
		Reader st=new StringReader(msg);
		char c1=(char)st.read();
		char c2=(char)st.read();
		System.out.println(c1+c2);
		
		
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		baos.write(65);
		baos.write(66);
		byte[]data=baos.toByteArray();
		for(byte b:data) {
			System.out.println(b);
		}
	}
}


