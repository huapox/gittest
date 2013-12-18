package com.cnfoxy.base;
/**
 * @author huapox
 * @date 2013-12-18 上午11:29:06
 */
public class TmpDaoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TmpDao dao= new TmpDao();
		String des= dao.getString("测试！");
		
		System.out.println(des);

	}

}
