package gitlearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Iparking extends Iparams{
	//打印输出结果
	public void print();
	// 检查是否有 carType 对应的停车位
	public boolean addCar(int carType);
	//如果没有空车位，请返回 false ，否则将该车停入车位并返回 true
	///解析命令行输入的参数（格式），如文档描述
	public static Iparams parse() throws Exception{
		System.out.println("请输入（格式如：[[1, 1, 0], [1], [2], [3], [1]]）：");
		Scanner sca1 = new Scanner(System.in);
		//提取数字并将数字录入List
		String a=sca1.nextLine();;
		List<String> digitList = new ArrayList<String>();
		String result = a.replaceAll("[^0-9]", "");
		for (int i = 0; i < result.length(); i++) {
			digitList.add(result.substring(i, i+1));		  
		}
		
		ParkingSystem parkingSystem = new ParkingSystem(Integer.valueOf(digitList.get(0)), Integer.valueOf(digitList.get(1)), Integer.valueOf(digitList.get(2))); // 初始化有1个大车位，1个中车位，0个小车位
		boolean boo1 = parkingSystem.addCar(Integer.valueOf(digitList.get(3)));
		boolean boo2 = parkingSystem.addCar(Integer.valueOf(digitList.get(4)));
		boolean boo3 = parkingSystem.addCar(Integer.valueOf(digitList.get(5)));
		boolean boo4 = parkingSystem.addCar(Integer.valueOf(digitList.get(6)));
		
		System.out.print("["+"null"+","+boo1+","+boo2+","+boo3+","+boo4+"]");
		return parkingSystem;
		
	};
}