package com.bc.search.similarity.custom.factory;

import com.bc.search.similarity.custom.NoTFSimilarity;
import org.apache.lucene.search.similarities.Similarity;
import org.apache.solr.search.similarities.DefaultSimilarityFactory;

/**
 * Created by two8g on 16-9-21.
 */
public class NoTFSimilarityFactory extends DefaultSimilarityFactory {
    @Override
    public Similarity getSimilarity() {
        return new NoTFSimilarity();
    }
}
