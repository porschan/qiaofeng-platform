package com.chanchifeng.qiaofeng.graphql;

import graphql.GraphQL;

import java.util.Collections;
import java.util.Map;

/**
 * @author:porschan
 * @description:
 * @date: Created in 12:23 2018/12/19
 * @modified By:
 */

public class GraphqlFacade {
    private static final GraphqlProvider PROVIDER = new GraphqlProvider();
    private static final GraphQL GRAPH_QL = GraphQL.newGraphQL(PROVIDER.getSchema()).build();

    /**
     * query by the Graphql
     * @param ghql the query
     * @return the result
     */
    public static Map<String, Object> query(String ghql) {
        if (ghql == null || ghql.isEmpty()) {
            return Collections.emptyMap();
        }

        return GRAPH_QL.execute(ghql).getData();
    }
}
