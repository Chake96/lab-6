package pokerBase;

import java.util.ArrayList;

import domain.CardDomainModel;
import domain.GameRuleCardsDomainModel;
import domain.GameRuleDomainModel;
import enums.eGame;
import enums.eRank;
import enums.eSuit;

public class Rule {

	private int MaxNumberOfPlayers;
	private int PlayerNumberOfCards;
	private int NumberOfJokers;
	private int PlayerCardsMin;
	private int PlayerCardsMax;
	private int CommunityCardsMin;
	private int CommunityCardsMax;
	private int PossibleHandCombinations;
	private int iCardsToDraw;
	private ArrayList<CardDomainModel> RuleCards = new ArrayList<CardDomainModel>();
	private GameRuleDomainModel Game;
	private GameRuleCardsDomainModel gmeRuleCards = new GameRuleCardsDomainModel();

	public Rule(GameRuleDomainModel gme) {
		this.Game = gme;
			this.MaxNumberOfPlayers = gme.getMAXNUMBEROFPLAYERS();
			this.PlayerNumberOfCards = gme.getPLAYERNUMBEROFCARDS();
			this.NumberOfJokers = 0;
			this.PlayerCardsMin = gme.getPLAYERCARDSMIN();
			this.PlayerCardsMax = gme.getPLAYERCARDSMAX();
			this.CommunityCardsMin = gme.getCOMMUNITYCARDSMAX();
			this.CommunityCardsMax = gme.getCOMMUNITYCARDSMIN();	
			this.PossibleHandCombinations = gme.getPOSSIBLEHANDCOMBINATIONS();
			this.iCardsToDraw = gmeRuleCards.getPICKORDER();		
	}
	

	public int GetMaxNumberOfPlayers() {
		return this.MaxNumberOfPlayers;
	}

	public int GetPlayerNumberOfCards() {
		return this.PlayerNumberOfCards;
	}

	public int GetNumberOfJokers() {
		return this.NumberOfJokers;
	}
	
	public int GetCommunityCardsCount()
	{
		return this.CommunityCardsMax;
	}
	
	public ArrayList<CardDomainModel> GetRuleCards()
	{
		return this.RuleCards;
	}
	public GameRuleDomainModel GetGame()
	{
		return this.Game;
	}

	public int getCommunityCardsMin() {
		return CommunityCardsMin;
	}

	public void setCommunityCardsMin(int communityCardsMin) {
		CommunityCardsMin = communityCardsMin;
	}

	public int getCommunityCardsMax() {
		return CommunityCardsMax;
	}

	public void setCommunityCardsMax(int communityCardsMax) {
		CommunityCardsMax = communityCardsMax;
	}

	public int getPlayerCardsMin() {
		return PlayerCardsMin;
	}

	public void setPlayerCardsMin(int playerCardsMin) {
		PlayerCardsMin = playerCardsMin;
	}

	public int getPlayerCardsMax() {
		return PlayerCardsMax;
	}
	
	public int getTotalCardsToDraw()
	{
		return this.GetPlayerNumberOfCards() + this.getCommunityCardsMax();
	}

	public void setPlayerCardsMax(int playerCardsMax) {
		PlayerCardsMax = playerCardsMax;
	}

	public int getPossibleHandCombinations() {
		return PossibleHandCombinations;
	}

	public void setPossibleHandCombinations(int possibleHandCombinations) {
		PossibleHandCombinations = possibleHandCombinations;
	}

	public int getiCardsToDraw() {
		return iCardsToDraw;
	}

	public void setiCardsToDraw(int iCardsToDraw) {
		this.iCardsToDraw = iCardsToDraw;
	}
	
}