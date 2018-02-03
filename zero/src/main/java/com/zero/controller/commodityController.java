package com.zero.controller;

import com.zero.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zero.models.commodity;

import java.util.Arrays;
import java.util.List;

@RestController
public class commodityController {

    @Autowired
    private CommodityService commodityService;

    @RequestMapping(method = RequestMethod.GET ,value ="/commodity")
    public List<commodity> getAllCommodities(){

        return commodityService.getAllCommodities();
    }
    @RequestMapping(value = "/commodity/{Id}")
    public commodity getById(@PathVariable String Id){
        return commodityService.getCommodity(Id);
    }
    @RequestMapping(method = RequestMethod.POST,value ="/commodity" )
    public void addCommodity(@RequestBody commodity commodity){

        commodityService.addCommodity(commodity);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/commodity/{id}" )
    public void updateCommodity(@RequestBody commodity commodity, @PathVariable String id){

        commodityService.updateCommodity(id,commodity);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/commodity/{id}" )
    public void deleteCommodity(@RequestBody commodity commodity, @PathVariable String id){

        //commodityService.deleteCommodity(id,commodity);
    }
}
