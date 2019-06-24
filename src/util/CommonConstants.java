package src.util;

import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/5/13 22:24
 * @Version: 1.0
 */
public class CommonConstants {
    public static final SerializerFeature[] FEATURES = new SerializerFeature[]{
            SerializerFeature.PrettyFormat,
            SerializerFeature.WriteDateUseDateFormat,
            SerializerFeature.WriteNullStringAsEmpty,
            SerializerFeature.WriteMapNullValue,
            SerializerFeature.WriteNullListAsEmpty,
            SerializerFeature.DisableCircularReferenceDetect};
}
