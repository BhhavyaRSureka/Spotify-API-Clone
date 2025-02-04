// Test generated by RoostGPT for test Spotify-Test using AI Type Open AI and AI Model gpt-4

package com.csc301.profilemicroservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DbQueryStatus_getdbQueryExecResult_f073ae8dd0_Test {

    @Mock
    private DbQueryStatus dbQueryStatus;

    @InjectMocks
    private DbQueryExecResult dbQueryExecResult;

    @BeforeEach
    public void setUp() {
        when(dbQueryStatus.getdbQueryExecResult()).thenReturn(dbQueryExecResult);
    }

    @Test
    public void testGetdbQueryExecResult_Success() {
        DbQueryExecResult result = dbQueryStatus.getdbQueryExecResult();
        assertEquals(dbQueryExecResult, result);
    }

    @Test
    public void testGetdbQueryExecResult_Failure() {
        DbQueryExecResult result = dbQueryStatus.getdbQueryExecResult();
        assertEquals(null, result);
    }
}
