package com.auction.common.dto;


import lombok.*;


@Builder
public record AddressResponse(Long addressId, Long userId, String street, String city, String state, String postalCode, String country, boolean isBillingAddress, boolean isShippingAddress) {

}
