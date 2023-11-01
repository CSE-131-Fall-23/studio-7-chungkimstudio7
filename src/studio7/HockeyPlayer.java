package studio7;

/**
 * The HockeyPlayer class represents a hockey player with a name, jersey number, and playing statistics.
 */
public class HockeyPlayer {
    private String name;
    private int jerseyNumber;
    private int goals;
    private int assists;
    private int gamesPlayed;

    /**
     * Constructs a new HockeyPlayer with the specified name and jersey number.
     *
     * @param name        The name of the hockey player.
     * @param jerseyNumber The jersey number of the player.
     */
    public HockeyPlayer(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    /**
     * Records the player's performance in a game, including the number of goals and assists earned.
     *
     * @param goals   The number of goals scored in the game.
     * @param assists The number of assists earned in the game.
     */
    public void completeGame(int goals, int assists) {
        this.goals += goals;
        this.assists += assists;
        this.gamesPlayed++;
    }

    /**
     * Calculates and returns the total points (goals + assists) of the player.
     *
     * @return The total points earned by the player.
     */
    public int getTotalPoints() {
        return goals + assists;
    }

    /**
     * Gets the total number of games played by the player.
     *
     * @return The total number of games played.
     */
    public int getGamesPlayed() {
        return gamesPlayed;
    }
}
