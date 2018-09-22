package ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;
import ssm.dto.ScenicSpotIntroduceInfo;
import ssm.dto.SearchScenicSpotInfo;
import ssm.dto.VoiceExplainInfo;
import ssm.entity.ScenicSpot;

import java.util.List;

public interface ScenicSpotDao {

    //ONLY TEST ORIGINALLY
    List<ScenicSpot> findARecord();

    /**
     * 选取距此经纬度距离最近的十个地点
     * @param longitude
     * @param dimension
     * @return
     */
    List<ScenicSpot> findMostNearScenicSpot(@Param("longitude") float longitude, @Param("dimension") float dimension);

    /** 语音讲解
     * 发{位置信息 -- 经纬度} -- 收{景点名称，景点介绍}
     * @param longitude
     * @param dimension
     * @return
     */
    VoiceExplainInfo findVoiceExplainInfoByLocation(@Param("longitude") float longitude, @Param("dimension") float dimension);

    /**
     * 语音助手，获取匹配地点
     * @param helper
     * @return
     */
    String findVoiceHelperDistinguish(@Param("helper") String helper);

    /**
     * 获取景点的信息
     * @param scenicSpotId
     * @return
     */
    ScenicSpotIntroduceInfo findScenicSpotIntroduceInfo(@Param("scenicSpotId") int scenicSpotId);

    /**
     * 搜索景点名称较相似的十个景点
     * @param name
     * @return
     */
    List<SearchScenicSpotInfo> searchScenicSpotByName(@Param("name") String name);

    /**
     * 从数据库中随机选取十个景点
     * @return
     */
    List<SearchScenicSpotInfo> searchScenicSpotRandom();

}
