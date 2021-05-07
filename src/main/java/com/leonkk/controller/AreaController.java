package com.leonkk.controller;

import com.leonkk.pojo.Area;
import com.leonkk.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @GetMapping("/listarea")
    public Map<String, Object> listArea(){
        Map<String, Object> map = new HashMap<>();
        List<Area> list = areaService.queryAreaAll();
        map.put("arealist", list);
        return map;
    }

    @GetMapping("/getareabyid")
    public Map<String, Object> getAreaById(Integer areaId){
        Map<String, Object> map = new HashMap<>();
        Area area = areaService.queryAreaById(areaId);
        map.put("area", area);
        return map;
    }

    @PostMapping("/addarea")
    public Map<String, Object> addArea(@RequestBody Area area){
        Map<String, Object> map = new HashMap<>();
        map.put("success", areaService.addArea(area));
        return map;
    }

    @PostMapping("/modifyarea")
    public Map<String, Object> modifyArea(@RequestBody Area area){
        Map<String, Object> map = new HashMap<>();
        map.put("success", areaService.modifyArea(area));
        return map;
    }

    @GetMapping("/removearea")
    public Map<String, Object> removeArea(Integer areaId){
        Map<String, Object> map = new HashMap<>();
        map.put("success", areaService.deleteArea(areaId));
        return map;
    }

}
