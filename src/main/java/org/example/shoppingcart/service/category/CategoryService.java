package org.example.shoppingcart.service.category;

import lombok.RequiredArgsConstructor;
import org.example.shoppingcart.models.Category;
import org.example.shoppingcart.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public Category addCategory(Category category) {
        return null;
    }

    @Override
    public void deleteCategory(Long id) {

    }

    @Override
    public List<Category> getAllCategories() {
        return List.of();
    }

    @Override
    public Category getCategoryById(Long id) {
        return null;
    }

    @Override
    public Category getCategoryByName(String name) {
        return null;
    }

    @Override
    public Category updateCategory(Category category) {
        return null;
    }
}
