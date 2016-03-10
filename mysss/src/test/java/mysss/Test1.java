package mysss;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.cn.testmy.domain.ApplyCrm;

public class Test1 {
	public static void main(String[] args) {
		InputStream in = Test1.class.getResourceAsStream("conf.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession session = sessionFactory.openSession();
		String statement = "com.cn.testmy.mapper.userMapper.getApplyCrm";
		ApplyCrm applyCrm = session.selectOne(statement, 1);
		System.out.println(applyCrm.getApplyName());
	}
}
