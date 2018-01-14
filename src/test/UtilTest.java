package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.junit.Test;

import junit.framework.Assert;

public class UtilTest {

	// @Test
	public void testByteToInt() {
		assertEquals(1, 1);
	}

	@Test
	public void testValue() {
		int a = -100;

		byte[] buf = intToByteArray(a);
		ByteArrayUtil.printByteArray(buf);
		
		System.out.println(ByteArrayUtil.toInt(buf,0));
		assertEquals(-100,ByteArrayUtil.toInt(buf,0));
	}

	public void testPrint() {

	}

	public byte[] intToByteArray(int a) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(bos);
			dos.writeInt(a);
			byte[] buf = bos.toByteArray();
			dos.close();
			bos.close();
			return buf;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new byte[0];
	}


}
