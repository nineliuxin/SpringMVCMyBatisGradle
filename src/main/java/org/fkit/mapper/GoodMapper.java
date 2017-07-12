package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Good;

public interface GoodMapper {
@Select("select * from good_info where suk like CONCAT(#{num},'%')")
List<Good> selectWithSuk(@Param("num")String num);
@Select("select * from good_info where suk=#{suk}")
Good selectWithSuk2(@Param("suk")String suk);
@Select("select * from good_info ")
List<Good> showgood();
}


