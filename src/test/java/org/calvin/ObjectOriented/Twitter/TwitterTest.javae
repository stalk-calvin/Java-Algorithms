/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.ObjectOriented.Twitter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import com.google.common.collect.Lists;

@RunWith(MockitoJUnitRunner.class)
public class TwitterTest {
    private Twitter fixture;

    @Mock
    Map<Integer, User> userMap;

    @Before
    public void setUp() throws Exception {
        fixture = new Twitter(userMap);
    }

    @Test
    public void shouldTweetAndGetNewsFeed() throws Exception {
        fixture = new Twitter(new HashMap<>());
        fixture.postTweet(1, 5);
        List<Integer> actual = fixture.getNewsFeed(1);
        List<Integer> expected = Lists.newArrayList(5);
        assertEquals(expected, actual);
        fixture.postTweet(1, 4);
        actual = fixture.getNewsFeed(1);
        expected = Lists.newArrayList(4, 5);
        assertEquals(expected, actual);
        fixture.postTweet(1, 3);
        actual = fixture.getNewsFeed(1);
        expected = Lists.newArrayList(3, 4, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldBehaveFollow() throws Exception {
        User mockedUser = mock(User.class);
        when(userMap.get(1)).thenReturn(mockedUser);
        fixture.follow(1, 2);
        verify(userMap, times(1)).get(1);
        verify(mockedUser).follow(2);
    }

    @Test
    public void shouldBehaveUnfollow() throws Exception {
        User mockedUser = mock(User.class);
        fixture.unfollow(1, 2);
        when(userMap.get(1)).thenReturn(mockedUser);
        when(userMap.containsKey(1)).thenReturn(true);
        fixture.unfollow(1, 2);
        verify(userMap, times(1)).get(1);
        verify(mockedUser).unfollow(2);
    }

}