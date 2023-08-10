// Test generated by RoostGPT for test Spotify-Test using AI Type Open AI and AI Model gpt-4

package com.csc301.profilemicroservice;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.neo4j.driver.v1.*;

public class PlaylistDriverImpl_InitPlaylistDb_47af881571_Test {

    @Mock
    private Driver driver;

    @Mock
    private Session session;

    @Mock
    private Transaction transaction;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(driver.session()).thenReturn(session);
        when(session.beginTransaction()).thenReturn(transaction);
        ProfileMicroserviceApplication.driver = driver;
    }

    @Test
    public void testInitPlaylistDb_Success() {
        String queryStr = "CREATE CONSTRAINT ON (nPlaylist:playlist) ASSERT exists(nPlaylist.plName)";

        doNothing().when(transaction).run(queryStr);
        doNothing().when(transaction).success();
        doNothing().when(session).close();

        assertDoesNotThrow(() -> ProfileMicroserviceApplication.InitPlaylistDb());

        verify(transaction, times(1)).run(queryStr);
        verify(transaction, times(1)).success();
        verify(session, times(1)).close();
    }

    @Test
    public void testInitPlaylistDb_Failure() {
        String queryStr = "CREATE CONSTRAINT ON (nPlaylist:playlist) ASSERT exists(nPlaylist.plName)";

        doThrow(new RuntimeException()).when(transaction).run(queryStr);

        assertThrows(RuntimeException.class, () -> ProfileMicroserviceApplication.InitPlaylistDb());

        verify(transaction, times(1)).run(queryStr);
        verify(transaction, never()).success();
        verify(session, times(1)).close();
    }
}
