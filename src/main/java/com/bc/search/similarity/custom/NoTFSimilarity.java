package com.bc.search.similarity.custom;

import org.apache.lucene.index.FieldInvertState;
import org.apache.lucene.search.similarities.DefaultSimilarity;

/**
 * Created by two8g on 16-9-21.
 */
public class NoTFSimilarity extends DefaultSimilarity {
    public NoTFSimilarity() {
    }

    @Override
    public float tf(float freq) {
        return 1.0f;
    }


    @Override
    public float idf(long docFreq, long numDocs) {
        return 1.0f;
    }

    @Override
    public float queryNorm(float sumOfSquaredWeights) {
        return 1.0f;
    }

    @Override
    public float lengthNorm(FieldInvertState state) {
        return 1.0f;
    }

    @Override
    public String toString() {
        return "NoTFSimilarity";
    }
}
