package cringez.zzz;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import java.util.Random;


public class crenge implements Listener {
    Random rand = new Random();


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        Component[] messages = new Component[]{
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.YELLOW), Component.text(" ragejoined ", NamedTextColor.YELLOW)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.YELLOW), Component.text(" Joined to ruin our runs! ", NamedTextColor.YELLOW)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.YELLOW), Component.text(" Joined, get IP-logged lmfao ", NamedTextColor.YELLOW)),
        };
        int luckyNumber = rand.nextInt(messages.length);
        Component luckyMessage = messages[luckyNumber];
        e.joinMessage(luckyMessage);
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        Component[] deezNutz = new Component[]{
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.AQUA), Component.text(" ragequit! ", NamedTextColor.AQUA)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.AQUA), Component.text(" left. Thank fuck. ", NamedTextColor.AQUA)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.AQUA), Component.text(" left. They were slow zz low IQ anyway.", NamedTextColor.AQUA)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.AQUA), Component.text(" Finally left", NamedTextColor.AQUA)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.AQUA), Component.text(" left. Good riddance!", NamedTextColor.AQUA)),
        };
        Random rand = new Random();
        int luckyLoser = rand.nextInt(deezNutz.length);
        Component zzzNoob = deezNutz[luckyLoser];
        e.quitMessage(zzzNoob);
    }
    }