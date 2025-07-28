package com.codedecode.foodcatalogue.mapper;

import com.codedecode.foodcatalogue.dto.FoodItemDTO;
import com.codedecode.foodcatalogue.entity.FoodItem;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-15T17:21:11+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.41.0.v20250213-1140, environment: Java 21.0.6 (Eclipse Adoptium)"
)
public class FoodItemMapperImpl implements FoodItemMapper {

    @Override
    public FoodItem mapFoodItemDTOToFoodItem(FoodItemDTO foodItemDTO) {
        if ( foodItemDTO == null ) {
            return null;
        }

        FoodItem foodItem = new FoodItem();

        foodItem.setId( foodItemDTO.getId() );
        foodItem.setItemDescription( foodItemDTO.getItemDescription() );
        foodItem.setItemName( foodItemDTO.getItemName() );
        foodItem.setPrice( foodItemDTO.getPrice() );
        foodItem.setQuantity( foodItemDTO.getQuantity() );
        foodItem.setRestaurantId( foodItemDTO.getRestaurantId() );
        foodItem.setVeg( foodItemDTO.isVeg() );

        return foodItem;
    }

    @Override
    public FoodItemDTO mapFoodItemToFoodItemDto(FoodItem foodItem) {
        if ( foodItem == null ) {
            return null;
        }

        FoodItemDTO foodItemDTO = new FoodItemDTO();

        foodItemDTO.setId( foodItem.getId() );
        foodItemDTO.setItemDescription( foodItem.getItemDescription() );
        foodItemDTO.setItemName( foodItem.getItemName() );
        foodItemDTO.setPrice( foodItem.getPrice() );
        foodItemDTO.setQuantity( foodItem.getQuantity() );
        foodItemDTO.setRestaurantId( foodItem.getRestaurantId() );
        foodItemDTO.setVeg( foodItem.isVeg() );

        return foodItemDTO;
    }
}
