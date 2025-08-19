package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {

    public List<CategoryDTO> getAllCategories() throws IOException;
}
