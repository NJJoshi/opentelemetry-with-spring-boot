package com.nj.actor.mapper;

import com.nj.actor.dto.ActorDto;
import com.nj.actor.entity.Actor;

public class EntityDtoMapper {

    public static ActorDto toDto(Actor actor){
        return new ActorDto(
                actor.getId(),
                actor.getName()
        );
    }

}
