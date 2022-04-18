package dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

import pojo.KhachHang;
import util.HibernateUtil;

public class KhachHangDao {
	public static List<KhachHang> layDanhSachKhachHang()
	{
		List<KhachHang> dsKhachHang = null ;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String hql="from KhachHang";
		Query query= session.createQuery(hql);
		dsKhachHang=query.list();
		return dsKhachHang;
	}
}
