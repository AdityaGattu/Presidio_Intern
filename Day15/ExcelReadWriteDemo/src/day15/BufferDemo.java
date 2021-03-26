package day15;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class BufferDemo {
	public static void main(String[] args) throws Exception {
		String str = "jack and jill &copy; went up the &copy hill";

		System.out.println((char) 169);

		BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(str.getBytes()));

		int i = 0;
		boolean flag = false;
		while ((i = bis.read()) != -1) {
			switch ((char) i) {
			case '&': {
				if (!flag) {
					flag = true;
					bis.mark(30);
				}
				break;
			}
			case ';': {
				if (flag) {
					flag = false;
					System.out.print((char) 169);
				}
				break;
			}
			case ' ': {
				if (flag) {
					flag = false;
					bis.reset();
					System.out.print("&");
				} else {
					System.out.print((char) i);
				}
				break;
			}
			default: {
				if (!flag) {
					System.out.print((char) i);
				}
			}
			}
		}
	}
}