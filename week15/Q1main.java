package week15;

import java.io.*;

public class Q1main {
	public static void main(String[] args) throws IOException {
		DataInputStream in = null;
		DataOutputStream out = null;
		System.out.println("���� �ڷ����� ���Ϸ� ����մϴ�");
		System.out.println("���Ͽ� ����� ���� �ڷ����� ����մϴ�");
		try {
			out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Q1.txt")));
			out.writeInt(3);
			out.writeShort(34);
			out.writeLong(3456);
			out.writeFloat(3.14F);
			out.writeDouble(3.14);
			out.flush();

			in = new DataInputStream(new BufferedInputStream(new FileInputStream("Q1.txt")));
			System.out.println(in.readInt());
			System.out.println(in.readShort());
			System.out.println(in.readLong());
			System.out.println(in.readFloat());
			System.out.println(in.readDouble());
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
