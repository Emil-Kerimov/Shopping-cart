package org.example.shoppingcart.service.image;

import org.example.shoppingcart.dto.ImageDto;
import org.example.shoppingcart.models.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> file, Long productId);
    void updateImage(MultipartFile file, Long imageId);

}
