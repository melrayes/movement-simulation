package com.robot.util;

import com.robot.model.command.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Move commands script parser.
 */
@Service
public class MoveCommandsScriptParser {

    /**
     * Parse a script.
     *
     * @param script the script
     * @return the list of commands
     */
    public List<MoveCommand> parse(String script) {
        String lines[] = script.split("\\r?\\n");
        return Arrays.stream(lines).filter(line -> !line.isEmpty()).
                map(this::buildCommand).collect(Collectors.toList());
    }

    /**
     * Command Factory.
     *
     * @param commandString the command string
     * @return the move command
     */
    public MoveCommand buildCommand(String commandString) {
        String parts[] = commandString.trim().split("\\s+");

        // TODO validate the parts length in each command case
        if (parts[0].equals(InitializePositionCommand.name)) {
            return new InitializePositionCommand(Integer.parseInt(parts[1]),
                    Integer.parseInt(parts[2]), parts[3]);
        } else if (parts[0].equals(ForwardCommand.name)) {
            return new ForwardCommand(Integer.parseInt(parts[1]));
        } else if (parts[0].equals(WaitCommand.name)) {
            return new WaitCommand();
        } else if (parts[0].equals(TurnaroundCommand.name)) {
            return new TurnaroundCommand();
        } else if (parts[0].equals(RightCommand.name)) {
            return new RightCommand();
        }

        return null;
    }
}

