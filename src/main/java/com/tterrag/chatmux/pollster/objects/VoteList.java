package com.tterrag.chatmux.pollster.objects;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.Value;

@Value
public class VoteList {
    
    Vote[] votes;
    
    @JsonCreator
    public VoteList(Vote... votes) {
        this.votes = votes;
    }
}