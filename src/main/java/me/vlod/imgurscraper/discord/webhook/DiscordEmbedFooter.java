package me.vlod.imgurscraper.discord.webhook;

public class DiscordEmbedFooter {
	public String text;
	
	public DiscordEmbedFooter(String text) {
		this.text = text;
	}
	
	public String getText() {
		return this.text;
	}
}
