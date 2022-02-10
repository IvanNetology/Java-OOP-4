package ru.netology.domain;

public class PosterManager {
    private SelectedMovie[] movies = new SelectedMovie[0];
    private int limit = 10;

    public PosterManager() {
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(SelectedMovie movie) {
        int length = movies.length + 1;
        SelectedMovie[] tmp = new SelectedMovie[length];

        System.arraycopy(movies, 0, tmp, 0, movies.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public SelectedMovie[] findAllMovie() {
        return movies;
    }

    public SelectedMovie[] showLastMovies() {

        int resultLength;
        if (limit > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        SelectedMovie[] result = new SelectedMovie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
