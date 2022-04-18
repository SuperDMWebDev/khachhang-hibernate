package main;

import java.util.List;

import dao.KhachHangDao;
import pojo.KhachHang;

public class main {
	public static void main(String[] args)
	{
		List<KhachHang> dsKhachHang=KhachHangDao.layDanhSachKhachHang();
		for(int i=0;i<dsKhachHang.size();i++)
		{
			System.out.println("Ho ten"+dsKhachHang.get(i).getHoVaTen()+ "- Email"+dsKhachHang.get(i).getEmail()+" - DienThoai"+dsKhachHang.get(i).getDienThoai());
		}
	}
}
