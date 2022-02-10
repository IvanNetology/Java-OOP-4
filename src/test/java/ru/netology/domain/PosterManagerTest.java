package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {

    @Test
    public void saveNewMovie() {
        SelectedMovie first = new SelectedMovie(1, "film1", "comedy");

        PosterManager manager = new PosterManager();
        manager.add(first);

        SelectedMovie[] expected = {first};
        SelectedMovie[] actual = manager.findAllMovie();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllMovies() {
        SelectedMovie first = new SelectedMovie(1, "film1", "fantasy");
        SelectedMovie second = new SelectedMovie(2, "film2", "thriller");
        SelectedMovie third = new SelectedMovie(3, "film3", "comedy");

        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);

        SelectedMovie[] expected = {first, second, third};
        SelectedMovie[] actual = manager.findAllMovie();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseWhenMoviesOneLimitNo() {
        SelectedMovie first = new SelectedMovie(1, "film1", "comedy");

        PosterManager manager = new PosterManager();
        manager.add(first);

        SelectedMovie[] expected = {first};
        SelectedMovie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseWhenMoviesNineLimitNo() {
        SelectedMovie first = new SelectedMovie(1, "film1", "comedy");
        SelectedMovie second = new SelectedMovie(2, "film2", "thriller");
        SelectedMovie third = new SelectedMovie(3, "film3", "drama");
        SelectedMovie fourth = new SelectedMovie(4, "film4", "fantasy");
        SelectedMovie fifth = new SelectedMovie(5, "film5", "trill");
        SelectedMovie sixth = new SelectedMovie(6, "film6", "comedy");
        SelectedMovie seventh = new SelectedMovie(7, "film7", "fantasy");
        SelectedMovie eighth = new SelectedMovie(8, "film8", "comedy");
        SelectedMovie ninth = new SelectedMovie(9, "film9", "thriller");

        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);

        SelectedMovie[] expected = {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        SelectedMovie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseWhenMoviesTenLimitNo() {
        SelectedMovie first = new SelectedMovie(1, "film1", "comedy");
        SelectedMovie second = new SelectedMovie(2, "film2", "thriller");
        SelectedMovie third = new SelectedMovie(3, "film3", "drama");
        SelectedMovie fourth = new SelectedMovie(4, "film4", "fantasy");
        SelectedMovie fifth = new SelectedMovie(5, "film5", "trill");
        SelectedMovie sixth = new SelectedMovie(6, "film6", "comedy");
        SelectedMovie seventh = new SelectedMovie(7, "film7", "fantasy");
        SelectedMovie eighth = new SelectedMovie(8, "film8", "comedy");
        SelectedMovie ninth = new SelectedMovie(9, "film9", "thriller");
        SelectedMovie tenth = new SelectedMovie(10, "film10", "fantasy");

        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        SelectedMovie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        SelectedMovie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseWhenMoviesElevenLimitNo() {
        SelectedMovie first = new SelectedMovie(1, "film1", "comedy");
        SelectedMovie second = new SelectedMovie(2, "film2", "thriller");
        SelectedMovie third = new SelectedMovie(3, "film3", "drama");
        SelectedMovie fourth = new SelectedMovie(4, "film4", "fantasy");
        SelectedMovie fifth = new SelectedMovie(5, "film5", "trill");
        SelectedMovie sixth = new SelectedMovie(6, "film6", "comedy");
        SelectedMovie seventh = new SelectedMovie(7, "film7", "fantasy");
        SelectedMovie eighth = new SelectedMovie(8, "film8", "comedy");
        SelectedMovie ninth = new SelectedMovie(9, "film9", "thriller");
        SelectedMovie tenth = new SelectedMovie(10, "film10", "fantasy");
        SelectedMovie eleventh = new SelectedMovie(11, "film11", "thriller");

        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        SelectedMovie[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        SelectedMovie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseWhenMoviesOneLimitSeven() {
        SelectedMovie first = new SelectedMovie(1, "film1", "comedy");

        PosterManager manager = new PosterManager(7);
        manager.add(first);

        SelectedMovie[] expected = {first};
        SelectedMovie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseWhenMoviesSixLimitSeven() {
        SelectedMovie first = new SelectedMovie(1, "film1", "comedy");
        SelectedMovie second = new SelectedMovie(2, "film2", "thriller");
        SelectedMovie third = new SelectedMovie(3, "film3", "drama");
        SelectedMovie fourth = new SelectedMovie(4, "film4", "fantasy");
        SelectedMovie fifth = new SelectedMovie(5, "film5", "trill");
        SelectedMovie sixth = new SelectedMovie(6, "film6", "comedy");

        PosterManager manager = new PosterManager(7);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);

        SelectedMovie[] expected = {sixth, fifth, fourth, third, second, first};
        SelectedMovie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseWhenMoviesSevenLimitSeven() {
        SelectedMovie first = new SelectedMovie(1, "film1", "comedy");
        SelectedMovie second = new SelectedMovie(2, "film2", "thriller");
        SelectedMovie third = new SelectedMovie(3, "film3", "drama");
        SelectedMovie fourth = new SelectedMovie(4, "film4", "fantasy");
        SelectedMovie fifth = new SelectedMovie(5, "film5", "trill");
        SelectedMovie sixth = new SelectedMovie(6, "film6", "comedy");
        SelectedMovie seventh = new SelectedMovie(7, "film7", "fantasy");

        PosterManager manager = new PosterManager(7);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);


        SelectedMovie[] expected = {seventh, sixth, fifth, fourth, third, second, first};
        SelectedMovie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showReverseWhenMoviesEightLimitSeven() {
        SelectedMovie first = new SelectedMovie(1, "film1", "comedy");
        SelectedMovie second = new SelectedMovie(2, "film2", "thriller");
        SelectedMovie third = new SelectedMovie(3, "film3", "drama");
        SelectedMovie fourth = new SelectedMovie(4, "film4", "fantasy");
        SelectedMovie fifth = new SelectedMovie(5, "film5", "trill");
        SelectedMovie sixth = new SelectedMovie(6, "film6", "comedy");
        SelectedMovie seventh = new SelectedMovie(7, "film7", "fantasy");
        SelectedMovie eighth = new SelectedMovie(8, "film8", "comedy");

        PosterManager manager = new PosterManager(7);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);


        SelectedMovie[] expected = {eighth, seventh, sixth, fifth, fourth, third, second};
        SelectedMovie[] actual = manager.showLastMovies();
        assertArrayEquals(expected, actual);
    }
}