package buildingclass;

import java.util.Scanner;

public class HangThucPham extends HangHoa {
private int ngaySanxuat;
private int ngayHethan;
public HangThucPham() {
	
}
public HangThucPham(String maHang, String tenHang, String nhaSanxuat, int gia, int ngaySanxuat, int ngayHethan) {
	super(maHang, tenHang, nhaSanxuat, gia);
	this.ngaySanxuat = ngaySanxuat;
	this.ngayHethan = ngayHethan;
}
HangHoa hh = new HangHoa();
NgayThang nsx= new NgayThang(0,0,0);
NgayThang nhh= new NgayThang(0,0,0);
public void nhapHangThucPham() {
	hh.nhapHangHoa();
	System.out.println("Ngay san xuat: ");
	nsx.nhapNgayThang();
	System.out.println("Ngay het han: ");
	nhh.nhapNgayThang();
}

public String toString() {
	return "Hang thuc pham" + hh.toString()+ ", Ngay san xuat=" + nsx.toString() + ",Ngay het han= "+ nhh.toString();
			
}




}