package com.andreev.orderService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("integration/http-products-gateway.xml")
public class ProductIntegrationConfig {
}
