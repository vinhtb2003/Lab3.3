package Test;

import java.util.ArrayList;
import java.util.Scanner;

import buildingclass.HangDienMay;
import buildingclass.HangHoa;
import buildingclass.HangSanhSu;
import buildingclass.HangThucPham;

public class Main {
	public static void main(String[] args) {
		
	ArrayList<HangHoa> dsHH=new ArrayList<HangHoa>();
 int LuaChon = 0;
 Scanner sc=new Scanner(System.in);
 do {
	 System.out.println("MENU____________________");
	 System.out.println("Vui long chon chuc nang");
	 System.out.println(
			 "1. Nhap hang dien may.\n"
		+    "2. Nhap hang sanh su.\n"
	    +    "3. Nhap hang thuc pham.\n"
		+    "4. In ra danh sach.\n"
		+    "0. Thoat!");
	 LuaChon=sc.nextInt();
	 
	 switch(LuaChon){
		case 1:{
			System.out.println("Moi nhap hang dien may");
			HangDienMay hdm = new HangDienMay();
			hdm.nhapHangDienMay();
			dsHH.add(hdm);	
			break;
		}
		case 2:{
			System.out.println("Moi nhap hang sanh su");
			HangSanhSu hss=new HangSanhSu();
			hss.nhapHangSanhSu();
			dsHH.add(hss);
			break;
		}
		case 3:{
			System.out.println("Moi nhap hang thuc pham");			
			HangThucPham hpp=new HangThucPham();
			hpp.nhapHangThucPham();
			dsHH.add(hpp);
			break;
			
		}
		case 4:{
			if(dsHH.size()==0) {
				System.out.println("Danh sach hang hoa rong!");
			}else {
			for(HangHoa hanghoa : dsHH) {
				System.out.println(hanghoa);
			}
		}
	 }default:
		 System.out.println("GOOD BYE");
		 break;
	 }
  }while(LuaChon!=0);
}
}