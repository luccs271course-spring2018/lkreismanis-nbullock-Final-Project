/*
 * SHAPE SHOOTER ARCADE GAME
 * by Larisa Kreismanis & Nathan Bullock
 * File Name: ArcadeFriendly.java
 * Description: File makes other arcade games accessible with this interface.
 * COMPLETED
*/

public interface ArcadeFriendly {

    //Returns true if game is in a "start" state.
    //Returns false if game is in a"paused", "stopped", "unstarted" state.
    public boolean running();

    //Starts game.
    //Sets a global boolean value so that the running method can return the appropriate value.
    public void startGame();

    //Stops timers, resets the score, and sets a running boolean to false.
    public void stopGame();

    //Stops timers but saves the score.
    //Sets boolean value to indicate game is not running. This value will be returned by the running method.
    public void pauseGame();

    //Returns game name.
    public String getGameName();

    //Returns game instructions.
    public String getInstructions();

    //Returns game authors.
    public String getCredits();

    //Returns current player's points.
    public int getPoints();
} //end class