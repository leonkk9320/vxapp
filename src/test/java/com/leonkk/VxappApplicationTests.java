package com.leonkk;

import com.leonkk.dao.AreaDao;
import com.leonkk.pojo.Area;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;


@SpringBootTest
class VxappApplicationTests {


    @Autowired
    DataSource dataSource;
    @Autowired
    AreaDao areaDao;

    @Test
    void testConnection() {
        System.out.println(dataSource.getClass());
    }

    @Test
    void queryAreaById(){
        Area area = areaDao.queryAreaById(1);
        System.out.println(area.getAreaName());
    }

    @Test
    void insertArea(){
        Area area = new Area(3,"南苑",1,null,null);
        System.out.println(areaDao.insertArea(area));
    }

    @Test
    void updateArea(){
        Area area = new Area(3, "西苑", 1, null, null);
        System.out.println(areaDao.updateArea(area));
    }

    @Test
    void deleteArea(){
        System.out.println(areaDao.deleteArea(1));
    }
}
