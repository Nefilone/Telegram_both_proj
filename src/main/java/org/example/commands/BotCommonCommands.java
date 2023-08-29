package org.example.commands;

public class BotCommonCommands {
    @AppBotCommand(name = "Привет", description = "when request hello", showInHelp = true)
    String hello() {
        return "Оу! Привет, давно не виделись!";
    }

    @AppBotCommand(name = "Пока", description = "when request bye", showInHelp = true)
    String bye() {
        return "Уже уходите? Ну пока!";
    }

    @AppBotCommand(name = "help", description = "when request help", showInKeyboard = true)
    String help() {
        return "HEEEEELP";
    }
}
