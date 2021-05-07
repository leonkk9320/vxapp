package com.leonkk.dao;

import com.leonkk.pojo.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface AreaDao {
    List<Area> queryAreaAll();
    Area queryAreaById(int areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
