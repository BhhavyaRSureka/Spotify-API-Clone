// Test generated by RoostGPT for test Spotify-Test using AI Type Open AI and AI Model gpt-4

package com.csc301.profilemicroservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.Transaction;

public class ProfileDriverImpl_followFriend_770dc07b9b_Test {

    @Mock
    Driver driver;
    @Mock
    Session session;
    @Mock
    Transaction transaction;
    @Mock
    StatementResult statementResult;
    @Mock
    Record record;

    @InjectMocks
    ProfileDriverImpl profileDriverImpl;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(driver.session()).thenReturn(session);
        when(session.beginTransaction()).thenReturn(transaction);
    }

    @Test
    public void testFollowFriend_Success() {
        when(transaction.run(anyString(), anyMap())).thenReturn(statementResult);
        when(statementResult.hasNext()).thenReturn(true);
        when(statementResult.next()).thenReturn(record);
        when(record.get("bool").asBoolean()).thenReturn(false);

        DbQueryStatus result = profileDriverImpl.followFriend("user1", "user2");

        assertEquals(DbQueryExecResult.QUERY_OK, result.getdbQueryExecResult());
    }

    @Test
    public void testFollowFriend_UserDoesNotExist() {
        when(transaction.run(anyString(), anyMap())).thenReturn(statementResult);
        when(statementResult.hasNext()).thenReturn(false);

        DbQueryStatus result = profileDriverImpl.followFriend("user1", "user2");

        assertEquals(DbQueryExecResult.QUERY_ERROR_GENERIC, result.getdbQueryExecResult());
    }

    @Test
    public void testFollowFriend_AlreadyFollowed() {
        when(transaction.run(anyString(), anyMap())).thenReturn(statementResult);
        when(statementResult.hasNext()).thenReturn(true);
        when(statementResult.next()).thenReturn(record);
        when(record.get("bool").asBoolean()).thenReturn(true);

        DbQueryStatus result = profileDriverImpl.followFriend("user1", "user2");

        assertEquals(DbQueryExecResult.QUERY_ERROR_GENERIC, result.getdbQueryExecResult());
    }

    @Test
    public void testFollowFriend_ExceptionThrown() {
        when(transaction.run(anyString(), anyMap())).thenThrow(new RuntimeException());

        DbQueryStatus result = profileDriverImpl.followFriend("user1", "user2");

        assertEquals(DbQueryExecResult.QUERY_ERROR_GENERIC, result.getdbQueryExecResult());
    }
}
