import com.atguigu.mybatis.mapper.DeptMapper;
import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.test1;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sun.xml.internal.ws.wsdl.parser.MemberSubmissionAddressingWSDLParserExtension;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.annotation.Resources;
import java.io.IOException;
import java.util.List;

/**
 * @author 灰太狼
 * @version 1.0
 */

public class test {
//    first
    @Test
    public void s() throws IOException {
        SqlSession sqlSession = test1.test01();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Page<Object> objects = PageHelper.startPage(1, 4);
        List<Emp> allEmp = mapper.getAllEmp();
       allEmp.forEach(Emp-> System.out.println(Emp));
        System.out.println("hello git4");
        System.out.println("master test");
        System.out.println("hot-fix test!");
    }
}
