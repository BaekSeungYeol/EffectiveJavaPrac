package me.prac.Book.Item20;

public interface Singer {
    AutoClip sing(Song s);
}

interface Songwriter {
    Song compose(int chartPosition);
}

interface SingerSongwriter extends Singer, Songwriter {
    @Override
    AutoClip sing(Song s);

    @Override
    Song compose(int chartPosition);
}

class Song {}
class AutoClip {}