package com.zero.dao;

import com.zero.models.commodity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommodityDao extends CrudRepository<commodity,String> {
}
