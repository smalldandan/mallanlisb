package net.suncaper.mallanlisb.mapper;

import java.util.List;
import net.suncaper.mallanlisb.common.domain.ImgFile;
import net.suncaper.mallanlisb.common.domain.ImgFileExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ImgFileMapper {
    long countByExample(ImgFileExample example);

    int deleteByExample(ImgFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImgFile record);

    int insertSelective(ImgFile record);

    List<ImgFile> selectByExample(ImgFileExample example);

    ImgFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImgFile record, @Param("example") ImgFileExample example);

    int updateByExample(@Param("record") ImgFile record, @Param("example") ImgFileExample example);

    int updateByPrimaryKeySelective(ImgFile record);

    int updateByPrimaryKey(ImgFile record);
}