# 试验nacos  
非spring-boot使用

## 一些坑

1. ```@NacosPropertySource```中```dataId```不能使用占位符；但是xml的可以  
1. ```@PropertySource```比```property-placeholder```生效早，于是可在nacos启动阶段让占位符被解析；  
   实际上可以看到，两种情况下，```Environment```下的```PropertySource```分别为3个和2个，多的即为配置文件的