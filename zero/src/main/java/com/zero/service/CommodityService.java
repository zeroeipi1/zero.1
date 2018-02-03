package com.zero.service;

import com.zero.dao.CommodityDao;
import com.zero.models.commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CommodityService {

    @Autowired
    private CommodityDao commodityDao;

    public List<commodity> commodities= new ArrayList<>( Arrays.asList(new commodity("1","2","3",true,false),
                new commodity("4","5","6",true,false)));

    public List<commodity> getAllCommodities() {
        List<commodity> commodities = new ArrayList<>();
        commodityDao.findAll().forEach(commodities::add);
        return commodities;
    }

    public commodity getCommodity(final String id){
        return commodityDao.findOne(id);
    }

    public void addCommodity(commodity commodity){
        commodityDao.save(commodity);
    }

    public void updateCommodity(String id ,commodity commodity){
        commodity.setId(id);
        commodityDao.save(commodity);
        }
    }

