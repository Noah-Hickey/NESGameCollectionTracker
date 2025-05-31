package com.noah.videogamecollection;

public class Games {

    // Declare Values //
        private long id;
        private String gameTitle;
        private int releaseYear;
        private String gameGenre;
        private int personalRating; // Out of 10 //
        private String personalAnecdote; // My experience/ overall feelings about the game //


        // No-arg Constructor //
        public Games() {}

        // Constructor //
        public Games(long id, String gameTitle, int releaseYear, String gameGenre, int personalRating, String personalAnecdote) {
            this.id = id;
            this.gameTitle = gameTitle;
            this.releaseYear = releaseYear;
            this.gameGenre = gameGenre;
            this.personalRating = personalRating;
            this.personalAnecdote = personalAnecdote;

        }

        // Getters //

        public long getId(){
            return id;
        }

        public String getGameTitle() {
            return gameTitle;
        }

        public int getReleaseYear() {
            return releaseYear;
        }

        public String getGameGenre() {
            return gameGenre;
        }

        public int getPersonalRating() {
            return personalRating;
        }

        public String getPersonalAnecdote() {
            return personalAnecdote;
        }

        // Setters //

        public void setId(long id) {
            this.id = id;
        }

        public void setGameTitle(String gameTitle){
            this.gameTitle = gameTitle;
        }

        public void setReleaseYear(int releaseYear){
            this.releaseYear = releaseYear;
        }

        public void setGameGenre(String gameGenre){
            this.gameGenre = gameGenre;
        }

        public void setPersonalRating(int personalRating){
            this.personalRating = personalRating;
        }

        public void setPersonalAnecdote(String personalAnecdote){
            this.personalAnecdote = personalAnecdote;
        }

        @Override
                public String toString() {
            return "id: " + id + "\n" +
            "Title: " + gameTitle + "\n" +
            "ReleaseYear: " + releaseYear + "\n" +
            "Genre: " + gameGenre + "\n" +
            "Personal Rating: " + personalRating + "\n" +
            "Personal Anecdote: " + personalAnecdote;

        }

}
