package buildingclass;

import java.util.Scanner;

public class HangDienMay extends HangHoa{
private String thoiGianbaohanh;
private String dienAp;
private String congSuat;
public HangDienMay() {
	
}
public HangDienMay(String thoiGianbaohanh, String dienAp, String congSuat,String maHang,String tenHang,String nhaSanxuat,int gia ){
	super(maHang, tenHang, nhaSanxuat, gia);
	this.thoiGianbaohanh=thoiGianbaohanh;
	this.dienAp=dienAp;
	this.congSuat=congSuat;
}
HangHoa hh=new HangHoa();

public void nhapHangDienMay() {
	hh.nhapHangHoa();
	Scanner sc = new Scanner(System.in);
	System.out.println("Thoi gian bao hanh: ");
	thoiGianbaohanh= sc.nextLine();
	System.out.println("Dien ap: ");
	dienAp=sc.nextLine();
	System.out.println("Cong suat: ");
	congSuat=sc.nextLine();
}
@Override
public String toString() {
	return "HangDienMay [" +hh.toString()+",Thoi gian bao hanh= "+thoiGianbaohanh+",Dien ap= "+dienAp+",Cong suat= "+congSuat +"]";
}}