package com.axonProject.restaurant.service;

import com.axonProject.restaurant.model.AssetsModel;

import java.util.List;
import java.util.Optional;

public interface AssetsModelService {
    List<AssetsModel> getAllAssets();
    void createAssetsItem(AssetsModel assetsModel);

    Optional<AssetsModel> findAssetsItemById(long id);

    void updateAssetsItem(long id, AssetsModel assetsModel);

    void updateAssetsQuantity(long id, int quantity);

    void deleteAssetsItem(long id);

    List<AssetsModel> getAssetsByName(String name);
}
