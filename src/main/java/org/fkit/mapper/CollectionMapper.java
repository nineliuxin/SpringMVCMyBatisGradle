package org.fkit.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fkit.domain.Collection;
import org.fkit.domain.Good;

public interface CollectionMapper {
		@Insert("insert into user_collection(user_name,goodname)values(#{user_name},#{goodname}) ")
		void addCollection(@Param("user_name")String user_name,
				@Param("goodname")String goodname);
		@Select("select * from user_collection where user_name=#{user_name} and goodname=#{goodname}")
		Collection selectCollection(@Param("username")String user_name,
				@Param("goodname")String goodname);
		@Select("select* from good_info where good_name=#{goodname}")
		Good selectGood(@Param("goodname")String goodname);
		
}
