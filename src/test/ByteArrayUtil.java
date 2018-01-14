package test;

/**
 * @version v0.1
 * @author tjc
 *@
 */
public class ByteArrayUtil {

	/**
	 * byte[] 转化为  int 类型
	 * @param bs
	 * @param index 数组下标
	 * @return
	 */
	public static int toInt(byte[] bs, int index) {
		int result = bs[index] << 24 | 
				 bs[index + 1] << 16 | 
				 bs[index + 2] << 8 | 
				 bs[index + 3] << 0 ;
		
		return result;
	}
	

	/*
	 * 输出Byte数组
	 */
	public static void printByteArray(byte[] buf) {
		System.out.print("[");
		for (int i = 0; i < buf.length; i++) {
			System.out.print(buf[i]);
			if (i != buf.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
