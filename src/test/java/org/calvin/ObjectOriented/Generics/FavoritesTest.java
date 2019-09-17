package org.calvin.ObjectOriented.Generics;

import org.junit.Test;

import static org.junit.Assert.*;

public class FavoritesTest {
    private Favorites f = new Favorites();

    @Test
    public void shouldAddPullFavorite() {
        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class, 0xcafebabe);
        f.putFavorite(Class.class, Favorites.class);

        assertEquals("Java", f.getFavorite(String.class));
        assertEquals("cafebabe", String.format("%x", f.getFavorite(Integer.class)));
        assertEquals(Favorites.class, f.getFavorite(Class.class));
    }
}