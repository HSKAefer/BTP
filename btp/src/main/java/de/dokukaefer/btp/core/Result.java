package de.dokukaefer.btp.core;

/**
 * association class. Required to save the points from each team for a specific game
 * @author D066730
 */
//@Entity
//@Table(name = "RESULTS")
//@IdClass(ResultId.class)
public class Result {

//	@Id
//	@Column(name = "GAME_ID")
//	private Long gameId;
//	
//	@Id
//	@Column(name = "TEAM_ID")
//	private Long teamId;
//	
//	@Column(name = "POINTS")
//	private Integer points;
//	
//	@ManyToOne
//	@PrimaryKeyJoinColumn(name="TEAM_ID", referencedColumnName="ID")
//	private Team team;
//	
//	@ManyToOne
//	@PrimaryKeyJoinColumn(name="GAME_ID", referencedColumnName="ID")
//	private Game game;
//
//	public Long getGameId() {
//		return gameId;
//	}
//
//	public void setGameId(Long gameId) {
//		this.gameId = gameId;
//	}
//
//	public Long getTeamId() {
//		return teamId;
//	}
//
//	public void setTeamId(Long teamId) {
//		this.teamId = teamId;
//	}
//
//	public Integer getPoints() {
//		return points;
//	}
//
//	public void setPoints(Integer points) {
//		this.points = points;
//	}
//
//	public Team getTeam() {
//		return team;
//	}
//
//	public void setTeam(Team team) {
//		this.team = team;
//	}
//
//	public Game getGame() {
//		return game;
//	}
//
//	public void setGame(Game game) {
//		this.game = game;
//	}
//	
	
	
//	 // composite-id key
//	private ResultId primaryKey = new ResultId();
//	//additional Fields
//	private Integer points;
//	
//	@EmbeddedId
//	public ResultId getPrimaryKey() {
//		return primaryKey;
//	}
//	
//	 @Transient
//	    public Team getTeam() {
//	        return getPrimaryKey().getTeam();
//	    }
//	
//	 @Transient
//	    public Game getGame() {
//	        return getPrimaryKey().getGame();
//	    }
//	
//	 @Column(name = "POINTS")
//	 public Integer getPoints() {
//		 return this.points;
//	 }
//	 
//	 //--------------------setter---------------------------------
//	 
//		public void setPrimaryKey(ResultId primaryKey) {
//	        this.primaryKey = primaryKey;
//	    }
//		
//		public void setTeam(Team team) {
//	        getPrimaryKey().setTeam(team);
//	    }
//	 
//	 public void setGame(Game game) {
//	        getPrimaryKey().setGame(game);
//	    }
//
//	public void setPoints(Integer points) {
//		this.points = points;
//	}
	 
	 
}
