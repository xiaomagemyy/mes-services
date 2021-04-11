//package com.unilever.hefei.mes.gateway.service.config;
//
//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.cloud.gateway.config.GatewayProperties;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.support.NameUtils;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//import springfox.documentation.swagger.web.SwaggerResource;
//import springfox.documentation.swagger.web.SwaggerResourcesProvider;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @ClassName SwaggerResourceConfig
// * @Description TODO
// * @Author XiaoMaGe
// * @Date 2021/3/31 14:55
// * @Version 1.0
// **/
//@Slf4j
////@Component
////@Primary
//@AllArgsConstructor
//public class CustomSwaggerResourceProvider  implements SwaggerResourcesProvider{
//    /**
//     * Swagger2默认的url后缀
//     */
////    public static final String SWAGGER2URL = "/v2/api-docs";
//    private final RouteLocator routeLocator;
//    private final GatewayProperties gatewayProperties;
//
//
//    @Override
//    public List<SwaggerResource> get() {
//        List<SwaggerResource> resources = new ArrayList<>();
//        List<String> routes = new ArrayList<>();
//        routeLocator.getRoutes().subscribe(route -> routes.add(route.getId()));
//        gatewayProperties.getRoutes().stream().filter(routeDefinition -> routes.contains(routeDefinition.getId())).forEach(route -> {
//            route.getPredicates().stream()
//                    .filter(predicateDefinition -> ("Path").equalsIgnoreCase(predicateDefinition.getName()))
//                    .forEach(predicateDefinition -> resources.add(swaggerResource(route.getId(),
//                            predicateDefinition.getArgs().get(NameUtils.GENERATED_NAME_PREFIX + "0")
//                                    .replace("**", "v2/api-docs"))));
//        });
//
//        return resources;
//    }
//
//    private SwaggerResource swaggerResource(String name, String location) {
//        log.info("name:{},location:{}",name,location);
//        SwaggerResource swaggerResource = new SwaggerResource();
//        swaggerResource.setName(name);
//        swaggerResource.setLocation(location);
//        swaggerResource.setSwaggerVersion("2.0");
//        return swaggerResource;
//    }
//}
