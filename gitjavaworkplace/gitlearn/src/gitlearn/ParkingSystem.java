package gitlearn;

import java.util.ArrayList;

public class ParkingSystem implements Iparking{
	int bigNum;
    int mediumNum;
    int smallNum;
	
	public ParkingSystem(int big, int medium, int small) {
		// TODO Auto-generated constructor stub
		this.bigNum = big;
        this.mediumNum = medium;
        this.smallNum = small;
	}

	@Override
	public int getBig() {
		// TODO Auto-generated method stub
		return this.bigNum;
	}

	@Override
	public int getMedium() {
		// TODO Auto-generated method stub
		return this.mediumNum;
	}

	@Override
	public int getSmall() {
		// TODO Auto-generated method stub
		return this.smallNum;
	}

	@Override
	public ArrayList<Integer> getPlanParking() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addCar(int carType) {
		// TODO Auto-generated method stub
		switch (carType) {
        case 1:
            bigNum--;
            if (bigNum < 0) {
                return false;
            }
            break;    
        case 2:
            mediumNum--;
            if (mediumNum < 0) {
                return false;
            }
            break;  
        case 3:
            smallNum--;
            if (smallNum < 0) {
                return false;
            }
            break; 
        default:
            break;                     
    }
    return true;
	}
	
	public static void main(String args[]) throws Exception {
      	 Iparams params = Iparking.parse();
//-------------------------以下注释掉的代码段已在interface Iparking的.parse()中实现----------------------------
//      	 ParkingSystem ps = new ParkingSystem(1,1,0);      	 
//      	 ArrayList<Integer> plan = params.getPlanParking();      	 
//      	 for(int i = 0; i<plan.size();i++) {
//      		 ps.addCar(plan.get(i));
//      	 }
//      	 ps.print();
      	}

}
