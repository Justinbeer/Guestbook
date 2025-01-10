package dao;

public class GuestbookDaoImpl extends BaseDao implements GuestbookDao{

	public GuestbookDaoImpl(String dbUser, String dbPass) {
		super(dbUser, dbPass);
	}
	
	@Override
	public List<GuestbookVo>getList(){
		List<GuestbookVo> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = ""; // SQL작성
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
			}
		}
	}
	
}
