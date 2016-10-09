package com.bc.search.similarity.custom.factory;

import com.bc.search.similarity.custom.PayloadSimilarity;
import org.apache.lucene.search.similarities.Similarity;
import org.apache.solr.search.similarities.DefaultSimilarityFactory;

/**
 * Created by two8g on 16-10-9.
 */
public class PayloadSimilarityFactory extends DefaultSimilarityFactory {
    @Override
    public Similarity getSimilarity() {
        return new PayloadSimilarity();
    }
}
