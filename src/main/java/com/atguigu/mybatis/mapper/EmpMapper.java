package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 灰太狼
 * @version 1.0
 */

public interface EmpMapper {
        List<Emp> getAllEmp();

//        查询员工以及员工所对应的部门信息
    Emp getEmpAndDept(@Param("eid") Integer eid);

    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);


    List<Emp> getDeptAndEmpByStepTwo(@Param("did") Integer did);
}
