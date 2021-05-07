package com.leonkk.service;

import com.leonkk.pojo.Area;

import java.util.List;

public interface AreaService {
    List<Area> queryAreaAll();
    Area queryAreaById(int areaId);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);
}
