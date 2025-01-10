package dao;

import java.util.List;

import vo.GuestbookVo;

public interface GuestbookDao {
	public List<GuestbookDao>getList();
	public boolean insert(GuestbookVo vo);
	public boolean delete(Long no);
	public boolean update(GuestbookVo vo);
}
