package cringez.zzz;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.ComponentLike;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;



import java.awt.*;
import java.util.Random;
import java.util.Set;

public class crenge implements Listener {
    Random rand = new Random();


    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        Component[] messages = new Component[]{
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.YELLOW), Component.text( " RageJoined ", NamedTextColor.YELLOW)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.YELLOW), Component.text( " Joined to ruin our runs! ", NamedTextColor.YELLOW)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.YELLOW), Component.text( " Joined, get Iplogged lmfao ", NamedTextColor.YELLOW))

    };
        int luckyNumber = rand.nextInt(messages.length);
        Component luckyMessage = messages[luckyNumber];
        e.joinMessage(luckyMessage);


    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        Component[] deezNutz = new Component[]{
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.AQUA), Component.text(" Ragequit! ", NamedTextColor.AQUA)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.AQUA), Component.text(" Thank fuck. ", NamedTextColor.AQUA)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.AQUA), Component.text(" Left. They were slow zz low IQ anyway.", NamedTextColor.AQUA)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.AQUA), Component.text(" Finally left", NamedTextColor.AQUA)),
                TextComponent.ofChildren(player.displayName().colorIfAbsent(NamedTextColor.AQUA), Component.text(" Left. Good riddance!", NamedTextColor.AQUA)),
        };
        Random zzzGarbo = new Random();
        int luckyLoser = zzzGarbo.nextInt(deezNutz.length);
        Component zzzNoob = deezNutz[luckyLoser];
        e.quitMessage(zzzNoob);


        }
    }










