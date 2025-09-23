package org.example.shoppingcart.service.image;

import lombok.RequiredArgsConstructor;
import org.example.shoppingcart.models.Image;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ImageService implements IImageService {

    @Override
    public void deleteImageById(Long id) {

    }

    @Override
    public Image getImageById(Long id) {
        return null;
    }

    @Override
    public Image saveImage(MultipartFile file, Long productId) {
        return null;
    }

    @Override
    public void updateImage(MultipartFile file, Long imageId) {

    }
}
