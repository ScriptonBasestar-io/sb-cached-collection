# bs-simple-cache-java


캐싱전략 1. 데이터 호출시 일정시간체크

init - 선언할 때 가져올지 처음쓸 때 가져올지<br/>
fifo<br/>
ttl<br/> 
loadOne : sync/async - 새 데이터를 조회할 때 기다릴지 이전걸 가져갈지<br/>
이전걸 가져가는 경우 최초 데이터라면<br/>
refresh : one/all - 한개씩 가져올지 전체 다 가져올지


https://hazelcast.org/ 이거참고 또는 이용


https://github.com/google/guava/wiki/CachesExplained<br/>
이런게 있어서 일시중지
