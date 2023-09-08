public class Album {
    String title;
    String performer;
    String genre;
    int numSongs;

    public Album(){
        title = "Renaissance";
        performer = "Beyonce";
        genre = "easy listening";
        numSongs = 10;
    }


    public String toString(){
        return "title: " + title + "\nperformer: " + performer + "\ngenre: " + genre + "\nNumber of Songs: " + numSongs;
    }

    public boolean isLong(){
        if (numSongs > 50) {
            System.out.println("Exceeded maximum song number");
            return true;
        }
        else if (numSongs < 10){
            numSongs = 10;
            return true;
            }

            else {
            System.out.println("isLong_Success"); // test of isLong method
                return false;
        }
    }

    public String getTitle(){
        return title;
    }

    public String getPerformer(){
        return performer;
    }

    public String getGenre(){
        return genre;
    }

    public int getNumSongs(){  // is this proper titling?
        return numSongs;
    }

    public void setTitle(String titleInput){
        this.title = titleInput;
    }

    public void setPerformer(String performerInput){
        this.performer = performerInput;
    }

    public void setGenre(String genreInput){
        this.genre = genreInput;
    }

    public void setNumSongs(int songInput){
        this.numSongs = songInput;
    }
}
