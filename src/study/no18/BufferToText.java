package study.no18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
/**
 * 使用charBuffer 放入字符
 * BufferToText.java
 * @author sunny
 * 2017年3月9日上午8:15:10
 */
public class BufferToText {

	public static void main(String[] args) throws IOException {
		FileChannel fc = new FileOutputStream("data.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(24);
		buff.asCharBuffer().put("some text");
		fc.write(buff);
		fc.close();
		fc = new FileInputStream("data.txt").getChannel();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
		fc.close();
		
	}

}
