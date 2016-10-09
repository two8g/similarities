package com.bc.search.similarity.custom;

import com.bc.search.similarity.custom.util.Utils;
import org.apache.lucene.search.similarities.DefaultSimilarity;
import org.apache.lucene.util.BytesRef;

/**
 * Created by two8g on 16-10-9.
 */
public class PayloadSimilarity extends DefaultSimilarity {
    //词元长度计算词元权重
    private static final float[] boosts = {0.0f, 1.0f, 10.0f, 20.0f, 40.0f, 80.0f};
    private static final int maxBootsIndex = boosts.length - 1;

    public PayloadSimilarity() {
    }

    @Override
    public float scorePayload(int doc, int start, int end, BytesRef payload) {
        int length = Utils.bytes2Int(payload.bytes);
        return boosts[Math.min(length, maxBootsIndex)];
    }

    @Override
    public String toString() {
        return "PayloadSimilarity";
    }


}
