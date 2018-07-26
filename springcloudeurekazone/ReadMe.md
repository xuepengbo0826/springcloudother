# <center>spring cloud eureka region</center>

#### 场景描述
> 在通常情况下，eureka集群足以满足各种需求，但为了更好的利用资源，那么我们在实际情况中有可能需要在某一个区域内优先使用本区域内的资源，那么就需要区域隔离，在eureka中，region配合zone就可以实现区域资源优先使用。

#### 说明
> eureka提供了region和zone两个概念来进行分区，这两个概念均来自于亚马逊的AWS<br/><br/>
> region：可以简单理解为地理上的分区，比如亚洲地区，或者华北地区，再或者北京等等，没有具体大小的限制。根据项目具体的情况，可以自行合理划分region。
<br/><br/>
>zone：可以简单理解为region内的具体机房。
![image](https://github.com/xuepengbo0826/springcloudother/blob/master/springcloudeurekazone/image/1159663-20180519215023456-112979241.png)
#### 解释
> 在北京这个大的区域下，创建了两个机房zone-1和zone-2，在这两个区中，分别有两个eureka服务端和客户端，当zone-1中的consumer消费北京区域下的服务时，由于区的配置关系，所以会优先消费zone-1中的服务，只有当zone-1中的服务不可用时才会去消费北京区域下其他区中的服务。
