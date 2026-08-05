package com.codingshuttle.projects.lovable_clone.entity;
import com.codingshuttle.projects.lovable_clone.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessages {
    //AI generated

    //chatsession contains chatmessages

    Long id;

    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolCalls; //JSON array of tools

    Integer tokenUsed;

    Instant createdAt;

}
