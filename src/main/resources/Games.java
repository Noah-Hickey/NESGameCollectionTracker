public class Games {

    // Declare Values //
        private long id;
        private String gameTitle;
        private int releaseYear;
        private String gameGenre;
        private int personalRating; // Out of 10 //
        private String personalAnecdote; // My experience/ overall feelings about the game //


        // No-arg Constructor //
        public Game() {}

        // Constructor //
        public Game(long id, String gameTitle, int releaseYear, String gameGenre, int personalRating, String personalAnecdote) {
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

        public void setReleaseYear(String releaseYear){
            this.releaseYear = releaseYear;
        }

        public void setGameGenre(String gameGenre){
            this.gameGenre = gameGenre;
        }

        public void setPersonalRating(String personalRating){
            this.personalRating = personalRating;
        }

        public void set PersonalAnecdote(String personalAnecdote){
            this.personalAnecdote = personalAnecdote;
        }

        @Override
                public String toString() {
            return "id: " + id;
            return "Title: " + gameTitle;
            return "ReleaseYear: " + releaseYear;
            return "Genre: " + gameGenre;
            return "Personal Rating: " + personalRating;
            return "Personal Anecdote: " + personalAnecdote;

        }

}
