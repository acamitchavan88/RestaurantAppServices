package com.example.order.mapper;

import com.example.order.dto.OrderDTO;
import com.example.order.entity.Order;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-07-15T17:21:16+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.v20250213-1140, environment: Java 21.0.6 (Eclipse Adoptium)"
)
public class OrderDTOMapperImpl implements OrderDTOMapper {

    @Override
    public Order mapOrderDTOToOrder(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setRestaurant( orderDTO.getRestaurant() );

        return order;
    }

    @Override
    public OrderDTO mapOrderTOOrderDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setRestaurant( order.getRestaurant() );

        return orderDTO;
    }
}
