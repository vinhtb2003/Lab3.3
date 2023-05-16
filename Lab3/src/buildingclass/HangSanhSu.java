package buildingclass;

import java.util.Scanner;

public class HangSanhSu extends HangHoa {
 private String loaiNguyenlieu;
public HangSanhSu() {
	
}
 public HangSanhSu(String loaiNguyenlieu,String maHang,String tenHang,String nhaSanxuat,int gia) {
	 super(maHang,tenHang,nhaSanxuat,gia);
	 this.loaiNguyenlieu=loaiNguyenlieu;
 }
 HangHoa hh=new HangHoa();
 public void nhapHangSanhSu() {
	 hh.nhapHangHoa();
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Loai nguyen lieu: ");
	 loaiNguyenlieu=sc.nextLine();
 }
@Override
public String toString() {
	return "HangSanhSu ["+ hh.toString()+",loaiNguyenlieu=" + loaiNguyenlieu + "]";
}
 
}
